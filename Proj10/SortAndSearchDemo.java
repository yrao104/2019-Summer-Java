import java.util.Arrays;

/**
*   This program demonstrates the merge sort algorithm by
*   5 sorting an array that is filled with random numbers.
*/
public class SortAndSearchDemo {
    
    public static void main(String[] args) {
        // Create a random array of integers
        int maxVal = 100;
        int[] a = ArrayUtil.randomIntArray(20, maxVal);
        
        // Sort the array with merge sort
        System.out.println("Original:\n" + Arrays.toString(a));
        MergeSorter.sort(a);
        System.out.println("Sorted:\n" + Arrays.toString(a));
        
        // Search the array with binary search
        int count = a.length;
        int targetVal = (int) (Math.random() * maxVal);
        int targetIndx = BinarySearcher.search(a, 0, count, targetVal);
        System.out.println("\nSearched for " + targetVal + ", and found at index " + targetIndx);
        
        targetVal = a[(int) (Math.random() * count)];
        targetIndx = BinarySearcher.search(a, 0, count, targetVal);
        System.out.println("Searched for " + targetVal + ", and found at index " + targetIndx);
        
        // Create a random array of integers
        String[] b = ArrayUtil.stringArray();
        
        // Sort the array with merge sort
        System.out.println("\nOriginal:\n" + Arrays.toString(b));
        MergeSorter.sort(b);
        System.out.println("Sorted:\n" + Arrays.toString(b));
        
        // Search the array with binary search
        int count1 = b.length;
        String targetVal1 = "blue";
        int targetIndx1 = BinarySearcher.searchString(b, 0, count1, targetVal1);
        System.out.println("\nSearched for " + targetVal1 + ", and found at index " + targetIndx1);
        
        targetVal1 = b[(int) (Math.random() * count1)];
        targetIndx1 = BinarySearcher.searchString(b, 0, count1, targetVal1);
        System.out.println("Searched for " + targetVal1 + ", and found at index " + targetIndx1);
    }
}