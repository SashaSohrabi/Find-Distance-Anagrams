/**
 * Calculate the distance between indexes
 * of the smallest and the second smallest
 * numbers in an array.
 *
 * @author (S. Sohrabi)
 * @version (1.0)
 */

public class Main {
    public static void main(String[] args) {
        int[] elements = {23, 45, 34, -100, 45, 4, 38, 56, 2, 49, 1};
        int smallest = elements[0];
        int secondSmallest = elements[0];
        int smallestIndex = 0;
        int secondSmallestIndex = 0;

        for (int i = 0; i < elements.length; i++) {

            if (elements[i] < smallest) {
                secondSmallest = smallest;
                secondSmallestIndex = smallestIndex;
                smallest = elements[i];
                smallestIndex = i;

            }
            if (elements[i] < secondSmallest && elements[i] != smallest) {
                secondSmallest = elements[i];
                secondSmallestIndex = i;
            }

        }
        int distance = secondSmallestIndex - smallestIndex;
        System.out.println(distance);
    }
}