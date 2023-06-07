/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Chung Trinh

* Syntax:
* switch(expression){
*   case value1:
*       statement 1;
*       break;
*   case value2:
*       statement 2;
*       break;
*   ....
*   [default:
*       statement n+1;
*   ]
* }
* 
* 
 */
public class Demo_switch {
    public static void main(String[] args) {
        // Nhập vào giá trị số nguyên dương (1-7)
        // In ra thứ trong tuần tương ứng tiếng việt
        // 1 - Chủ nhật
        // 5 - Thứ năm
        int num;
        Scanner input= new Scanner(System.in);
        System.out.println("Num=");
        num = input.nextInt();
        switch(num){
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;    
            case 6:
                System.out.println("Thứ sáu");
                break;    
            case 7:
                System.out.println("Thứ bảy");
                break;
            default:
                System.out.println("Bạn nhập sai");
        }
    }
}
