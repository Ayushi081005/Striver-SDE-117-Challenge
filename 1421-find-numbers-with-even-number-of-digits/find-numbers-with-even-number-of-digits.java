class Solution {
    public int findNumbers(int[] nums) {
        int evendigit = 0; 

        for(int num : nums){
            int count=0;
            int n= num;
        
        while (n>0){
            count++;
            n= n/10;
        }
        if(count%2 == 0){
            evendigit++;
        }
    }
    return evendigit;
}
}