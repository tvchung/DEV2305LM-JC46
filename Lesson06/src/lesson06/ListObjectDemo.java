/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Chung Trinh
 * Yêu cầu:
 * 1. Tạo lớp đối tượng Student(studentId, name, age)
 * 2. Tạo tập hợp các đối tượng Student và thực hiện các chức năng
 *  - Nhập
 *  - Xuất danh sách
 *  - Tìm kiếm theo tên
 *  - Xóa theo studentId
 *  - Sắp xếp giảm dần theo age
 */
public class ListObjectDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        //Nhập
        list.add(new Student(101,"A",20));
        list.add(new Student(102,"B",18));
        list.add(new Student(103,"C",25));
        list.add(new Student(104,"D",15));
        
        // xuất
        for(Student item:list){
            System.out.println(item);
        }
        //Tìm kiếm theo tên
        String keyName;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm:");
        keyName=input.nextLine();
        boolean flag = false;
        for(Student item:list){
           if(item.name.contains(keyName)){
               System.out.println(item);
               flag=true;
           }
        }
        if(flag==false){
            System.out.println("Không tìm thấy");
        }
        
        //Xóa theo studentId
        System.out.println("Nhập mã id cần xóa:");
        int id = input.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).studentId == id){
                list.remove(i);
            }
        }
        // in 
        for(Student item:list){
            System.out.println(item);
        }
        
        //- Sắp xếp giảm dần theo age: 
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).age < list.get(j).age){
                    Student temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);
                }
            }
        }
        // in
        System.out.println("Ds giảm dần theo tuổi");
        for(Student item:list){
            System.out.println(item);
        }
        
        // sort in collection
        Collections.sort(list,(x,y)->{return y.age-x.age;});
        
        System.out.println("Collectin:Ds giảm dần theo tuổi");
        for(Student item:list){
            System.out.println(item);
        }
    }
}
class Student{
    int studentId;
    String name;
    int age;

    public Student() {
    }

    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name=" + name + ", age=" + age + '}';
    }
}