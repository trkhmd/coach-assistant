package com.companion.assitCoach.repository;

import com.companion.assitCoach.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface playerRepository extends MongoRepository<Player, Long> {


    Optional<Player> findPlayerByNumber(int number);
    Optional<Player> findPlayerByLastName(String lastName);

    Optional<List<Player>> findAllByLastName(String lastName);

}
