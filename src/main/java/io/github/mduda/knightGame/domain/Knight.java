package io.github.mduda.knightGame.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Knight {
    private String name = "Lancelot";
    private int age = 29;

    private Quest quest;


    public Knight(String name, int age/*, Quest quest*/) {
        this.name = name;
        this.age = age;
    }

    public Knight() {
    }


    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public String toString() {
        return name + "("+age+"). Ma za zadanie " + quest + ".";
    }
}
