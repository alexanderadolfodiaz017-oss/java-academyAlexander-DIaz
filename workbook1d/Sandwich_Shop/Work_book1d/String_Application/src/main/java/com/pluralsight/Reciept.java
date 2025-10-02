package com.pluralsight;

public class Reciept {
        public static void main(String[] args) {
            String itemName = "apples";
            double itemPrice = 2.37;
            int quantity = 3;

            double totalPrice = quantity * itemPrice;
            System.out.println("You bought " + quantity + " " + itemName + " for $" + String.format("%.2f", totalPrice));
        }
    }
}
