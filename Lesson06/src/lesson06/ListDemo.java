/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chung Trinh
 * List / ArrayList
 */
public class ListDemo {
    public static void main(String[] args) {
        // Sử dụng collection List / ArrayList
         
        List<Integer> list = new ArrayList<Integer>();
        // Method
        // add
        list.add(12);
        list.add(13);
        print(list);
        
        List<String> listObj = new ArrayList<String>();
        listObj.add(0, "A");
        listObj.add(1, "B");
        print(listObj);
        listObj.add("C");
        print(listObj);
        
        // addAll
//        String[] names = {"Hùng","Dũng","Sang","Trọng"};
        ArrayList<String> names = new ArrayList<>();
        names.add("Hùng");
        names.add("Dũng");
        names.add("Sang");
        names.add("Trọng");
        listObj.addAll(names);
        print(listObj);
        
        //remove
        listObj.remove("Dũng");
        print(listObj);
        
        
        listObj.remove(0);
        print(listObj);
        
        listObj.add("Hùng");
        print(listObj);
        listObj.remove("Hùng");
        print(listObj);
        
        
        // sublist
        List<String> lstSub = listObj.subList(2, 4);
        print(lstSub);
    }
    
    public static void print(List array){
        System.out.println("======Danh sách:");
        for(Object item : array){
            System.out.printf("%s; ",item);
        }
        System.out.println("");
    }
}
