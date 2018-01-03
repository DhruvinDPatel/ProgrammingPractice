class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        if(nums==null || nums.length==0)
            return 0;
 
        int i=0, j=0, sum=0, minLen = Integer.MAX_VALUE, n = nums.length;

        while(j < n){
            if(sum < s)
                sum += nums[j++];        
            else{
                minLen = Math.min(minLen, j-i);
                if(i==j-1)
                    return 1;

                sum -=nums[i++];
            }
        }

        while(sum>=s){
            minLen = Math.min(minLen, j-i);
            sum -=nums[i++];
        }

        return minLen==Integer.MAX_VALUE? 0: minLen;
    }
}