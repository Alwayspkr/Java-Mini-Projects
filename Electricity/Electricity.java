import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        try {

            double units, amount = 0;
            String customerNumber, customerName, connection;
            double previousReading, currentReading;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter customer no:");
            customerNumber = input.next();

            System.out.println("enter customer name");
            customerName = input.next();

            System.out.println("Enter prev month reading");
            previousReading = input.nextDouble();

            System.out.println("Enter current month reading:");
            currentReading = input.nextDouble();

            System.out.println("Enter type of connection(D/C):");
            connection = input.next();

            units = currentReading - previousReading;

            if (connection.equals("D")) {
                if (units <= 0) amount = 0;
                else if (units <= 100) amount = units * 2;
                else if (units <= 200) amount = units * 2.5;
                else if (units <= 500) amount = units * 4;
                else amount = units * 6;
            } else if (connection.equals("C")) {
                if (units <= 0) amount = 0;
                else if (units <= 100) amount = units * 3;
                else if (units <= 200) amount = units * 4.5;
                else if (units <= 500) amount = units * 6;
                else amount = units * 7;
            }
            System.out.println("Bill Amount: " + amount);
        } catch (Exception e) {
            System.out.println(e+":: Enter the correct Reading");
        }

    }
}