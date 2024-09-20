public class SimpleStartup {

    public String checkYourself(int guess) {
        // Make a variable to hold the result that we'll return. put "miss" in as the default cuz we assume the miss
        String result ="miss";

        // repeat with each cell in the locationCells array (each cell location of the object)
        for (int cell : locationCells) {
            // Compare the user guess to this element(cell) in the array
            if (guess == cell ) {
                // we got a hit
                result = "hit";

                numOfHits++;

                // get out of the loop, no need to test other cells
                break;
            } // end if
        } // end for

        // we're out of the loop, let's see if we're dead (hit 3 times) and change the result String to "kill"
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        // Display the result for the user ("miss", unless it was changed to "hit" or "kill")
        System.out.println(result);
        // Return the result back to the calling method
        return result;
    } // end method

    public static void main(String[] args) {
        // instantiate a SimpleStartup object
        SimpleStartup dot = new SimpleStartup();

        // Make an int array for the location of the Startup (3 consecutive ints out of a possible 7)
        int[] locations = {2, 3, 4};

        //invoke the setter method on the startup
        dot.setLocationCells(locations);

        // Make a fake user guess
        int userGuess = 2;

        // Invoke the checkYourself() method on the Startup object, and pass it the fake guess
        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {

            // if the fake guess (2) gives back a "hit", it's working
            testResult = "passed";

        }
        // Print out the test result ("passed" or "failed")
        System.out.println(testResult);

    }

}
