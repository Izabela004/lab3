import java.util.Scanner;
public class Konwersja {
    public static void main(String[] args) {

        int[] q=new int[32];
        int x = 0;
        int y= 0;
        int z=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe do konwersij: ");
        int r = scanner.nextInt();

        if(r<0){
            y=1;
            x=r*-1;
        } else
            x=r;


        for(int i=0; x>0; i++){
            q[i]=x%2;
            x/=2;
            z++;
        }

        System.out.println("Podana liczba: " + r);
        System.out.print("Wynik: " + y + ".");

        for(int j=z-1; j>=0; j--){
            System.out.print(q[j]);
        }
    }
}
