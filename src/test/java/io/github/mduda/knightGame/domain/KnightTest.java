package io.github.mduda.knightGame.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    @Test
    public void testToString() {
        String expect = "Lancelot(29). Ma za zadanie zabij smoka.";
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        assertEquals(expect, knight.toString());
    }

}