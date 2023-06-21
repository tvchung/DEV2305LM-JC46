/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson05;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * Review: Lớp và đối tượng
 */
public class Lesson05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st = new Student();
        st.print();
        st = new Student("SV001", "Nguyễn Chính Minh", 20);
        st.print();
        
        // Sử dụng phương thức của đối tượng
        st.input();
        st.print();
        
        // Review Bài tập
        // Tạo mảng đối tượng
        Student[] list = new Student[5];
        System.out.println("Nhập danh sách sinh viên:");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + i);
            list[i] = new Student();
            list[i].input();
        }
        // in danh sách
        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < list.length; i++) {
            list[i].print();
        }
    }
    
}


class Student{
    // member / field / attribute
    String studentId;
    String name;
    int age;
    // Method
    // constructor
    public Student(){}
    public Student(String id, String name, int age){
        this.studentId = id;
        this.name=name;
        this.age=age;
    }
    
    // method
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã:");
        studentId=input.nextLine();
        System.out.println("Nhập tên:");
        name=input.nextLine();
//        input.nextLine();
        System.out.println("Nhập tuổi:");
        age=input.nextInt();
    }
    
    // method: print
    void print(){
        System.out.println("Thông tin sinh viên:");
        System.out.println("Mã sinh viên:"+studentId);
        System.out.println("Tên sinh viên:"+name);
        System.out.println("Tuổi sinh viên:"+age);
    }
}