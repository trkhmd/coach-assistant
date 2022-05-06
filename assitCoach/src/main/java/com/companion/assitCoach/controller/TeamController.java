package com.companion.assitCoach.controller;

import com.companion.assitCoach.model.Team;
import com.companion.assitCoach.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/team")
@AllArgsConstructor//Sinon on doit faire un constructeur avec tous les arguments
public class TeamController {

    private final TeamService teamService;

    @GetMapping("/all")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @PostMapping("/add")
    public String addTeam(String teamName, String teamDescription, String coachName, String coachPhone) {
        teamService.createTeam(teamName, teamDescription, coachName, coachPhone);
        return "Team added";
    }

    @DeleteMapping("/delete")
    public String deleteTeam(Long id) {
        teamService.deleteTeam(id);
        return "Team deleted";
    }

    @PutMapping("/update")
    public String updateTeam(Long id, String teamName, String teamDescription, String coachName, String coachPhone) {
        teamService.updateTeam(id, teamName, teamDescription, coachName, coachPhone);
        return "Team updated";
    }

    @GetMapping("/{id}")
    public Team getTeam(@PathVariable Long id) {
        return teamService.getTeamById(id);
    }
}
