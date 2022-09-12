package B5;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hva er poengsum (0-100): ");
        int score = in.nextInt();

        if(score<0 || score>100) {
            System.out.println("Ugyldig poengsum NB !!!");
        } else {
            char grade = ' ';
            if (score>=90) grade = 'A';
            else if (score>=80) grade = 'B';
            else if (score>=60) grade = 'C';
            else if (score>=50) grade = 'D';
            else if (score>=40) grade = 'E';
            else grade = 'F';
            System.out.printf("Poengsummen av %d tilsvarer til karakter %s\n",score,grade);
        }

    }
}