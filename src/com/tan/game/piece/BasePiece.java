package com.tan.game.piece;

import com.tan.game.Position;

import java.util.ArrayList;
import java.util.List;

public class BasePiece {
    public final static int NORMAL = 0;
    public final static int RIGHT = 1;
    public final static int UP = 2;
    public final static int LEFT = 3;
    public final static int MIRROR = 4;
    public final static int MIRROR_RIGHT = 5;
    public final static int MIRROR_UP = 6;
    public final static int MIRROR_LEFT = 7;

    private List mListNormal = new ArrayList<Position>();
    private List mListRight = new ArrayList<Position>();
    private List mListUp = new ArrayList<Position>();
    private List mListLeft = new ArrayList<Position>();
    private List mListMirrorNormal = new ArrayList<Position>();
    private List mListMirrorRight = new ArrayList<Position>();
    private List mListMirrorUp = new ArrayList<Position>();
    private List mListMirrorLeft = new ArrayList<Position>();

    private static final int MAX_PIECE_SIZE = 5;

    protected int[][] mShape;
    protected String mShowName;

    public BasePiece() {
        setSharp();
        setShowName();
        initList();
    }

    private void initList() {
        initNormalList(mListNormal);
        getRightList(mListNormal, mListRight);
        getUpList(mListNormal, mListUp);
        getLeftList(mListNormal, mListLeft);

        initMirrorList(mListNormal, mListMirrorNormal);
        getRightList(mListMirrorNormal, mListMirrorRight);
        getUpList(mListMirrorNormal, mListMirrorUp);
        getLeftList(mListMirrorNormal, mListMirrorLeft);
    }

    private void initNormalList(List list) {
        for (int i = 0; i < MAX_PIECE_SIZE; i++) {
            for (int j = 0; j < MAX_PIECE_SIZE; j++) {
                if (mShape[i][j] != 0) {
                    list.add(new Position(i, j));
                }
            }
        }
    }

    private void getRightList(List from, List to) {
        for (Object p : from) {
            to.add(new Position(((Position) p).getY(), (((Position) p).getX()) * (-1)));
        }
    }

    private void getUpList(List from, List to) {
        for (Object p : from) {
            to.add(new Position((((Position) p).getX()) * (-1), (((Position) p).getY()) * (-1)));
        }
    }

    private void getLeftList(List from, List to) {
        for (Object p : from) {
            to.add(new Position(((((Position) p).getY()) * (-1)), (((Position) p).getX())));
        }
    }

    private void initMirrorList(List from, List to) {
        for (Object p : from) {
            to.add(new Position((((Position) p).getX()) * (-1), ((Position) p).getY()));
        }
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
