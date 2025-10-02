package com.pluralsight;

public class toy_story {
package com.pluralsight;
    public static void main(String[] args) {
        String movieTitle = "toy_story";
        int friends = 3;
        int mySelf = 1;
        double pizzaPerSlice = 8.50;
        boolean hasPopcorn = true;
        System.out.println("Movie is about to start!");
        System.out.println("Let's go watch :" + movieTitle);
        double totalPizzaCost = pizzaPerSlice * (friends + mySelf);
        System.out.println("Bro the pizza was so expensive.It ended up being :" + totalPizzaCost);
        System.out.println("I love theater popcorn" + hasPopcorn);

        if (hasPopcorn)
            System.out.println("yay we goy popcorn!");
    } else {
        System.out.println("I can't afford popcorn");
        }
    }
}
