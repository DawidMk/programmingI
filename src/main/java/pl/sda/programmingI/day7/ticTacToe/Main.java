package pl.sda.programmingI.day7.ticTacToe;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

//TODO dokończyć

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] gameBoard = new int[9];

    public static void main(String[] args) {
//        createNewBoard();
        showBoard(gameBoard);
        game(gameBoard, true);
//        showBoard(gameBoard);
    }

    private static void createNewBoard() {
        //TODO stream z jakiegoś powodu nie czyści kompletnie planszy
//        Arrays.stream(gameBoard)
//                .forEach(i -> gameBoard[i] = 0);
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[i] = 0;
        }
        showBoard(gameBoard);
    }

    private static void game(int[] tab, boolean move) {

        if (move) {
            takeField(tab, move);
            move = false;
            game(tab, move);
        }
        if (!move) {
            takeField(tab, move);
            move = true;
            game(tab, move);

        }

    }

    private static void checkIfWin(int[] tab, int n) {
        if (tab[0] == n && tab[1] == n && tab[2] == n ||
                tab[3] == n && tab[4] == n && tab[5] == n ||
                tab[6] == n && tab[7] == n && tab[8] == n ||
                tab[0] == n && tab[3] == n && tab[6] == n ||
                tab[1] == n && tab[4] == n && tab[7] == n ||
                tab[2] == n && tab[5] == n && tab[8] == n ||
                tab[0] == n && tab[4] == n && tab[8] == n ||
                tab[2] == n && tab[4] == n && tab[6] == n
        ) {
            System.out.println("player " + n + " is THE winner!");
            System.out.println("new game? y/n");
            String question = scanner.next();
            if (question.equals("y")) {
                createNewBoard();
                game(gameBoard, true);
            } else {
                System.out.println("game finished!");
                System.exit(0);
            }
        }
    }

    private static void takeField(int[] tab, boolean flag) {
        checkIfBoardIsFull();
        int x = chooseField();
        int n = 0;
        if (flag) {
            n = 1;
        } else {
            n = 2;
        }
        if (tab[x] == 0) {
            tab[x] = n;
        } else {
            System.out.println("field already taken. choose something else");
            takeField(tab, flag);
        }
        showBoard(tab);
        checkIfWin(tab, n);
    }

    private static void checkIfBoardIsFull() {
        if (Arrays.stream(gameBoard)
                .noneMatch(i -> i == 0)
        ) {
            System.out.println("board full! no winner this time!");
            System.exit(0);
        }
    }

    private static int chooseField() {
        System.out.println("which field? (0-8)");
        int output;
        String field = scanner.next();
        boolean b2 = Pattern.compile("[0-8]").matcher(field).matches();
        if (!b2 || Integer.valueOf(field) > 8) {
            System.out.println("wrong input!");
            output = chooseField();
        } else {
            output = Integer.valueOf(field);
        }
        return output;
    }

    private static void showBoard(int[] tab) {
        System.out.print(tab[0] + "|" + tab[1] + "|" + tab[2]);
        System.out.println();
        System.out.print(tab[3] + "|" + tab[4] + "|" + tab[5]);
        System.out.println();
        System.out.print(tab[6] + "|" + tab[7] + "|" + tab[8]);
        System.out.println();
    }
}





