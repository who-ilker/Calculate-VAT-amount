import java.util.Scanner;
/*  KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
*/
public class Main {
    public static void main (String[] args){
        int amount;
        double VAT;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a monetary amount: ");
        amount = inp.nextInt();

        VAT = (double) (0 < amount && amount < 1000 ? (double)(amount * 18 / 100.0) : (double)(amount * 8 / 100.0));
        System.out.println("Value added tax: " + VAT + "$");
        System.out.println("Price with VAT: " + (VAT+amount) + "$");

    }
}