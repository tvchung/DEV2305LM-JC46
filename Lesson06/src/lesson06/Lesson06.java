/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson06;

/**
 *
 * @author Chung Trinh
 */
public class Lesson06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Review obj = new Review();
        obj.display();
        obj = new Review("Chung", "Chung chung");
        obj.display("Hahahha");
        obj = new Review("Devmaster", "Academy", 6);
        obj.display("Company Title");
    }
    
}
