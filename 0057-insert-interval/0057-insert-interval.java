class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> result = new ArrayList<>();
        int i = 0;
        // add all the intervals ending before newInterval starts
        while (i < intervals.length && intervals[i][1] < newInterval[0]){
            result.add(new int[]{intervals[i][0],intervals[i][1]});
            i++;
        }

        // merge all overlapping intervals to one considering newInterval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval = new int[]{ Math.min(newInterval[0], intervals[i][0]), Math.max(newInterval[1], intervals[i][1])};
            i++;
        }
        result.add(newInterval); // add the union of intervals we got
        // add all the rest
        while (i < intervals.length) 
            result.add(intervals[i++]);
    
        int [][]finalRes = new int[result.size()][2];
        i=0;
        for(int []val : result){
           finalRes[i] = val;
           i++;
        }
        return finalRes;
    }
}