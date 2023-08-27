package entities;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Iphone implements Telefone, Browser, MidiaPlayer {

    private boolean pause;

    public boolean isPause() {
        return pause;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }

    // Method making a call
    @Override
    public boolean call(String number) {
        System.out.println("Calling..." + number);
        System.out.println("Hellô!");
        return true;
    }

    // Method answering a call
    @Override
    public boolean answer() {
        if (playing()) {
            System.out.println("Answering...");
            return true;
        }
        hangUp();
        return false;
    }
    // Method start voice email

    @Override
    public void startVolceEmail() {
        if (!answer()) {
            System.out.println("Start voice email...");
        }
    }

    // Method phone playing
    @Override
    public boolean playing() {
        this.pause = true;
        System.out.println("Phone playing....");
        return true;
    }

    // Method show home page
    @Override
    public void showPage() {
        System.out.println("Welcome home page");
    }
    // Method adding new Tab

    @Override
    public void addNewTab(String newTab) {
        String tab = newTab;
        System.out.println("New tab " + tab);
    }

    // Method adding new Page
    @Override
    public void addNewPage(String newPage) {
        String page = newPage;
        System.out.println("New page " + page);
    }

    // Method upadeting Page
    @Override
    public void updatePage(String page) {
        System.out.println("Updated page " + page);
    }

    // Method playing music
    @Override
    public void playeingMusic() {
        if (playing() == false) {
            System.out.println("The music is playing...");
        }

    }

    // Method Start
    @Override
    public void start() {
        this.pause = false;
        System.out.println("Stating...");

    }
    // Method Stop

    @Override
    public void stop() {
        this.pause = true;
        System.out.println("Stop...");

    }

    @Override
    public boolean hangUp() {
        System.out.println("Decline call...");
        return true;
    }

    /*
       Selecione su amisica favorita, e deixe que ele toca para você.
       Trabalhando estrutura condional e laços de repetições
       
     */
    @Override
    public void selecMusic() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (!isPause()) {
            do {
                System.out.println("-----Select your favorite music-----\n");
                System.out.print("  [1]");
                System.out.print("  [2]");
                System.out.print("  [3]");
                System.out.print("  [4]");
                System.out.println("  [5]");
                System.out.print("  [6]");
                System.out.print("  [7]");
                System.out.print("  [8]");
                System.out.print("  [9]");
                System.out.println("  [10]");
                System.out.print("\n  Enter [0] to stop\n");
                n = Integer.parseInt(sc.next());
                switch (n) {
                    case 1:
                        System.out.println("Music 1");
                        start();
                        playeingMusic();
                        break;
                    case 2:
                        System.out.println("Music 2");
                        start();
                        playeingMusic();
                        break;
                    case 3:
                        System.out.println("Music 3");
                        start();
                        playeingMusic();
                        break;
                    case 4:
                        System.out.println("Music 4");
                        start();
                        playeingMusic();
                        break;
                    case 5:
                        System.out.println("Music 5");
                        start();
                        playeingMusic();
                        break;
                    case 6:
                        System.out.println("Music 6");
                        start();
                        playeingMusic();
                        break;
                    case 7:
                        System.out.println("Music 7");
                        start();
                        playeingMusic();
                        break;
                    case 8:
                        System.out.println("Music 8");
                        start();
                        playeingMusic();
                        break;
                    case 9:
                        System.out.println("Music 9");
                        start();
                        playeingMusic();
                        break;
                    case 10:
                        System.out.println("Music 10");
                        start();
                        playeingMusic();
                        break;
                    case 0:
                        System.out.println("Bye bye!");
                        break;
                    default:
                        System.out.println("Invalid option! try again...");
                }
            } while (n != 0);
        }
    }

}
