package GameComponents.Board;

import GameComponents.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeedSquareTest {
    Player testPlayer1 = new Player("TestPlayer 1");
    Player testPlayer2 = new Player("TestPlayer 2");
    DeedSquare testDeedSquare = new DeedSquare("Test Deed 1",5);


    @Test
    public void testDeedSquareHasDeed() {
        assertEquals(true,testDeedSquare.hasDeed());

    }

    @Test
    public void setTestDeedSquareHasDeedFalseafterSellDeed() {
        testDeedSquare.sellDeed(testPlayer1);
        assertEquals(false,testDeedSquare.hasDeed());
    }


    @Test
    public void getDeedPrice() {
    }

    @Test
    public void getDeedOwner() {
    }
}