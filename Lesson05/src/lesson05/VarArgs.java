/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05;

/**
 *
 * @author Chung Trinh
 */
public class VarArgs {
    // method: không giới hạn tham số
    public void addNumber (int ...num){
        System.out.println("\nDanh sách:");
        for(int item : num){
            System.out.printf("%4d",item);
        }
    }
    
    public static void main(String[] args) {
        VarArgs obj = new VarArgs();
        
        obj.addNumber(10,20);
        obj.addNumber(10,20,30,40);
        obj.addNumber(10,25,25,11,22,33,44,5);
        
    }
}
