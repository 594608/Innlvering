package O3;

import java.util.Scanner;

public class o3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Put inn n(>0): ");
        int n = in.nextInt();
        if(n<0) {
            System.out.println("Ugyldig verdi.");
        } else {
            long factorial = 1;
            for(int i=1;i<=n;i++) {
                factorial*=i;
            }
            System.out.printf("%d! = %d\n",n,factorial);
        }

    }
}
