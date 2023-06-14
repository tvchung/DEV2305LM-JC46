/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson04;

import java.util.Random;

/**
 *
 * @author Chung Trinh Review: Mảng
 */
public class Lesson04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = new int[10];
        // nhập giá trị cho các phần tử (random)
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(89) + 10;
        }
        System.out.println("Danh sách phần tử:");
        for (int item : arr) {
            System.out.printf("%4d", item);
        }
        System.out.println("");
        // in ra các số hoàn hảo trong mảng
        // 6 = 3+2+1;
        System.out.println("Số hoàn hảo");
        for (int i = 0; i < 10; i++) {
            if(check(arr[i])==true){
                System.out.printf("%4d",arr[i]);
            }
        }
        System.out.println("");
    }

    static boolean check(int num) {
        int tong = 0;
        for (int i = 1; i <= (int) num / 2; i++) {
            if (num % i == 0) {
                tong += i;
            }
        }
        
        if (tong == num) {
            return true;
        } else {
            return false;
        }
    }
    
}
