
import java.util.Scanner;
public class OhmsLaw{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value for Voltage (V): ");
        double V = input.nextDouble();
        System.out.println("Enter value for Resistance (R): ");
        double R = input.nextDouble();
        System.out.println("Enter value for Current (I): ");
        double I = input.nextDouble();

        if(V>0 && R>0){
            I = V/R;
            System.out.println("Current (I)= " + I + "A");
        }
        else if(I>0 && V>0){
            R = V/I;
            System.out.println("Resistance (R)= " + R + "Ohms");
        }
        else if(I>0 && R>0){
            V = I * R;
            System.out.println("Voltage (V)= " + V + "Volts");
        }
    }

}