/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

/**
 *
 * @author Chung Trinh
 * Tạo phương thức tổng quát
 */
public class GenericMethodDemo {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        
        Integer[] inArray = {10,20,30,40};
        gm.printGeneric(inArray);
        String[] strArray = {"Hùng","Dũng","Sang","Trọng"};
        gm.printGeneric(strArray);
    }
}

class GenericMethod{
    // Tạo phương thức kiểu E
    public <E> void printGeneric(E[] array){
        System.out.println("======Danh sách");
        for (E item: array) {
            System.out.println(item);
        }
    }
}