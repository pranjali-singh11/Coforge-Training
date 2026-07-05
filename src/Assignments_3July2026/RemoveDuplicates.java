package Assignments_3July2026;
import java.util.LinkedHashSet;
public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] a = {3, 2, 4, 2, 5, 3, 1};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : a) {
            set.add(num);
        }
        int[] res=new int[set.size()];
        int i=0;
        for(int num:set){
            res[i]=num;
            i++;
        }
        System.out.println("Array after removing duplicates:");
        for(int num:res){
            System.out.print(num+" ");
        }
    }
}