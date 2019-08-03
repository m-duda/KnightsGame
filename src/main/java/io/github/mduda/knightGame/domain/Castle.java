package io.github.mduda.knightGame.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Castle {
    private String name = "Wschodnia strażnica";

    public Castle() {
    }

    @PostConstruct
    public void build (){
        System.out.println("Wybudowano zamek "+ name + ".");
    }

    @PreDestroy
    public void destroy (){
        System.out.println("Wyburzono zamek " + name + ".");
    }

}
