/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05;

/**
 *
 * @author Chung Trinh
 */
public class CalculatorPoly {
    // add:
    int add(int a, int b){
        return a+b;
    }
    /*
    void add(int a, int b){
        System.out.println(a+b);
    }
    */
    float add(int a, float b){
        return a+b;
    }
    float add(float a, int b){
        return a+b;
    }
    
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    double add(double a, double b){
        return a+b;
    }
    double add(double a, double b, double c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        CalculatorPoly calc = new CalculatorPoly();
        int kq = calc.add(100, 100);
        System.out.println(kq);
        
        float res = calc.add(100, 105.1f);
        System.out.println(res);
    }
}
