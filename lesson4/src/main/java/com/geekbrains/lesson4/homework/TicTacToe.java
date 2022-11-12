package com.geekbrains.lesson4.homework;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
//               Домашнее задание.Урок номер 4
//    1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в
//    методичку.
//    2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
//    например, с использованием циклов.
    private static final int SIZE = 3;
    private static final int DOTS_TO_WIN = 3;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static char[][] map;
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Human Win");
                break;
            }
            if (isMapIsFull()) {
                System.out.println("Draw");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Ai Win");
                break;
            }
            if (isMapIsFull()) {
                System.out.println("Draw");
                break;
            }
        }
    }
    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter coordinate");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1, symbol)) return true;
                if (checkLine(i, j, 1, 1, symbol)) return true;
                if (checkLine(i, j, 1, 0, symbol)) return true;
                if (checkLine(i, j, -1, 1, symbol)) return true;
            }
        }
        return false;
    }

    private static boolean checkLine(int y, int x, int yDir, int xDir, char symbol) {
        int wayX = x + (DOTS_TO_WIN - 1) * xDir;
        int wayY = y + (DOTS_TO_WIN - 1) * yDir;
        if (wayX < 0 || wayY < 0 || wayX > SIZE - 1 || wayY > SIZE - 1) return false;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[y + i * yDir][x + i * xDir] != symbol) return false;
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    private static boolean isMapIsFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
            System.out.println();
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {

                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
