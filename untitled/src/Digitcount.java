import java.util.Scanner;

public class Digitcount {
    public static void main(String[] args) {

        int number;
        do {
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the number: ");
            number = num.nextInt();
            int count = 0;
            int x=number;
            while (x>0){
                x = x/10;
                count++;
            }
            System.out.println("Number of digits are: "+ count );
        }
        while (number > 0);

        System.out.println("The number you are entered is minus");



    }
}
