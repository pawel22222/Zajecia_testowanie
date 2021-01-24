package zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("text.txt");

//        boolean exist = plik.exists();
//        System.out.println(exist);
//        String abPath = plik.getAbsolutePath();
//        System.out.println(abPath);
        Scanner sc = new Scanner(plik);

        String text = "";
        while (sc.hasNext()) {
            text = text + sc.nextLine() + " ";
        }
        System.out.println(text);

        System.out.println(ileSlow(text, ' '));
    }

    public static int ileSlow(String tekst, char separator) {
        int ile_slow = 0;
        char znak_z_napisu;
        for (int i = 0; i < tekst.length(); i++) {
            znak_z_napisu = tekst.charAt(i);
            if (znak_z_napisu == separator) {
                ile_slow++;
            }
        }
        return ile_slow;
    }

}
