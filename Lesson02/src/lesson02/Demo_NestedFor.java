/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

/**
 *
 * @author Chung Trinh
 * for được đặt bên trong lệnh for khác
 */
public class Demo_NestedFor {
    public static void main(String[] args) {
        // in ra hình vuông n *
        int n=5;
        /*
        n=5
        
        * * * * *
        * * * * *
        * * * * * 
        * * * * *
        * * * * *
        ================
        
        */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        /* Tam giác *
        n=5
            *
            * *
            * * *
            * * * *
            * * * * *
        */
        System.out.println("====tam giá * ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        /*
        n=5
            * * * * *
            * * * *
            * * *
            * *
            *
        */
        System.out.println("====tam giá * ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        /*
            n=5
                    *
                  * *
                * * *
              * * * *
            * * * * *
        */
        System.out.println("====tam giá * ");
        for (int i = 0; i < n; i++) {
            // in khoảng trắng
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        /*
            n=5;
            * * * * *
              * * * *      
                * * *      
                  * *
                    *
        */
        System.out.println("====tam giá * ");
        for (int i = 0; i < n; i++) {
            // in khoảng trắng
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        
    }
}
/*
Bài tập 1
n=7
   *
  ***
 *****
*******
----------
Bài tập 2: 
n=7
   0
  010
 01210
0123210

*/
