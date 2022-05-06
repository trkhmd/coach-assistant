package com.companion.assitCoach;

import com.companion.assitCoach.model.Player;
import com.companion.assitCoach.model.Team;
import com.companion.assitCoach.repository.playerRepository;
import com.companion.assitCoach.repository.teamRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class AssitCoachApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssitCoachApplication.class, args);
	}

	/*@Bean
	CommandLineRunner runner(playerRepository repository, teamRepository teamRepository) {
		Player player = new Player("Zinedine", "Zidane", 19, "Football", "Striker", new Stats());
		Team team = new Team("U18", "U18 epinette", "Idrissi", "0691234567", List.of(player));

		return args -> {
			repository.insert(player);
			teamRepository.insert(team);


		};

	}*/
}
