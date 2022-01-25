import java.util.Scanner;

public class kodCezara {
    public static void main(String [] args){
        String slowo;
        int klucz;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz slowo: ");
        slowo = scanner.next();
        System.out.println(slowo +" -  slowo");
        System.out.println("Wpisz klucz: ");
        klucz = scanner.nextInt();
        System.out.println(klucz + " -  klucz");

        char[] a = slowo.toCharArray();
        for(int i=0; i < a.length; i++){
            int n = a[i];
            n += klucz;
            a[i] = (char)n;
        }
        System.out.println(new String(a) + " - szyfr cezara");
    }

}
