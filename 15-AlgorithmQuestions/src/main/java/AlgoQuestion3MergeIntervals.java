import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgoQuestion3MergeIntervals {
    public static void main(String[] args) {
        int[][] array={{1,4},{3,3},{4,7},{6,8},{9,10}};
        System.out.println(Arrays.deepToString(mergeIntervals(array)));
    }
    public static int[][] mergeIntervals(int[][] intervals){
        int[][] sortedIntervals=intervals.clone();
        // O(nlog(n))
        Arrays.sort(sortedIntervals,(a, b)->Integer.compare(a[0],b[0]));
        List<int[]> mergedIntervals=new ArrayList<>();
        int[] currentInterval=sortedIntervals[0];
        mergedIntervals.add(currentInterval);
        // O(n)
        for(int[] nextInterval:sortedIntervals){
            int currentIntervalEnd=currentInterval[1];
            int nextIntervalStart=nextInterval[0];
            int nextIntervalEnd=nextInterval[1];

            if (currentIntervalEnd>=nextIntervalStart){
                //currentInterval[1]=Math.max(currentIntervalEnd, nextIntervalEnd);
                currentInterval[1]=nextIntervalEnd;
            } else{
                currentInterval=nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
// Total O(nlog(n)+ O(n)) = O(nlog(n))
    }
}
