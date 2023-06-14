/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson04;

/**
 *
 * @author Chung Trinh
 */
public class Person {
    // field
    int personId;
    String personName;
    
    // Tạo constructor
    public Person() {
    }
    public Person(int id) {
        personId=id;
    }
    public Person(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }
    
    public static void main(String[] args) {
        // Khởi tạo 1 đối tượng
        Person p = new Person();
        System.out.println("id:"+p.personId);
        System.out.println("Name:"+p.personName);
        
        // Khởi tạo với constructor có tham số
        p=new  Person(100);
        System.out.println("id:"+p.personId);
        System.out.println("Name:"+p.personName);
        
        p=new  Person(200,"Chung Trịnh");
        System.out.println("id:"+p.personId);
        System.out.println("Name:"+p.personName);
    }
}
