package com.tan.game.piece;

public class Piece_131_ORANGE extends BasePiece {

    @Override
    protected void setSharp() {
        mShape = new int[][]{
                {0, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };
    }

    @Override
    protected void setShowName() {
        mShowName = "I";
    }
}
