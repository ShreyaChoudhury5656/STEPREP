

public class OOPSBannerApp6 {

    // Method to generate the pattern for the letter 'O'
    public static String[] getO1Pattern() {
        return new String[] {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };
    }
    public static String[] getO2Pattern() {
        return new String[] {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };
    }


    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "****** ",
            "** **",
            "** **",
            "*****",
            "** ",
            "** ",
            "** "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "** ",
            "** ",
            "  *** ",
            "    ** ",
            "    ** ",
            "***** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String Arrays to hold patterns for each letter
        // Call the methods to get the patterns and store them
        String[] O1Pattern = getO1Pattern();
        String[] O2Pattern = getO2Pattern();

        String[] PPattern = getPPattern();
        String[] SPattern = getSPattern();

        // Use the loop to Assemble each line of the banner to create the
        // visual effect for the message "OOPS"
        for (int i = 0; i < O1Pattern.length; i++) {
            // Printing O, O, P, and S side by side with spaces in between
            System.out.println( O1Pattern[i] + " " + O2Pattern[i]+" "+ PPattern[i] + " " + SPattern[i]);
        }
    }
}