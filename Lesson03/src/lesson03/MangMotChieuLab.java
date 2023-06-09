/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson03;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * Bài 1. Viết chương trình nhập vào một mảng số nguyên có n phần tử 
a) Xuất giá trị các phần tử của mảng.
b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
c) Đếm số phần tử là số chẵn
d) Tìm các phần tử là số nguyên tố.
e) Sắp xếp mảng tăng dần
f) Tìm phần tử có giá trị x

 */
public class MangMotChieuLab {
    public static void main(String[] args) {
        //1. Viết chương trình nhập vào một mảng số nguyên có n phần tử 
        int n;
        System.out.println("Nhập n =");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        
        int[] num = new int[n];
        System.out.println("Nhập giá trị cho các phần tử trong mảng");
        for (int i = 0; i < n; i++) {
            System.out.printf("num[%d] = ",i);
            num[i] = input.nextInt();
        }
        // a) Xuất giá trị các phần tử của mảng.
        System.out.println("a) Xuất giá trị các phần tử của mảng.");
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d",num[i]);
        }
        System.out.println("\nb) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.");
        int max = num[0], min = num[0];
        for (int i = 0; i < n; i++) {
            if(num[i]>max) max=num[i];
            if(num[i]<min) min=num[i];
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);
        
        System.out.println("c) Đếm số phần tử là số chẵn");
        int demChan = 0;
        for (int i = 0; i < n; i++) {
            if(num[i] % 2 == 0) demChan++;
        }
        System.out.println("Số phần tử chẵn:" + demChan);
        
        System.out.println("d) Tìm các phần tử là số nguyên tố.");
        for (int i = 0; i < n; i++) {
            if(CheckNto(num[i])==true)
                System.out.printf("%4d",num[i]);
        }
        
        System.out.println("\ne) Sắp xếp mảng tăng dần");
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1 ; j < n; j++) {
                if(num[i]>num[j]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%4d",num[i]);
        }
        
        System.out.println("\nf) Tìm phần tử có giá trị x");
        int x;
        System.out.println("x=");
        x=input.nextInt();
        System.out.println("Phần tử có giá trị = "+x);
        for (int i = 0; i < n; i++) {
            if(num[i]==x)
                System.out.printf("\n %d:===>%d",i,num[i]);
        }
    }
    
    // Hàm kiểm tra số nguyên tố
    static boolean CheckNto(int x){
        if(x<=1) return false;
        for (int i = 2; i <=(int)x/2; i++) {
            if(x%i==0) return false;
        }
        return true;
    }
}
