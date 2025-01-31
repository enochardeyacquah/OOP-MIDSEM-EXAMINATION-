import java.util.Scanner;

class Ebill 
{
    public static void main(String args[]) {
        Customerdata ob = new Customerdata();
        ob.getdata();
        ob.calc();
        ob.display();
    }
}

class Customerdata {
    Scanner in = new Scanner(System.in);
    String cname, type;
    int bn;
    double current, previous, tbill, units;

    void getdata() {
        System.out.print("\n\tEnter consumer number: ");
        bn = in.nextInt();
        in.nextLine(); // Consume the newline character
        System.out.print("\n\tEnter Type of connection (D for Domestic or C for Commercial): ");
        type = in.nextLine();
        System.out.print("\n\tEnter consumer name: ");
        cname = in.nextLine();
        System.out.print("\n\tEnter previous month reading: ");
        previous = in.nextDouble();
        System.out.print("\n\tEnter current month reading: ");
        current = in.nextDouble();
    }

    void calc() {
        units = current - previous;
        if (type.equalsIgnoreCase("D")) { // Use equalsIgnoreCase for case insensitive comparison
            if (units <= 100)
                tbill = 1 * units;
            else if (units > 100 && units <= 200)
                tbill = 2.50 * units;
            else if (units > 200 && units <= 500)
                tbill = 4 * units;
            else
                tbill = 6 * units;
        } else { // For Commercial connections
            if (units <= 100)
                tbill = 2 * units;
            else if (units > 100 && units <= 200)
                tbill = 4.50 * units;
            else if (units > 200 && units <= 500)
                tbill = 6 * units;
            else
                tbill = 7 * units;
        }
    }

    void display() {
        System.out.println("\n\tConsumer number = " + bn);
        System.out.println("\n\tConsumer name = " + cname);
        if (type.equalsIgnoreCase("D"))
            System.out.println("\n\tType of connection = DOMESTIC");
        else
            System.out.println("\n\tType of connection = COMMERCIAL");
        
        System.out.println("\n\tCurrent Month Reading = " + current);
        System.out.println("\n\tPrevious Month Reading = " + previous);
        System.out.println("\n\tTotal units = " + units);
        System.out.println("\n\tTotal bill = GHs " + tbill);
    }
}
