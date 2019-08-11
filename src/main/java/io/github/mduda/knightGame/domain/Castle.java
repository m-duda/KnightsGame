package io.github.mduda.knightGame.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@PropertySource("classpath:castle.properties")
public class Castle {
    @Value("${my.castle.name:Czarny Zamek}")
    private String name;


    public Castle() {
    }

    Castle (String name) {
        this.name = name;
    }

    @PostConstruct
    public void build (){
        System.out.println("Wybudowano zamek "+ name + ".");
    }

    @PreDestroy
    public void destroy (){
        System.out.println("Wyburzono zamek " + name + ".");
    }

    @Override
    public String toString() {
        return "Znajduje się tu zamek "+ name +  ".";
    }
}
