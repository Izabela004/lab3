import java.util.Scanner;

public class liczenie {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz zdanie z liczbami: ");
        String zdanie = in.nextLine();

        int c = 0;
        for(int i = 0; i < zdanie.length(); i++) {
            if(zdanie.charAt(i) >= 48 && zdanie.charAt(i) <= 57)
                c += Character.digit(zdanie.charAt(i), 10);
        }
        System.out.println("Suma liczb znajdujacych sie w zdaniu: " + c);
    }
}
