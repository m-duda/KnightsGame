package io.github.mduda.knightGame.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestTest {

    @Test
    public void testToString(){
        String expect = "zabij smoka";
        Quest quest = new Quest();
        assertEquals(expect, quest.toString());
    }

}