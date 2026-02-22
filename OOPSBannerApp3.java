public class OOPSBannerApp3 {

    public static void main(String[] args) {

        String O1 = String.join("\n",
                " *** ",
                "**  **",
                "**  **",
                "**  **",
                "**  **",
                " *** "
        );

        String O2 = String.join("\n",
                " *** ",
                "**  **",
                "**  **",
                "**  **",
                "**  **",
                " *** "
        );

        String P = String.join("\n",
                "***** ",
                "**  **",
                "***** ",
                "**     ",
                "**     ",
                "**     "
        );

        String S = String.join("\n",
                " *****",
                "**     ",
                " **** ",
                "     **",
                "     **",
                "***** "
        );

        String banner = String.join("\n\n", O1, O2, P, S);

        System.out.println(banner);
    }
}



             