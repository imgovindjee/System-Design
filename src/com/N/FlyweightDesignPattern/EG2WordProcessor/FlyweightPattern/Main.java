package com.N.FlyweightDesignPattern.EG2WordProcessor.FlyweightPattern;

import com.N.FlyweightDesignPattern.EG2WordProcessor.FlyweightPattern.IntrensicSystem.ILetter;

public class Main {
    public static void main(String[] args) {
        ILetter iLetter1 = LetterFactory.createLetter('t');
        iLetter1.display(1, 2);

        ILetter iLetter2 = LetterFactory.createLetter('t');
        iLetter2.display(2,2);
    }
}
