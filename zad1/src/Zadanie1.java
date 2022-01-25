import java.util.Random;
public class Zadanie1 {

        public static void main(String [] args){
            Random rand = new Random();

            int tablicaInt[] = new int[10];
            int max = 0;
            int min = 0;
            int mniejsze = 0;
            int wieksze = 0;
            float srednia = 0;

            for(int i = 0;i<10;i++){
                int l = rand.nextInt(21)-10;
                tablicaInt[i]= l;
                if(l>max){
                    max = l;
                }
                if(l<min){
                    min = l;
                }
                System.out.println(tablicaInt[i]);
                srednia = srednia + tablicaInt[i];
            }

            System.out.println("");

            srednia = srednia/ tablicaInt.length;
            System.out.println("Srednia: " + srednia);
            System.out.println("Max: "+max+"\n" + "Min: " + min);

            for(int i= 0; i< tablicaInt.length;i++){
                if(tablicaInt[i] < srednia) mniejsze++;
                if(tablicaInt[i] > srednia) wieksze++;
            }
            System.out.println("");
            System.out.println("Suma liczb mniejszych od sredniej: " + mniejsze);
            System.out.println("");
            System.out.println("Suma liczb wiekszych od sredniej: " + wieksze);
            System.out.println("");
            System.out.println("Tablica w odwrotnej kolejnosci: ");

            for(int i= 9; i> 0;i--){
                System.out.println(tablicaInt[i]);
            }
        }
    }

