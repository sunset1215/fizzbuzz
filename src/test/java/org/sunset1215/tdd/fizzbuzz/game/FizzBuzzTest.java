package org.sunset1215.tdd.fizzbuzz.game;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FizzBuzzTest {
    
    private static final String THREE_WORD = "Fizz";
    private static final String FIVE_WORD = "Buzz";
    private static final String THREE_FIVE_WORD = THREE_WORD + FIVE_WORD;
    
    private FizzBuzz sut;
    
    @BeforeTest
    public void setup() {
        sut = new FizzBuzz();
    }
    
    @DataProvider
    public Object[][] getWordData() {
        return new Object[][] {
                { 1, "1" },
                { 3, THREE_WORD },
                { 6, THREE_WORD },
                { 5, FIVE_WORD },
                { 13, THREE_WORD },
                { 15, THREE_FIVE_WORD },
                { 17, "17" },
                { 20, FIVE_WORD },
                { 52, FIVE_WORD }
        };
    }
    
    @Test(dataProvider = "getWordData")
    public void testGetWord(int input, String expected) {
        String result = sut.getWord(input);
    
        Assert.assertEquals(result, expected);
    }
    
}