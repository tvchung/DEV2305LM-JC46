/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson03;

import java.util.Random;

/**
 *
 * @author Chung Trinh
 */
public class MangHaiChieu {
    public static void main(String[] args) {
        // khai báo mảng 2 chiều
        int row=5, col=10;
        int[][] arr = new int[row][col];
        // arr[i][j]=?
        // nhập giá trị ngẫu nhiên cho từng phần tử (giá trị: 10--99)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Random rand = new Random();
                arr[i][j] = rand.nextInt(89) + 10;
            }
        }
        
        System.out.println("\n Giá trị các phần tử - Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d",arr[i][j]);
            }
            System.out.println("\n");
        }
        
        
    }
}
