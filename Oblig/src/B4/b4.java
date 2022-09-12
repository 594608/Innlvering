package B4;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hva er din intekt? ");
        double income = in.nextDouble();
        double originalIncome = income;
        double tax = 0;
        if(income>934950) {
            tax+=(income-934951)*14.52/100.0;
            income =934950;
        }
        if(income>580650) {
            tax+=(income-580650)*11.52/100.0;
            income =580650;
        }
        if(income>230950) {
            tax+=(income-230950)*2.41/100.0;
            income =230950;
        }
        if(income>164100) {
            tax+=(income-164100)*0.93/100.0;
            income =164100;
        }
        System.out.printf("Trinnskatten til intekten din av $%.2f er $%.2f\n",originalIncome,tax);
    }
}
