package ru.gb.spring.products;

import java.util.Scanner;

public class ManageCart {

    int id;
    String command;
    Cart cart;

    public ManageCart(Cart cart) {
        this.cart = cart;
    }

    public void run() {


        while(true) {

            System.out.println("Введите команду: add или delete чтобы добавить или удалить товар. Для выхода введите exit!");

            Scanner sc = new Scanner(System.in);
            command = sc.nextLine();
            if (command.equals("exit")) {
                System.exit(-1);
            }
            System.out.println("введите id товара");
            id = sc.nextInt();

            if (command.equals("add")) {
                cart.addProduct(id);
            }

            for (int i = 0; i < cart.getCarts().size(); i++) {
                System.out.println(cart.getCarts().get(i));
            }

            if (command.equals("delete")) {
                cart.removeProduct(id);
            }
            System.out.println();

            for (int i = 0; i < cart.getCarts().size(); i++) {
                System.out.println(cart.getCarts().get(i));
            }

        }

    }

}
