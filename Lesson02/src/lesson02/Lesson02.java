/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh Content: Các khái niệm cơ bản trong ngôn ngữ lập trình
 * Biến, kiểu dữ liệu, hằng, toán tử, toán hạng, phép tính, biểu thức câu lệnh,
 * khối lệnh,..
 */
public class Lesson02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Biến, kiểu dữ liệu ...
        int a, b = 10;
        a = 20; //  gán giá trị cho biến a
        int c = a + b;
        float x, y;
        String name;
        String address;
        long salary;
        double totalSalary;

        System.out.println("Các phép toán số học:");
        c = a + b;
        System.out.printf("\n%d +  %d = %d", a, b, c);
        c = a - b;
        System.out.printf("\n%d  -  %d = %d", a, b, c);
        c = a * b;
        System.out.printf("\n%d  *  %d = %d", a, b, c);
        float k = (float)b / a;
        System.out.printf("\n%d  /  %d = %.2f", b, a, k);
        c = b % a;
        System.out.printf("\n%d  %%  %d = %d\n ", b, a, c);
        //-------
        
        boolean kq;
        // a=20; b=10
        kq = (a>100) && (b<10); // F
        System.out.println(kq);
        kq = (a>100) || (b<=10); // T
        System.out.println(kq);
        
        c=++a; // c=21
        System.out.println("a="+a);
        System.out.println("c="+c);
        
        c=a++;
        System.out.println("a="+a); // a=22
        System.out.println("c="+c); //c=21
        
        c=a|b;
        System.out.println(c);
        c=a&b;
        System.out.println(c);
        
        // Nhập xuất - Scanner 
        Scanner input = new Scanner(System.in);
        // Nhập giá trị biên name
        System.out.println("Name=");
        name=input.nextLine();
        // Nhập giá trị biến address
        System.out.println("Address=");
        address=input.nextLine();
        // Nhập giá trị biên salary
        System.out.println("Salary:");
        salary=input.nextLong();
        // Nhập giá trị biến totalSalary
        System.out.println("Total Salary:");
        totalSalary = input.nextDouble();
        // print, printf, println
        
        System.out.print("Name:" + name);
        System.out.println("Address:" + address);
        System.out.printf("Total Salary:%f",totalSalary);
    }

}
