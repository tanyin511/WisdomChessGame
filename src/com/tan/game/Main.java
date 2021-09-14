package com.tan.game;

import com.tan.game.piece.BasePiece;
import com.tan.game.piece.Piece_22_GREEN;
import com.tan.game.piece.Piece_4_RED;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Board mBoard = new Board();
        mBoard.showBoard();

        BasePiece mPiece = new Piece_22_GREEN();
        mPiece.show();
    }
}
