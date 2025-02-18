
import java.util.Scanner;
public class DCMotorSpeed{

    public static void main(String[] args){

        double N;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Value for Input Voltage (V): ");
        double V = sc.nextDouble();
        System.out.println("Enter value for MotorConstant (K): ");
        double K = sc.nextDouble();
        System.out.println("Enter value for Back EMF (Eb): ");
        double Eb = sc.nextDouble();
        System.out.println("Enter value for Magnetic Flux (O)");
        double O = sc.nextDouble();

        N = (V - Eb)/(K * O);

        System.out.println("Speed of DC Motor (N): " + N);

    }
}