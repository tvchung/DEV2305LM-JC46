/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson03;

/**
 *
 * @author Chung Trinh
 * // review => Cấu trúc điều khiển
 * 1. 
 *  if
 *  switch
 * 2. loop
 * for
 * while
 * do...while
 * for ... in 
 * 
 * 
 */
public class Lesson03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Review  - Loop");
        // while 
        /*
        Syntax:
            while(condition){
                statement;
            }
        */
        // in ra các số nguyên dương < n
        int n=10;
        int i=1; // biến lặp, biến điều khiển lặp
        while(i<n){
            System.out.println(i);
            i++;
        }
        // in ra các số nguyên dương chia hết cho 3
        // và cho 5, <n
        n=50;
        i=15;
        System.out.println("=============");
        while(i<n){
            if(i%3 == 0 && i%5==0){
                System.out.println(i);
            }
            i++;
        }
        
        // do...while
        /*
        Syntax:
            do{
                statement;
            }while(condition);
        
        */
        System.out.println("=========");
        i=1;
        n=10;
        do{
            System.out.println(i);
            i++;
        }while(i<n);
        
        // forEach
        String[] arr ={"Hùng","Dũng","Sang","Trọng"};
        System.out.println("Mảng");
        for (String item : arr) {
            System.out.println(item);
        }
        
        // 3. lệnh nhảy
        /*
            break;
            continue;
            return ;
        
        */
        // continue
        // in ra các số từ 1 đến 10,
        // không in các số chia hết cho 3
        for (int j = 1; j <= 10; j++) {
            if(j%3==0)
                continue;
            System.out.println(j);
        }
        
        // return
        System.out.println(add(10,30));
    }
    
    static int add (int a, int b){
        return a+b;
    }
    
}
