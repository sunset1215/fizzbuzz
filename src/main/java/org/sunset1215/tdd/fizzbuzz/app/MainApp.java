package org.sunset1215.tdd.fizzbuzz.app;

import org.sunset1215.tdd.fizzbuzz.game.FizzBuzz;

public class MainApp {
    
    public static void main(String[] args) {
        
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.getWord(i));
        }
        
    }
    
}
