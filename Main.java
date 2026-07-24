import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.indexOf(0));
        }
    }
}