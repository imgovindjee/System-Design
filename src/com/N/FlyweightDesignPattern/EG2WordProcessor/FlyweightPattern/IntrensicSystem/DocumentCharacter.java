package com.N.FlyweightDesignPattern.EG2WordProcessor.FlyweightPattern.IntrensicSystem;

public class DocumentCharacter implements ILetter{
    private char character;
    private String fontType;
    private int size;

//    CONSTRUCTOR
    public DocumentCharacter(char character, String fontType, int size) {
        this.character = character;
        this.size = size;
        this.fontType = fontType;
    }

    public char getCharacter() {
        return character;
    }

    public String getFontType() {
        return fontType;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void display(int row, int column) {
        System.out.println("-----------------------------DOCUMENT's----------------------------");
        System.out.println("Row No.: "+row +
                "\nColumn No.: "+column);

//        BUSINESS LOGIC
    }
}
