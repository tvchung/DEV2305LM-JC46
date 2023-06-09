/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson03;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class MangHaiChieuLab01 {
    public static void main(String[] args) {
        int n,m;
        // Nhập n,m
        Scanner input = new  Scanner(System.in);
        System.out.println("Dong n=");
        n=input.nextInt();
        System.out.println("Cot m=");
        m=input.nextInt();
        int[][] num = new int[n][m];
        // Nhập giá trị cho các phần tử
        nhap(num);
        xuat(num);
        // c) Tìm phần tử nhỏ nhất.
        int min = findMin(num);
        System.out.println("\nMin:"+min);
        //d) Tìm phần tử lẻ lớn nhất.
        min = findLeMin(num);
        if(min==0)
            System.out.println("Không có phần tử lẻ");
        else
            System.out.println("Phần tử lẻ nhỏ nhất:"+min);
        //e) Tìm dòng có tổng lớn nhất.
        int dong = findRowTotalMax(num);
        System.out.println("Dong co tong Max:"+dong);
    }
    static void nhap(int[][] a){
        System.out.println("Nhập giá trị:");
         Scanner input = new  Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("a[%d][%d]=",i,j);
                a[i][j]=input.nextInt();
            }
        }
    }
    static void xuat(int[][] a){
        System.out.println("Mảng phần tử:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println("");
        }
    }
    static int findMin(int [][] a){
        int min=a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] < min) 
                    min=a[i][j];
            }
        }
        return min;
    }
    static int findLeMin(int[][] a){
        int min=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]%2 !=0 ) {
                    min=a[i][j];
                    break;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]%2 !=0 && min > a[i][j]) {
                    min=a[i][j];
                }
            }
        }
        return min;
    }
    static int findRowTotalMax(int[][] a){
        int tongMax=0;
        int dong=0;
        for (int i = 0; i < a.length; i++) {
            int tong=0;
            for (int j = 0; j < a[i].length; j++) {
                tong +=a[i][j];
            }
            if(tong>=tongMax){
                tongMax=tong;
                dong=i;
            }
                
        }
        return dong;
    }
    
    // tìm cột có tổng lớn nhất
    // in các phần tử có giá trị chẵn ngược lại in *
    // In các phần tử là số nguyên tố, còn lại in x
    // In các phần từ trên biên
    //Bài ma trận xoáy trôn ốc. 
    /*
    n=9;
    1 2 3
    8 9 4
    7 6 5
    
    n=16
    1   2    3    4
    12  13  14    5
    11  16  15    6
    10  9   8     7
    */
    
}
