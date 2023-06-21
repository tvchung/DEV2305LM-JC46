/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05;

/**
 *
 * @author Chung Trinh
 */
public class Calculator {
    // method
    // add: cộng 2 số
    public void add(int a, int b){
        int kq=a+b;
        System.out.printf("\n %d + %d = %d",a,b,kq);
    }
    // sub: trừ 2 số
    public void sub(int a, int b){
        int kq=a-b;
        System.out.printf("\n %d - %d = %d",a,b,kq);
    }
    // mul: nhân 2 số
    public void mul(int a, int b){
        int kq=a*b;
        System.out.printf("\n %d * %d = %d",a,b,kq);
    }
    // div: nhân 2 số
    public float div(int a, int b){
        float kq= (float)a/b;
        System.out.printf("\n %d / %d = %f",a,b,kq);
        return kq;
    }
    
    // main - test
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Calculator calc = new Calculator();
        // gọi thực hiện phương thức
        calc.add(100, 200);
        calc.sub(200, 300);
        calc.mul(2, 100);
        float kq = calc.div(150,59);
        System.out.println("");
        System.out.println(kq);
    }
}
