package Application;

import Entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Product product = new Product();
        System.out.println("digite o nome do produto");
        product.name = entrada.nextLine();
        System.out.println("Preço: ");
        product.price = entrada.nextDouble();
        System.out.println("quantidade em estoque: ");
        product.quantity = entrada.nextInt();

        System.out.println("product data: " + product);
        System.out.println("Enter the number of product to be added in stock: ");
        int quantity = entrada.nextInt();
        product.addProducts(quantity);
        System.out.println("update data: " + product);
        System.out.println("Enter the number of product to be removed in stock: ");
        quantity = entrada.nextInt();
        product.removeProducts(quantity);
        System.out.println("update data: " + product);
        entrada.close();
    }
}
