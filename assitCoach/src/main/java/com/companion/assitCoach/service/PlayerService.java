package com.companion.assitCoach.service;

import com.companion.assitCoach.model.Player;
import com.companion.assitCoach.repository.playerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

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


    public void deletePlayer(Long id) {
        PlayerRepository.deleteById(id);
    }

/*    public List<Player> getPlayersByTeam(String team) {
        return PlayerRepository.findByTeam(team);
    }*/
    public Optional<Player> getPlayerByNumber(Integer number) {
        AtomicBoolean exists = new AtomicBoolean(false);
        PlayerRepository.findPlayerByNumber(number).ifPresentOrElse(player -> {
                System.out.println("Player with number " + number + " exists");
                exists.set(true);
    }, () -> {
                System.out.println("Player with number " + number + " does not exist");
        }
        );
        if (exists.get()) {
            return PlayerRepository.findPlayerByNumber(number);
        }
        return null;
    }   //end of getPlayerByNumber



    public Optional<Player> getPlayerByLastName(String lastname) {

        AtomicBoolean exists = new AtomicBoolean(false);
        PlayerRepository.findPlayerByLastName(lastname).stream().findFirst().ifPresentOrElse(player -> {
                    System.out.println("Player with lastname " + lastname + " exists");
                    exists.set(true);
                }, () -> {
                    System.out.println("Player with lastname " + lastname + " does not exist");
                }
        );
        if (exists.get()) {
            return PlayerRepository.findPlayerByLastName(lastname).stream().findFirst();

        }
        return Optional.empty();
    }

    public Optional<List<Player>> getAllPlayersByLastName(String lastname) {
        AtomicBoolean exists = new AtomicBoolean(false);
        PlayerRepository.findAllByLastName(lastname).ifPresentOrElse(player -> {
                    System.out.println("Player with lastname " + lastname + " exists");
                    exists.set(true);
                }, () -> {
                    System.out.println("Player with lastname " + lastname + " does not exist");
                }
        );
        if (exists.get()) {
            return PlayerRepository.findAllByLastName(lastname);
        }
        return Optional.empty();

    }

    }

