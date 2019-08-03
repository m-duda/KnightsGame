package io.github.mduda.knightGame;

import io.github.mduda.knightGame.domain.Knight;
import io.github.mduda.knightGame.domain.Quest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        Quest quest = new Quest("zabij smoka");
        Knight lancelot = new Knight("Lancelot", 29, quest);
        System.out.println(lancelot.toString());
    }
}
