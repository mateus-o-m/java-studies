import java.util.Scanner;

public class Data {
    public static void main (String args[]) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Type a integer nunmber: ");

        //verificar se o que foi digitado pelo usuário é um número inteiro
        if (input.hasNextInt()) {
            int num = input.nextInt();
            System.out.println (num);
        } else {
            String anyInput = input.next();
            System.out.printf ("\"%s\" Is not an integer\n", anyInput);
        }
    }
}