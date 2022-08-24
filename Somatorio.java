import java.util.Scanner;

/**
 * Somatorio
 */
public class Somatorio {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Digite o numero: ");
        n = s.nextInt();
        System.out.println("Soma de 1 ate "+soma(n));
        System.out.println(inverteStr("kayky", "kayky".length() - 1));

    }
    static int soma(int n){
        if(n==0){
            return 0;
        }else{
            return n + soma(n-1);
        }
    }

    static String inverteStr(String str, int actual) {
        if (actual == 0) return str.charAt(0) + "";
        return str.charAt(actual) + inverteStr(str,  actual- 1);
    }
}