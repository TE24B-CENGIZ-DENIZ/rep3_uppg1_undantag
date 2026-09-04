import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int[] array = new int[4];
        IO.println(Arrays.toString(array));

        int val = 0;
        while (val != 4) {
            IO.println("MENY: ");
            IO.println("1. Lägg in tal i arrayen på en viss plats");
            IO.println("2. Nollställ ett tal i arrayen på en viss plats");
            IO.println("3. Flytta ett tal i arrayen från en plats till en annan,");
            IO.println("4. Avsluta");
            int tal = 0;
            int plats = 0;
            int ny_plats = 0;
            IO.println("Array:" + Arrays.toString(array));
            IO.print("Ange val:");
            try {
                val = Integer.parseInt(IO.readln("Ange val:"));
            } catch (NumberFormatException e) {
                IO.println("opps ej ett tal");
                return;
            }

            switch (val) {
                case 1 -> {
                    try {
                        tal = Integer.parseInt(IO.readln("Ange tal:"));

                    } catch (NumberFormatException c) {
                        IO.println("opps ej ett tal");
                        return;
                    }
                    IO.print("Ange plats:");
                    plats = Integer.parseInt(IO.readln("Ange plats:"));
                    array[plats] = tal;
                }
                case 2 -> {
                    plats = Integer.parseInt(IO.readln("Ange plats som ska nollställas:"));
                    try {
                        array[plats] = 0;
                    } catch (ArrayIndexOutOfBoundsException o) {
                        IO.println("ej i array bounds försök igen med mindre tal");
                        return;
                    }

                }
                case 3 -> {
                    try {
                        plats = Integer.parseInt(IO.readln("Ange plats för tal som ska flyttas:"));
                        
                    } catch (NumberFormatException t) {
                       IO.println("ej ett nummer");
                       return;
                    }
                    IO.print("Ange ny plats som talet  ska flyttas till:");
                    int temp = array[ny_plats];
                    try {
                        array[ny_plats] = array[plats];
                            
                    } catch (ArrayIndexOutOfBoundsException s) {
                        IO.print("platsen finns ej i listan försök igen");
                        return;
                    }
                    array[plats] = temp;
                }
                case 4 -> IO.println("Ajöken");

                default -> IO.println("Fel val, välj en siffra 1-4");
            }

        }
    }

}
