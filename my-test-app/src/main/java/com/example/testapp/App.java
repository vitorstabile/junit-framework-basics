package com.example.testapp;

/**
 * Hello world!
 *
 */
public class App {

    public Boolean reachedDestination(String moves, int x, int y) {
        int currentX = 0;
        int currentY = 0;

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'N':
                    currentY++;
                    break;
                case 'S':
                    currentY--;
                    break;
                case 'E':
                    currentX++;
                    break;
                case 'W':
                    currentX--;
                    break;
                default:
                    // Ignore invalid moves
            }
        }

        return currentX == x && currentY == y;
    }

}
