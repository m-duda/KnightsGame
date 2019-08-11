package io.github.mduda.knightGame.domain;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public String toString() {
        return name + "("+age+"). Ma za zadanie " + quest + ".";
    }
}
