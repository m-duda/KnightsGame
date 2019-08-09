package io.github.mduda.knightGame.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CastleTest {

    @Test
    public void testToString() {
        String expect = "Znajduje się tu zamek Wschodnia straznica, przebywa w nim rycerz o imieniu Lancelot(29). Ma za zadanie zabij smoka.";
        Quest quest = new Quest();
        Knight knight = new Knight();
        knight.setQuest(quest);
        Castle castle = new Castle(knight,"Wschodnia straznica");
        assertEquals(expect, castle.toString());
    }

}