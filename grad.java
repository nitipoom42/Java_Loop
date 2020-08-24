import java.util.Scanner;

public class grad {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int Grad;
        System.out.println("Score You");
        Grad = sn.nextInt();

        if (Grad >= 80) {
            System.out.println("Grad A");
        } else if (Grad >= 70) {
            System.out.println("Grad B");
        } else if (Grad >= 60) {
            System.out.println("Grad D");
        } else if (Grad <= 50) {
            System.out.println("Grad F");
        }
        sn.close();
    }
}