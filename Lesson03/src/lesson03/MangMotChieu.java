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
public class MangMotChieu {
    public static void main(String[] args) {
        // Khai báo
        int[] arr;
        float arr1[];
        // khởi tạo mảng
        arr = new int[10];
        arr1 = new float[5];
        
        // Khai báo và khởi tạo giá trị
        int[] a= {10,20,30,40};
        
        float b[] = {1.2f, 2.3f, 3,4f,4.5f};
        
        System.out.println("In");
        // cấu trúc lặp
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("b");
        int i=0;
        while(i<b.length){
            System.out.println(b[i++]);
        }
        
        // nhập / xuất
        // ==> gán giá trị vào phần tử mảng
        // ==> lấy giá trị từ phần tử mảng
        // tenBienMang[chỉ số]
        /*
            - khai báo biến n nguyên dương;
            - nhập n 
            - Khai báo mảng số nguyên n phần tử
            - Nhập giá trị cho tưng phần tử trong mảng
            - In danh sách các phần tử trong mảng
            - Tính tổng giá trị các phần tử trong mảng
        */
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập n=");
        n=input.nextInt();
        
        int number[] = new int[n];
        System.out.println("Nhập giá trị cho các phần tử trong mảng");
        for (int j = 0; j < n; j++) {
            System.out.printf("number[%d]=",j);
            number[j] = input.nextInt();
        }
        
        // xuất
        System.out.println("=== ds:");
        int  tong=0;
        for(int item:number){
            System.out.printf("%4d",item);
            tong +=item;
        }
        System.out.println("\n Tong:"+tong);
        
        // sắp xếp (sổi bọt)
        
        for (int j = 0; j < n-1; j++) {
            for (int k = j+1; k < n; k++) {
                if(number[j]>number[k]){
                    int temp = number[j];
                    number[j] = number[k];
                    number[k] = temp;
                }
            }
        }
        System.out.println("Mang tang:");
        for (int j = 0; j < n; j++) {
            System.out.printf("%4d",number[j]);
        }
        
    }
}
