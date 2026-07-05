package Assignments_3July2026;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 2, 7, 3};
        int num= 2;
        int count = countOccurrences(arr, num);
        System.out.println("Number of occurrences: " + count);
    }
    public static int countOccurrences(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }

}
