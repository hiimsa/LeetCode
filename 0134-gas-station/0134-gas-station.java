class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        // var to track if posible or not
        // if the suplus is negative at any point of time will update the start point. 
        // will start fron 0 and see if the surplus go negative 
        int surplus = 0;
        int canComplete = 0;
        int start = 0;
        for(int i=0; i<cost.length; i++){
            canComplete += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if(surplus < 0){
                surplus = 0;
                start = i + 1;
            }
        }
        return canComplete < 0 ? -1 : start;
    }
}