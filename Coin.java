import java.util.*;

public class Coin {
    public static void main(String[] args) {
        Player playerOne = new Player("Joe");
        Player playerTwo = new Player("Milisa");

        gameLoop(playerOne, playerTwo);
    }

    public static void gameLoop(Player playerOne, Player playerTwo) {
        int flipping = 0;

        while (true) {
            if (playerOne.bankrot()) {
                printWinner(playerOne, flipping);
                break;
            } else if (playerTwo.bankrot()) {
                printWinner(playerTwo, flipping);
                break;
            }
            
            oneFlip(playerOne, playerTwo, flipCoin());
            flipping++;
        }
    }

    public static void printWinner(Player player, int flipping) {
            clearScreen();
            System.out.printf("Game over\n\n");
            System.out.printf("Winner: %s\n", player.name);
            System.out.printf("All flipping: %d\n", flipping);
    }


    public static boolean flipCoin() {
        return Math.random() < 0.5;
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void oneFlip(Player playerOne, Player playerTwo, boolean flipCoin) {
        if (flipCoin) {
            playerOne.coin++;
            playerTwo.coin--;
        } else {
            playerOne.coin--;
            playerTwo.coin++;
        }
    }
}
