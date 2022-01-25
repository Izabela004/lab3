import java.util.Scanner;

public class powtorzenieznaku {
    public static void main(String [] args){
        String s;
        int licz = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Wpisz jedno słowo: ");
        s = scan.next();
        System.out.println(s + " - podane slowo");


        char lastValue = s.charAt(s.length()-1);
        for(int i = 0; i < s.length(); i++) {
            char actualValue = s.charAt(i);
            if(actualValue == lastValue){
                licz++;
            }
        }
        System.out.println("znaku: " + lastValue + " w słowie jest: " + licz);
    }

}
