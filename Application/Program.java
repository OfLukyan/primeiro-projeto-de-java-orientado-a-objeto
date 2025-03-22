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

        System.out.println(product.name + "," + product.price + "," + product.quantity);

        entrada.close();
    }
}