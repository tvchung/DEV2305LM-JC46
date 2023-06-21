/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05;

/**
 *
 * @author Chung Trinh
 */
public class PassByValue {
    
    public void setVal(int num1){
        num1 = num1 + 10;
        System.out.println("In PassByValue:" + num1);
    }
    public static void main(String[] args) {
        int num1=10;
        PassByValue pbv = new  PassByValue();
        System.out.println("num1:" + num1);
        pbv.setVal(num1);
        System.out.println("num1:" + num1);
    }
}
