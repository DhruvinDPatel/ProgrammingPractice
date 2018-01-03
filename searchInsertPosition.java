class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(nums == null)
            return -1;
        
        int i = 0, n = nums.length, j = n-1;
        
        if(target > nums[n-1])
            return n;
        
        while(i < j){
            int mid = (i + j)/2;
        
            if(target > nums[mid])
                i = mid + 1;
            else
                j = mid;
        }
        
        return j;
    }
}