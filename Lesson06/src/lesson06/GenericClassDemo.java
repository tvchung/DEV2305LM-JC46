/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

/**
 *
 * @author Chung Trinh
 */
public class GenericClassDemo {
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<Integer>();
        obj1.setT(1234);
        System.out.println("Biến kiểu Integer:" + obj1.getT());
        
        GenericClass<String> obj2 = new GenericClass<String>();
        obj2.setT("Chung");
        System.out.println(obj2.getT());
    }
}

// Xây dụng GenericClass
class GenericClass<T>{
    
    private T bienKieuT;
    
    public T getT(){
        return bienKieuT;
    }
    public void setT(T param){
        bienKieuT=param;
    }
}