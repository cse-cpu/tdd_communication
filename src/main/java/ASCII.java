public class ASCII {

    public int calculateASCII(String text) {
        // Initialize variable int to hold each ASCII value from text
        int total = 0;

        // Iterate through array to find ASCII value of each string character
        if (text.isEmpty()) {
            System.out.println("The string is empty");
            return 0;
        }

        for (int i = 0; i < text.length(); i++) {
            // Initialize variable that cast char to int
            int value = (int) text.charAt(i);
            total += value;
        }

        return total;
    }
}