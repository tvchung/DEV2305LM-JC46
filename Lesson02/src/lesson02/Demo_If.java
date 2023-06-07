/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * Demo cấu trúc if: (4 dạng)
 * 
 */
public class Demo_If {
    public static void main(String[] args) {
        // khai báo biến
        int a, b;
        // Nhập a, b
        Scanner input = new Scanner(System.in);
        System.out.println("a=");
        a=input.nextInt();
        System.out.println("b=");
        b=input.nextInt();
        // Dạng 1: Cấu trúc if đơn
        if(a>0){
            System.out.println("a là số dương");
        }
        // Dạng 2: if đầy đủ
        // Kiểm tra a là số chẵn hay số lẻ
        if(a%2==0){
            System.out.println(a+ " là số chẵn!");
        }else{
            System.out.println(a+ " là số lẻ!");
        }
        // Dạng 3: if bậc thang
        // Kiểm tra a là số dương, âm hay số không
        if(a>0){
            System.out.println(a + " là số dương");
        }else if(a<0){
            System.out.println(a+ " là số âm");
        }else{
            System.out.println("không");
        }
        // Dạng 4: if lông nhau -> trong if chứa if khác, hoặc trong else lại chứa câu lệnh if
        // kiểm tra nếu a>0
        // --> Thực hiện: tính c= b*b nếu b chẵn/ ngược lại b lẻ: in ra b
        // Nếu a<=0; tính c=a-b;
        System.out.println("Dạng 4:");
        if(a>0){
            if(b%2==0){
                System.out.println("b*b=" + b*b);
            }else{
                System.out.println("b=" + b);
            }
        }else{
            System.out.println(a-b);
        }
    }
}
