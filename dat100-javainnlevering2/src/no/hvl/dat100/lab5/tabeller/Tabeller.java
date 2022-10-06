package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {
        for (int i = 0; i < tabell.length; i++) {
            if (i != tabell.length - 1) {
                System.out.print(tabell[i] + ", ");
            } else {
                System.out.print(tabell[i]);
            }
        }

    }

    // b)
    public static String tilStreng(int[] tabell) {
        if(tabell.length== 0){
            return "[]";
        }
        String resultat = "";
        int i = 0;

		/*if (tabell.length == 0) {
		return "[]";
		}*/

        while (i < tabell.length - 1) {
            resultat = resultat + tabell[i] + ",";
            i++;
        }
        resultat = resultat + tabell[i];
        return ("[" + resultat + "]");

    }

    // c)
    // regular for loop
    public static int summer(int[] tabell) {
        int sum = 0;

        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }

        return sum;
    }

    // c)
    // enhanced for loop
    public static int summer_b(int[] tabell) {
        int sum = 0;
        for (int j : tabell) {
            sum += j;
        }
        return sum;
    }

    // c)
    // while loop
    public static int summer_c(int[] tabell) {
        int sum = 0;
        int i = 0;

        while (i < tabell.length) {
            sum += tabell[i];
            i++;
        }
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int i : tabell) {
            if (i == tall) {
                return true;
            }
        }
        return false;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }

        return -1;

    }

    // f)
    public static int[] reverser(int[] tabell) {
        int ny = tabell.length;
        int[] nyTabel = new int[ny];

        for (int i = 0; i < nyTabel.length; i++) {
            nyTabel[i] = tabell[i];
        }
        for (int r = 0; r < nyTabel.length / 2; r++) {

            int t = nyTabel[r];

            nyTabel[r] = nyTabel[nyTabel.length - r - 1];

            nyTabel[nyTabel.length - r - 1] = t;
        }
        return nyTabel;
    }

    // g)
    public static boolean erSortert(int[] tabell) {
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i - 1] > tabell[i]) {
                return false;
            }
        }

        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int nyLength = tabell1.length + tabell2.length;
        int[] nyTabell = new int[nyLength];

        for (int i = 0; i < tabell1.length; i++) {
            nyTabell[i] = tabell1[i];
        }
        for (int a = 0; a < tabell2.length; a++) {
            nyTabell[tabell1.length + a] = tabell2[a];
        }
        return nyTabell;
    }
}
