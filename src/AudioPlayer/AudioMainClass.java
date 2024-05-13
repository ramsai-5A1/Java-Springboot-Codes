package AudioPlayer;
import java.util.*;

public class AudioMainClass {

    public static void printMenu() {
        System.out.println("\n\n********************************************\n");
        System.out.println("Audio-player");
        System.out.println("1 - Add New Song into library");
        System.out.println("2 - Read all songs from library");
        System.out.println("3 - Read all songs from specific movie");
        System.out.println("4 - Update existing song from library");
        System.out.println("5 - Delete existing song from library");
        System.out.println("6 - Exit");
        System.out.println("\n\n********************************************\n");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        AudioController audioController = new AudioController();

        while (true) {
            printMenu();
            
            System.out.println("Choose one option from above:");
            int option = scn.nextInt();
            boolean shouldExit = false;

            switch(option) {
                case 1:
                    audioController.addSongIntoLibrary();
                break;

                case 2:
                    audioController.printAllSongsFromLibrary();
                break;

                case 3:
                    audioController.printAskedMovieSongsFromLibrary();
                break;

                case 4:
                    audioController.updateSongFromLibaray();
                break;

                case 5:
                    audioController.deleteSongFromLibrary();
                break;

                case 6:
                    shouldExit = true;
                break;

                default:
                    System.out.println("Choose appropriate option");
            }

            if (shouldExit) {
                System.out.println("Thanks for choosing our Audio player, Please rate us on Playstore");
                break;
            }
        }
    }

}
