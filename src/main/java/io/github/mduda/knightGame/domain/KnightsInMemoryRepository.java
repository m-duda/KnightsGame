package io.github.mduda.knightGame.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
@PropertySource("classpath:castle.properties")
public class KnightsInMemoryRepository {
    
    @Value("${my.castle.name:Czarny Zamek}")
    private String castleName;

    private Map<String, Knight> knights = new HashMap<>();

    public KnightsInMemoryRepository() {
    }

    KnightsInMemoryRepository(String name) {
        this.castleName = name;
    }

    public void createKnight (String name, int age){
        knights.put(name, new Knight(name, age));
    }

    public Knight getKnight (String name){
        return knights.get(name);
    }

    public Collection<Knight> getAllKnights (){
        return knights.values();
    }

    public void removeKnight (String name){
        knights.remove(name);
    }

    public void updateKnight (String name, int age){
        Knight knight = knights.get(name);
        knight.setName(name);
        knight.setAge(age);
    }

    @PostConstruct
    public void build (){
        createKnight("Lancelot", 29);
        createKnight("Percival", 31);
    }

    @Override
    public String toString() {
        return "Znajduje się tu zamek "+ castleName +  ".";
    }
}
