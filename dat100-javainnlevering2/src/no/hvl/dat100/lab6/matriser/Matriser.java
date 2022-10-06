package no.hvl.dat100.lab6.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {
        for (int[] ints : matrise) {
            for (int j = 0; j < ints.length; j++) {
                if (j != ints.length - 1) {
                    System.out.print(ints[j] + ", ");
                } else {
                    System.out.print(ints[j]);
                }
            }
            System.out.println("\n");

        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {
        String resultat = "";

        for (int[] ints : matrise) {
            for (int j = 0; j < matrise.length; j++)
                resultat += ints[j] + " ";
            resultat += "\n";

        }
        return resultat;

    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] nyMatrise = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;

    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {
        return a == b;
    }

    // e)
    public static int[][] speile(int[][] matrise) {
        int[][] nyMatrise = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                nyMatrise[i][j] = matrise[j][i];
            }
        }
        return nyMatrise;
    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int[][] nyMatrise = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                int sum = 0;

                for (int x = 0; x < a.length; x++) {
                    sum += a[i][x] * b[x][j];
                }
                nyMatrise[i][j] = sum;
            }
        }

        return nyMatrise;

    }
}
