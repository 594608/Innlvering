package B5;

import java.util.Scanner;

public class b5b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i=0;i<10;i++) {
            System.out.printf("Hva er poengsum til student #%d (0-100): ",i+1);
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
}