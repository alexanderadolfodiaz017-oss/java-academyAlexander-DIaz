public class Cats {
    public static void main(String[] args) {

        // Exercise 1: Cat Profile
        String catName = "Luna"; // cat's name
        int catAge = 2;           // whole number for age
        String catColor = "black"; // text for color
        double catWeight = 3.8;    // decimal number for weight
        char catGrade = 'A';       // single character for fun grading

        System.out.println("Meet " + catName + "!");
        System.out.println(catName + " is a " + catAge + "-year-old " + catColor + " cat who weighs " + catWeight + " kg.");
        System.out.println("Grade: " + catGrade);


        boolean isHungry = true; // yes/no for hunger

        if (isHungry) {
            System.out.println(catName + " is meowing for food!");
        } else {
            System.out.println(catName + " is full and happily purring.");
        }

        boolean isOutside = false;

        if (isHungry && isOutside) {
            System.out.println(catName + " is hunting.");
        } else if (isHungry && !isOutside) {
            System.out.println(catName + " wants you to feed it.");
        } else if (!isHungry && isOutside) {
            System.out.println(catName + " is outside enjoying the fresh air.");
        } else {
            System.out.println(catName + " is inside, relaxed and content.");
        }
    }
}


