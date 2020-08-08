import java.util.HashSet;

public class Question1 {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hs = new HashSet <Integer> ();
        for (int i : arr){
            hs.add(i);
        }
        int count = 0;
        int start = 1;
        while (count < k){
            if (hs.contains (start))
                start++;
            else {
                count++;
                start++;
            }
        }
        return start-1;

    }
}

