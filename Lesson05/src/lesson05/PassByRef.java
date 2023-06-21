/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson05;

/**
 *
 * @author Chung Trinh
 */
public class PassByRef {
    
    //tính chu vi
    public void calcArea(Circle circ, double  rad){
        double cv = circ.getPI()*rad*rad;
        System.out.println("Chu vi:" + cv);
    }
    
    public static void main(String[] args) {
        PassByRef p =new PassByRef();
        p.calcArea(new Circle(), 15);
    }
}

class Circle{
    public double  getPI(){
        return 3.14;
    }
}