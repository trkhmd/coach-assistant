package com.companion.assitCoach.controller;


import com.companion.assitCoach.model.Player;
import com.companion.assitCoach.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/player")
@AllArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @GetMapping("/all")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/find")
    public Player findPlayer(Long id) {
        return playerService.getPlayerById(id);
    }

    @PostMapping("/add")
    public String addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
        return "new player added";
    }


    @PostMapping("/update")
    public String updatePlayer(Player player) {
        playerService.updatePlayer(player);
        return "player updated";
    }

    @PostMapping("/delete")
    public String deletePlayer(Long id) {
        playerService.deletePlayer(id);
        return "player deleted";
    }

}
