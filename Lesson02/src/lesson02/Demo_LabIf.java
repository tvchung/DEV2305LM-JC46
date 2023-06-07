/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * // Giải phương trình bậc 1: ax+b=0
 * input: a,b
 * output: x là nghiệm phương trình
 */
public class Demo_LabIf {
    public static void main(String[] args) {
        // 10'
        float a, b, x;
        Scanner input = new Scanner(System.in);
        System.out.println("a=");
        a=input.nextFloat();
        System.out.println("b=");
        b=input.nextFloat();
        // Giải phương trình
        giaiPtBacNhat(a,b);
    }
    
    static void giaiPtBacNhat(float a, float b){
        //  giải
        if(a==0){
            if(b==0){
                System.out.println("Pt vô số nghiệm");
            }else{
                System.out.println("Pt Vô nghiệm");
            }
        }else{ // a!=0
            System.out.println("Nghiệm phương trình: " + (-b)/a);
        }
    }
            
}
/*
    bài tập: giải phương trình bậc 2 
    ax^2 + bx +  c = 0
*/
