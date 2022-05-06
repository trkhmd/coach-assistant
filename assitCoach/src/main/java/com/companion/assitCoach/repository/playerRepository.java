package com.companion.assitCoach.repository;

import com.companion.assitCoach.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface playerRepository extends MongoRepository<Player, Long> {
    void findByName(String name);
}
