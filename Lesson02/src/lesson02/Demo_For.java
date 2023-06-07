/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 * for loop
 */
public class Demo_For {
    public static void main(String[] args) {
        // For: 
        /*
        Syntax:
        for(initial ; condition ; step){
        
            statement block;
        
        }
        */
        // Nhập vào số nguyên dương n; => in ra các số từ 1 đến n
        int num =10;
        for (int i = 1; i <= num; i++) {
            System.out.printf("%4d",i);
        }
        System.out.println("");
        System.out.println("For khuyết:");
        // khuyết init
        int i=1;
        for (; i <= num; i++) {
            System.out.printf("%4d",i);
        }
        // Khuyết condition
        System.out.println("\nFor khuyết: condition");
        for (int j = 1; ; j++) {
            if(j>num) 
                break;
            System.out.printf("%4d",j);
        }
        // Khuyết step
        System.out.println("\nFor khuyết: step");
        for (int j = 1; j<=num; ) {
            System.out.printf("%4d",j);
            j++;
        }
        // Khuyết toàn bộ
        System.out.println("\nFor khuyết: toàn bộ");
        i=1;
        for (;;) {
            System.out.printf("%4d",i);
            i++;
            if(i>num) break;
        }
        // For không thân
         System.out.println("\nFor không thân");
        for (int j = 1; j <= num;System.out.printf("%4d",j), j++){}
       
        
        // Nested for
        
    }
}
