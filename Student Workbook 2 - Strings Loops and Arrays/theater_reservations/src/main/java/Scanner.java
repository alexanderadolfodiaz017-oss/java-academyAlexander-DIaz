import java.time.format.DateTimeFormatter;
public class Scanner {

    private static int String;

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println(" Please enter your name:");
        String name = sc.nextLine();

        System.out.println("What date will you be coming?");
        System.out.println("Enter a date (DD/MM/YYYY):");
        String dateString;
        dateString = sc.nextLine();
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("How many tickets would you like?");
        int Ticket;
        Ticket = (int) sc.nextInt();

        System.out.println(Ticket + " tickets reserved for " + dateString + " under " + name);

        //3 tickets reserved for 2023-05-13 under Johnson, Geri
        sc.close();

    }
}

