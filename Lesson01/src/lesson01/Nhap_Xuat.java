/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson01;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
public class Nhap_Xuat {
    public static void main(String[] args) {
        // khai báo biến
        int a, b;
        float x,y;
        String name;
        Scanner input = new Scanner(System.in); 
        System.out.print("\n Nhập số a:");
        a= input.nextInt();
        System.out.print("\n Nhập số b:");
        b= input.nextInt();
        System.out.print("\n Nhập số x:");
        x= input.nextFloat();
        System.out.print("\n Nhập số y:");
        y= input.nextFloat();
        System.out.print("\n Nhập tên:");
        input.nextLine();
        name= input.nextLine();
        
        // in ra màn hình
        System.out.printf("\n a=%d; b=%d",a,b);
        System.out.printf("\n x=%f; y=%f",x,y);
        
        System.out.println("\nXin chào, " + name);
        System.out.printf("Xin chào, %s" , name);
        
    }
}
