import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        System.out.println(areYouPlayingBanjo(nome));

    }

    public static String areYouPlayingBanjo(String name) {
        // Program me!

        String playBanjo;
        if (name.charAt(0) == 'r' || name.charAt(0) == 'R') {
            playBanjo = name + " plays banjo";
        } else {
            playBanjo = name + " does not play banjo";
        }

        return  playBanjo;

    }
}
