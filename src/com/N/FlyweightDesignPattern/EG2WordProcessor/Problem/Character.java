package com.N.FlyweightDesignPattern.EG2WordProcessor.Problem;

public class Character {
    char character;
    String fontType;
    int size;
    int row;
    int column;

//    CONSTRUCTOR
    public Character(char character, String fontType, int size, int row, int column) {
        this.character = character;
        this.column = column;
        this.fontType = fontType;
        this.row = row;
        this.size = size;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getFontType() {
        return fontType;
    }

    public void setFontType(String fontType) {
        this.fontType = fontType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
