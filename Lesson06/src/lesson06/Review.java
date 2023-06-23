/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

/**
 *
 * @author Chung Trinh
 * Lớp đối tượng
 * Tạo constructor
 * Xây dựng phương thức / Phương thức đa hình
 */
public class Review {
    // member: Field
    private String field1;
    private String field2;
    private int field3;
    
    // Constructor: đa hình
    public Review(){}
    public Review(String field1, String field2){
        this.field1=field1;
        this.field2=field2;
    }
    public Review(String field1, String field2, int field3){
        this.field1=field1;
        this.field2=field2;
        this.field3=field3;
    }
    // method:
    public void display(){
        System.out.println("========Thông tin");
        System.out.println(field1);
        System.out.println(field2);
        System.out.println(field3);
    }
    public void display(String title){
        System.out.println("========" + title);
        System.out.printf("%15s | %10s | %4d",field1,field2,field3);
        System.out.println();
    }
}
