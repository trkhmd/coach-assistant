package com.companion.assitCoach.repository;

import com.companion.assitCoach.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface teamRepository extends MongoRepository<Team, Long> {
}
