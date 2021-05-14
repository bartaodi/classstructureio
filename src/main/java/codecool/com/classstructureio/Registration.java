package codecool.com.classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg a nevét: ");
        String userName = scanner.nextLine();

        System.out.println("Kérem adja meg az email címét: ");
        String email = scanner.nextLine();

        System.out.println("Az ön regisztrációs adatai: ");
        System.out.println("Felhasználónév: " + userName);
        System.out.println("Email cím: " + email);
    }

}
