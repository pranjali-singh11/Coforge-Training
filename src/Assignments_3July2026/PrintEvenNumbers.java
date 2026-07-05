package Assignments_3July2026;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int[]a={2,4,1,3,7,32};
        System.out.print("Even Numbers are:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i]+" ");
            }
        }
    }
}
