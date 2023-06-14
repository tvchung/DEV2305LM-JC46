/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson04;

/**
 *
 * @author Chung Trinh
 */
public class ProductManager {
    public static void main(String[] args) {
        Product p = new Product();
        
        p.productId="P001";
        p.proName = "Nokia";
        p.proPrice = 123.23f;
//        p.proQuantity=10;  // error

        p = new Product("P002","Iphone",10,1234);
        
        System.out.println(p.productId);
        System.out.println(p.proName);
        System.out.println(p.proPrice);
    }
    
}
class Product{
    // field
    String productId;
    public String proName;
    private int proQuantity;
    protected  float proPrice;

    public Product() {
    }

    Product(String productId, String proName, int proQuantity, float proPrice) {
        this.productId = productId;
        this.proName = proName;
        this.proQuantity = proQuantity;
        this.proPrice = proPrice;
    }
}
