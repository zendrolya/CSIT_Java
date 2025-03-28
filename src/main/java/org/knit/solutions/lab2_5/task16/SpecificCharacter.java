package org.knit.solutions.lab2_5.task16;

public class SpecificCharacter implements Character {
    private final char symbol;

    public SpecificCharacter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void render(int x, int y, String style) {
        System.out.printf("Символ '%c' отображен в позиции (%d, %d) со стилем '%s'\n",
                symbol, x, y, style);
    }

    public char getSymbol() {
        return symbol;
    }
}