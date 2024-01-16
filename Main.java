import java.util.Scanner;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Nombre de tours voulu (entre 1 et 100) : ");
        Scanner sc = new Scanner(System.in);
        int tours = Integer.parseInt(sc.nextLine());

        int scoreA = 0;
        int scoreB = 0;
        int totalA = 0;
        int totalB = 0;

        Random random = new Random();

        for(int i=0; i<tours; i++){
            int cardA = random.nextInt(10) + 1;
            int cardB = random.nextInt(10) + 1;

            // Comparaison des cartes et attribution des points
            if (cardA > cardB) {
                scoreA++;
                totalA += cardA;
            } else if (cardB > cardA) {
                scoreB++;
                totalB += cardB;
            }
        }

        // Détermination du gagnant final
        if (scoreA > scoreB) {
            System.out.println("Le joueur A gagne"); // Joueur A gagne
        } else if (scoreA < scoreB){
            System.out.println("Le joueur B gagne"); // Joueur B gagne
        } else {
            if (totalA > totalB){
                System.out.println("Égalité, mais au total le joueur A gagne"); // Joueur A gagne
            }else{
                System.out.println("Égalité, mais au total le joueur B gagne"); // Joueur B gagne
            }
        }


    }
}