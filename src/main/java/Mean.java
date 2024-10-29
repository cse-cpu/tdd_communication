public class Mean {
    // Create method that calculates mean
    public double meanValue (double[] numbers) {
        // Initialize variable int to hold each value from numbers
        double total = 0;

        // Initialize the size of array
        double arraySize = numbers.length;

        // loop through array and increment total with each number in the array
        for (double number: numbers) {
            total += number;
        }

        return total / arraySize;
    }
}
