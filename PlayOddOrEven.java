import java.util.Scanner;
import java.util.Random;

public class PlayOddOrEven {

    static int runsPlay(char a, int n, int game) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int runs = 0, uNum, sNum;
        do {
            if (runs == 0) {
                if (a == 'u')
                    System.out.println("YOU ARE BATTING NOW!");
                else
                    System.out.println("SYSTEM IS BATTING NOW!");
            }
            sNum = r.nextInt(7);
            System.out.println("Your Choice");
            uNum = s.nextInt();

            if (uNum > 6 || uNum < 0) {
                System.out.println("ERROR: CHOOSE A NUMBER BETWEEN 0 TO 6");
            } else {
                System.out.println("\t" + uNum + "\t\t\t\t" + sNum);
                if (uNum == sNum) {
                    System.out.println("OUT!");
                    if (n == 1)
                        System.out.println("RUNS TO WIN: " + runs + "\n");
                    break;
                } else {
                    runs = (a == 'u') ? ((uNum == 0) ? (runs + sNum) : (runs + uNum))
                            : ((sNum == 0) ? (runs + uNum) : (runs + sNum));
                    System.out.println("Current Runs: " + runs);
                    if (n == 2 && runs > game) {
                        System.out.println("GAME OVER!\n");
                        break;
                    }
                }
            }
        } while (true);
        return runs;
    }

    static void playGame() {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        String uSelect, sSelect;
        int uNum, sNum, uChoice = 0, sChoice = 0, uRuns, sRuns;

        System.out.println("\nLet's Play!");
        System.out.println("Choose: Odd or Even");
        uSelect = s.nextLine();
        sSelect = (uSelect.equalsIgnoreCase("odd") || uSelect.equalsIgnoreCase("even"))
                ? (uSelect.equalsIgnoreCase("odd") ? "Even" : "Odd")
                : "0";

        if (sSelect.equals("0")) {
            System.out.println("ERROR: INVALID CHOICE!");
            return;
        }
        System.out.println("\nYour Choice: " + uSelect.toUpperCase() + "\t\tSystem Choice: " + sSelect.toUpperCase());

        System.out.println("\nChoose a Number");
        sNum = r.nextInt(7);
        uNum = s.nextInt();

        if (uNum > 6 || uNum < 0) {
            System.out.println("ERROR: CHOOSE A NUMBER BETWEEN 0 TO 6");
            return;
        }
        System.out.println("\t" + uNum + "\t\t\t\t" + sNum);
        String sum = ((uNum + sNum) % 2 == 0) ? "even" : "odd";
        System.out.println("\t\t" + (uNum + sNum) + " : IT'S " + sum.toUpperCase());
        System.out.println("\nBatting(1) or Bowling(2)\n");
        if (uSelect.equalsIgnoreCase(sum)) {
            System.out.println("Your Choice");
            uChoice = s.nextInt();
            System.out.println();
            if (uChoice == 1)
                System.out.println("  BATTING\t\t\t  BOWLING");
            else if (uChoice == 2)
                System.out.println("  BOWLING\t\t\t  BATTING");
            else {
                System.out.println("ERROR: INVALID CHOICE!");
                return;
            }
        } else {
            System.out.println("System Choice");
            sChoice = r.nextInt(2) + 1;
            System.out.println(sChoice + "\n");
            if (sChoice == 1)
                System.out.println("  BOWLING\t\t\t  BATTING");
            else if (sChoice == 2)
                System.out.println("  BATTING\t\t\t  BOWLING");
        }

        System.out.println("\nLet's Begin...");
        if (uChoice == 1 || sChoice == 2) {
            uRuns = runsPlay('u', 1, 0);
            sRuns = runsPlay('s', 2, uRuns);
        } else {
            sRuns = runsPlay('s', 1, 0);
            uRuns = runsPlay('u', 2, sRuns);
        }
        System.out.println("Your Runs: " + uRuns + "\t\t\t  System Runs: " + sRuns);
        if (uRuns > sRuns)
            System.out.println("YOU WIN!");
        else
            System.out.println("YOU LOSE!\nBETTER LUCK NEXT TIME");
    }

    public static void main(String[] args) {
        do {
			String asciiArt = 
            "   ____      _     _                ______               \n" +
            "  / __ \\    | |   | |              |  ____|              \n" +
            " | |  | | __| | __| |   ___  _ __  | |____   _____ _ __  \n" +
            " | |  | |/ _` |/ _` |  / _ \\| '__| |  __\\ \\ / / _ \\ '_ \\ \n" +
            " | |__| | (_| | (_| | | (_) | |    | |___\\ V /  __/ | | |\n" +
            "  \\____/ \\__,_|\\__,_|  \\___/|_|    |______\\_/ \\___|_| |_|";
            
        	System.out.println(asciiArt);
            Scanner s = new Scanner(System.in);
			
			System.out.println(" ");
			System.out.println("  -----------------------------------------------------");
            System.out.println("| Press Enter to start the game or type 'exit' to quit |");
			System.out.println("  -----------------------------------------------------");

            String input = s.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Bye, Have A Nice Day...");
                System.exit(0);
            } else {
                playGame();
            }
        } while (true);
    }
}
