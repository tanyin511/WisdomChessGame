package com.tan.game;

public class Board {
    public static final int Y = 0;
    public static final int N = 1;
    private static final int MAX_BOARD_SIZE = 10;
    int[][] mBoard =
            {
                    {Y, Y, Y, Y, Y, Y, Y, Y, Y, Y},
                    {Y, Y, Y, Y, Y, Y, Y, Y, Y, N},
                    {Y, Y, Y, Y, Y, Y, Y, Y, N, N},
                    {Y, Y, Y, Y, Y, Y, Y, N, N, N},
                    {Y, Y, Y, Y, Y, Y, N, N, N, N},
                    {Y, Y, Y, Y, Y, N, N, N, N, N},
                    {Y, Y, Y, Y, N, N, N, N, N, N},
                    {Y, Y, Y, N, N, N, N, N, N, N},
                    {Y, Y, N, N, N, N, N, N, N, N},
                    {Y, N, N, N, N, N, N, N, N, N}
            };
    int mRow;
    int mColumn;

    public void showBoard() {
        System.out.println("============ Board is ============");
        for (int i = 0; i < MAX_BOARD_SIZE; i++) {

        }

        for (int i = 0; i < MAX_BOARD_SIZE; i++) {
            for (int j = 0; j < MAX_BOARD_SIZE; j++) {
                if (mBoard[i][j] == Y) {
                    System.out.printf("0  ");
                } else {
                    //System.out.printf("%c ", mBoard[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("=================================");
    }
}
