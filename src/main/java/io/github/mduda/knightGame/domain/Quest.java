package io.github.mduda.knightGame.domain;

import org.springframework.stereotype.Component;

@Component
public class Quest {
    private String description = "zabij smoka";

    public Quest() {

    }

    @Override
    public String toString() {
        return description;
    }
}
