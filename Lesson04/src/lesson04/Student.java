/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson04;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 */
// Tạo lớp Student

public class Student {
    // member: field/ attribute
    // field
    String rollNumber;
    String name;
    int yearOfBirth;
    
    // Method:
    // Nhập thông tin cho  đội tượng
    public void inputInfor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input rollNumber:");
        rollNumber = input.nextLine();
        System.out.println("Input name:");
        name = input.nextLine();
        System.out.println("Input year of birth:");
        yearOfBirth = input.nextInt();
    }
    // Method: hiển thị thông thin
    public void output(){
        System.out.println("Thông tin sinh vien:");
        System.out.println("RollNumber:" + rollNumber);
        System.out.println("Name:" + name);
        System.out.println("Year Of Birth:" + yearOfBirth);
    }
    
    // Tạo phương thức changeRollNumber
    void changeRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }
    
    // test: khởi tạo đối tượng
    public static void main(String[] args) {
        // Khai báo đối tượng
        Student obj;
        // Khợi tạo đội tượng
        obj = new Student();
        
        // Khai báo và khởi tạo đối tượng
        Student st = new Student();
        
        // Sử dụng đối tượng với các phương thức
        obj.inputInfor();
        obj.output();
        
        st.inputInfor();
        st.output();
        
        // call methodd
        st.changeRollNumber("SV0003");
        System.out.println("===Change:");
        st.output();
                
    }
}
