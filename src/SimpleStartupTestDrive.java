import java.util.Scanner;

class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(int guess) {
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {

                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}

public class GameHelper {
    public int getUserInput(String prompt) {
        System.out.println(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
public class Game {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleStartup theStartup = new SimpleStartup();

        int randomNum = (int) (Math.random() * 5);

        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            int guess = helper.getUserInput("enter a number");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")) {
                isAlive=false;
                System.out.println("You took " + numOfGuesses+" guesses");
            }
        }
    }

}

public class SimpleStartupTestDrive {

    public static void main(String[] args) {

        SimpleStartup dot = new SimpleStartup();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        int userGuess = -1;
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {

            testResult = "passed";
        }
        System.out.println(testResult);
    }



