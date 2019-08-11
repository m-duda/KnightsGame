package io.github.mduda.knightGame;

import io.github.mduda.knightGame.domain.KnightsInMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    KnightsInMemoryRepository castle;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(castle.toString());

    }
}
