

public class OOPSBannerApp5 {
    public static void main(String[] args) {
        // Define String Array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for the letters O, O, P, S
        String[] lines = {
            String.join(" ", " *** ", " *** ", "******", " ***** "),
            String.join(" ", "** **", "** **", "**  **", "** "),
            String.join(" ", "** **", "** **", "**  **", "** "),
            String.join(" ", "** **", "** **", "******", "  *** "),
            String.join(" ", "** **", "** **", "** ", "    ** "),
            String.join(" ", "** **", "** **", "** ", "    ** "),
            String.join(" ", " *** ", " *** ", "** ", "***** ")
        };

          for (String line : lines) {
            System.out.println(line);
        }
    }
}