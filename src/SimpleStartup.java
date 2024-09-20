public class SimpleStartup {
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
