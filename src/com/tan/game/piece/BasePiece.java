package com.tan.game.piece;

public class BasePiece {
    public final static int RIGHT = 0;
    public final static int UP = 1;
    public final static int LEFT = 2;
    public final static int DOWN = 3;
    public final static int RIGHT_MIRROR = 4;
    public final static int UP_MIRROR = 5;
    public final static int LEFT_MIRROR = 6;
    public final static int DOWN_MIRROR = 7;

    private static final int MAX_PIECE_SIZE = 5;

    protected int[][] mShape;
    protected String mShowName;

    public BasePiece() {
        setSharp();
        setShowName();
    }

    protected void setSharp() {
        mShape = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
    }

    protected void setShowName() {
        mShowName = "Z";
    }

    public void show() {
        System.out.println("============ Piece is ============");
        for (int i = 0; i < MAX_PIECE_SIZE; i++) {

        }

        for (int i = 0; i < MAX_PIECE_SIZE; i++) {
            for (int j = 0; j < MAX_PIECE_SIZE; j++) {
                if (mShape[i][j] == 1) {
                    System.out.printf(String.valueOf(mShowName) + "  ");
                } else {
                    System.out.printf("0  ");
                }
            }
            System.out.println();
        }
        System.out.println("=================================");
    }

}
