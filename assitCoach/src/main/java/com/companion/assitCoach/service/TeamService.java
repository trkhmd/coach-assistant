package com.companion.assitCoach.service;


import com.companion.assitCoach.model.Team;
import com.companion.assitCoach.repository.teamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TeamService {

    private final teamRepository TeamRepository;

    public List<Team> getAllTeams() {
        return TeamRepository.findAll();
    }

    public void createTeam(String teamName, String teamDescription, String coachName, String coachPhone) {
        TeamRepository.save(new com.companion.assitCoach.model.Team(teamName, teamDescription, coachName, coachPhone,List.of()));
    }

    public void deleteTeam(Long id) {
        TeamRepository.deleteById(id);
    }

    public void updateTeam(Long id, String teamName, String teamDescription, String coachName, String coachPhone) {
        TeamRepository.save(new com.companion.assitCoach.model.Team( teamName, teamDescription, coachName, coachPhone,List.of()));
    }

    public Team getTeamById(Long id) {
        return TeamRepository.findById(id).orElse(null);
    }

}
