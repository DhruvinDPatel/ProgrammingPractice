class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length < 2)
            return nums.length;
        
        int j = 0, n = nums.length;
        
        for(int i = 0; i < n - 1; i++){
            
            if(nums[i] != nums[i+1])
                nums[j++] = nums[i];
        }
        
        nums[j++] = nums[n - 1];
        return j;
    }
}