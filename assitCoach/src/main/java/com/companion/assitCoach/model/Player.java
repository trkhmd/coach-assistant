package com.companion.assitCoach.model;

import com.companion.assitCoach.Stats;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

@Data
@Document(collection = "player")
public class Player {
    @Id
    private String id;

    private Integer Number;
    private String firstName;
    private String lastName;
    private Integer age;
    private String position;
    private String team;
    private Stats stats;

    public Player(String firstName, String lastName, Integer age, String position, String team, Stats stats,Integer number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.team = team;
        this.stats = stats;
        this.Number=number;
    }
}
