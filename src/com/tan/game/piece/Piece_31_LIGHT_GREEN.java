package com.tan.game.piece;

public class Piece_31_LIGHT_GREEN extends BasePiece {

    @Override
    protected void setSharp() {
        mShape = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
    }

    @Override
    protected void setShowName() {
        mShowName = "F";
    }
}