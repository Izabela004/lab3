    import java.util.Scanner;
    import java.util.Arrays;
    import java.util.ArrayList;

public class Wspolnydzielnik {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("wprowadz wartosc wieksza od zera: ");
        int l = in.nextInt();
        if(l <= 0)
            System.out.println("Zla liczba");
        else{
            boolean a[][] = new boolean[l][l];
            ArrayList<Integer> x = new ArrayList<Integer>();
            ArrayList<Integer> y = new ArrayList<Integer>();
            int fc;
            int gc;
            int f;

            for(int i = 0; i < l; i++){
                x.add(0);
            }

        for(int i = 0; i < l; i++){
                y.add(0);
        }

       for(int i = 0; i < l; i++){
           for(int j = 0; j < l; j++){
               fc = 0;
               gc = 0;

           for(int z = 0; z < l; z++){
               x.set(z, 0);
               y.set(z, 0);
           }

           for(int kc = 2; kc <= l; kc++){
               if((i+1) % kc == 0 && (i+1) != 1){
                   x.set(fc, kc);
                   fc++;
               }
           }

           for(int kc = 2; kc <= l; kc++){
               if((j+1) % kc == 0 && (j+1) != 1){
                   y.set(gc, kc);
                   gc++;
               }
           }
           f = 0;

           for(int k = 0; k < x.size(); k++){
               for(int t = 0; t < y.size(); t++){
                   if(x.get(k) == y.get(l) && x.get(k) > 1 && y.get(l) > 1)
                       f = 1;
               }
           }

           if(f == 1)
               a[i][j] = false;
           else
               a[i][j] = true;
           }

            }
            if(l >= 10)
                System.out.print("  ");
            else
                System.out.print(" ");

            for(int i = 0; i < l; i++){
                System.out.print(" " + (i+1));
            }

            System.out.println("");

            for(int i = 0; i < l; i++){
                System.out.print((i+1));
                if(l >= 10 && i < 9)
                    System.out.print(" ");

                for(int j = 0; j < l; j++){
                    if(j >= 10){
                        if(a[i][j])
                            System.out.print(" + ");
                        else
                            System.out.print(" . ");
                    }
                    else{
                        if(a[i][j])
                            System.out.print(" +");
                        else
                            System.out.print(" .");
                    }
                }
                System.out.println("");
            }
        }
    }




}
