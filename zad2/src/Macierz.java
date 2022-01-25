import java.util.Random;
public class Macierz {

        public static void main(String [] args){

            Random rand = new Random();
            int[][] tablicaInt = new int[5][5];

            int kolMax = 0;
            int kolMin = 0;
            int [] tablicaMax = new int[5];
            int [] tablicaMin = new int[5];

            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    int a = rand.nextInt(11)-5;
                    System.out.print(" "+String.valueOf(tablicaInt[i][j] = a) + " ");
                }
                System.out.print("");
            }

            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    int p =tablicaInt[i][j];
                    if(p>kolMax){
                        kolMax = p;
                    }
                    if(p<kolMin){
                        kolMin = p;
                    }
                }

                tablicaMax[i]=kolMax;
                tablicaMin[i]=kolMin;
                kolMax=0;
                kolMin=0;
            }

            System.out.println("");
            System.out.println("Maksymalna liczba w kolumnie:");
            for(int i=0; i<tablicaMax.length; i++){
                System.out.println(i + " : " + tablicaMax[i]);
            }

            System.out.println("Minimalna liczba w kolumnie:");
            for(int i=0; i<tablicaMin.length; i++){
                System.out.println(i + " : " + tablicaMin[i]);
            }

        }
    }
