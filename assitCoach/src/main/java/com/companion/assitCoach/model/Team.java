package com.companion.assitCoach.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document(collection = "team")
public class Team {
    @Id
    private String id;
    private String teamName;
    private String teamDescription;
    private String coachName;
    private String coachNumber;
    private List<Player> players;

    public Team(String teamName, String teamDescription, String coachName, String coachNumber, List<Player> players) {
        this.teamName = teamName;
        this.teamDescription = teamDescription;
        this.coachName = coachName;
        this.coachNumber = coachNumber;
        this.players = players;
    }
}
