package org.breadsb.algorithms;

public class TicTacToeBlock {
    static final int[] LINE1 = new int[]{0, 1, 2};
    static final int[] LINE2 = new int[]{3, 4, 5};
    static final int[] LINE3 = new int[]{6, 7, 8};
    static final int[] LINE4 = new int[]{0, 3, 6};
    static final int[] LINE5 = new int[]{1, 4, 7};
    static final int[] LINE6 = new int[]{2, 5,  8};
    static final int[] LINE7 = new int[]{0, 4, 8};
    static final int[] LINE8 = new int[]{2, 4, 6};

    public static int blockPlayer(int a, int b) {
        boolean first = false;
        boolean second = false;
        int a1 = -1;
        int a2 = -1;
        int result = -1;

        int[][] array = new int[][]{LINE1, LINE2, LINE3, LINE4, LINE5, LINE6, LINE7, LINE8};

        for (int x = 0; x < array.length; x++) {

            for (int y = 0; y < array[x].length; y++) {
                if (a == array[x][y] && !first) {
                    first = true;
                    a1 = y;
                    continue;
                }
                if (b == array[x][y] && !second) {
                    second = true;
                    a2 = y;
                    continue;
                }
                if (first && second) {
                    int c = 3 - a1 - a2;
                    result = array[x][c];
                } else {
                    first = false;
                    second = false;
                }
            }
        }
        return result;
    }

    public static int soultion2(int a, int b) {
        int result = -1;

        int[][] array = new int[][]{LINE1, LINE2, LINE3, LINE4, LINE5, LINE6, LINE7, LINE8};

        boolean aTrue = false;
        boolean bTrue = false;
        int pos1 = -1;
        int pos2 = -1;

        for (int x = 0; x < array.length; x++) {

            for (int y = 0; y < array[x].length; y++) {
                if (!aTrue) {
                    if (a == array[x][y]) {
                        aTrue = true;
                        pos1 = y;
                        continue;
                    }
                }
                if (!bTrue) {
                    if (b == array[x][y]) {
                        bTrue = true;
                        pos2 = y;
                        continue;
                    }
                }

            }

            if (aTrue && bTrue) {
                int d = 3 - pos1 - pos2;
                result = array[x][d];
                break;
            } else {
                aTrue = false;
                bTrue = false;
            }
        }

        return result;
    }

    public static int sol3(int a, int b) {
            return (a / 3 == b / 3) ? (a / 3 * 9 + 3 - a - b) :
                    (a % 3 == b % 3) ? (a % 3 * 3 + 9 - a - b) :
                            (12 - a - b);
    }
}