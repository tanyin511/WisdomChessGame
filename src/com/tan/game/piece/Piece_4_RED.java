package com.tan.game.piece;

public class Piece_4_RED extends BasePiece {

    @Override
    protected void setSharp() {
        mShape = new int[][]{
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
    }

    @Override
    protected void setShowName() {
        mShowName = "A";
    }
}
