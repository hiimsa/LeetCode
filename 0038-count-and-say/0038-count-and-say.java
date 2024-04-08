class Solution {
    public String countAndSay(int n) {
        String result = "1";
        
        // loop to n
        for(int i=1; i<n; i++){
           // counter init to 1
           int count = 1;
           String temp = "";
           // traverse result
           for(int j=0; j<result.length(); j++){
                // pop number
                char c = result.charAt(j);
                if(j+1<result.length() && c == result.charAt(j+1)){
                    // if repeats with last char then inc the counter
                    count++;
                }
                else{
                 // result = counter + number
                 temp += Integer.toString(count) + Character.toString(c); 
                 count = 1;
                }
           }
           result = temp;
        }
        return result;
    }
}