package com.companion.assitCoach.service;

import com.companion.assitCoach.model.Player;
import com.companion.assitCoach.repository.playerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class PlayerService {

    private final playerRepository PlayerRepository;
    public List<Player> getAllPlayers() {
        return PlayerRepository.findAll();
    }

    public Player addPlayer(Player player) {
        return PlayerRepository.insert(player);
    }

    public Player getPlayerById(Long id) {
        return PlayerRepository.findById(id).get();
    }

    public Player updatePlayer(Player player) {
        return PlayerRepository.save(player);
    }

    public void getPlayerByName(String name) {
        PlayerRepository.findByName(name);
    }
    public void deletePlayer(Long id) {
        PlayerRepository.deleteById(id);
    }

/*    public List<Player> getPlayersByTeam(String team) {
        //return PlayerRepository.findByTeam(team);
    }*/
}
