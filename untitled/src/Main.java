//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 10; i < 50; i+=10) {

            for (int j=i; j< i+10; j++ ){
                System.out.print(" " +j);
            }
            System.out.println();
        }
    }
}