import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        int n=0;
        Scanner row = new Scanner(System.in);
        System.out.println("Enter the number of rows:  ");
        n = row.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=i; j<n;j++){
                System.out.print(" ");
            }
            for (int k =1 ; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }

}
