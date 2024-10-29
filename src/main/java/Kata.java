// create a class which has a method to sum all the numbers of a given array, except for the lowest and highest elements

import java.util.Arrays;

public class Kata {

    public int sumAllNumbers (int [] numbers) {
        // initialize variable int to hold each value from numbers

        int total = 0;

        if (numbers == null) {
            return total;
        }

    /// loop through array and increment total with each number in the array

        Arrays.sort(numbers);
        if (numbers.length > 2) {
//            for (int number : numbers) {
//                if (number == numbers[0] && number == numbers.length - 1) {
//                    continue;
//                }
//                total += number;
//            }

            for (int i = 1; i < numbers.length - 1; i++) {
                if (numbers[i] == numbers[0] && numbers[i] == numbers.length - 1) {
                  continue;
                }
                total += numbers[i];
            }
        }



        return total;


//        for (int number: numbers) {
//            total += number;
//        }
//
//        int x = Arrays.stream(numbers).max().getAsInt() + Arrays.stream(numbers).min().getAsInt();
//        return total - x;
    }
}
