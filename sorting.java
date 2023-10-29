import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 4, 2, 8};
        
        // Sorting the array in ascending order
        Arrays.sort(numbers);
        
        // Printing the sorted array
        System.out.println("Sorted in ascending order: " + Arrays.toString(numbers));
        
        // To sort in descending order, you can use a custom comparator
        Arrays.sort(numbers);
        // Reverse the sorted array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Printing the sorted array in descending order
        System.out.println("Sorted in descending order: " + Arrays.toString(numbers));
    }
}
