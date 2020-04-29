package BT_ValueMax_Mang2Chieu_Java;

import java.util.Random;
import java.util.Scanner;

public class Value_Max {
    public static void main(String[] args) {
        int row;
        int column;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            System.out.println("Nhập Chỉ Số Dòng Của Mảng");
            row = scanner.nextInt();
            System.out.println("Nhập chỉ số Cột Của Mảng");
            column = scanner.nextInt();
            if (row != column) {
                System.out.println("Số Cột Và Hàng Phải Bằng Nhau");
            }
        } while (row != column);
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt(100) + 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Giá Trị Lớn Nhất Trong Mảng Là : ");
        System.out.println(MaxValue(array));
    }

    public static int MaxValue(int[][] arr) {
        int max = arr[0][0];
        int row = 0, column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("Hàng = " + row + "\n" + "Cột = " + column);
        return max;
    }
}
