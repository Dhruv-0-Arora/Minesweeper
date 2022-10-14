package me.dhruv.Util;

public class Table {
    int[][] arr = new int[5][5];
    int[][] visualArr = new int[5][5];

    public Table() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int num = (int) Math.floor(Math.random() * 5);
                if (num == 1) {
                    arr[i][j] = -1;
                }
            }
        }
    }

}
