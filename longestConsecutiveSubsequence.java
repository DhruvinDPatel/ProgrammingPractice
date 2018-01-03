class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return 0;
        
        Set<Integer> hs = new HashSet<Integer>();
        int max = 1, n = nums.length;
        
        for(int i: nums)
            hs.add(i);
        
        for(int value: nums){
            
            int count = 1, left = value - 1, right = value + 1;
            
            while(hs.contains(left)){
                count++;
                hs.remove(left--);
            }
            
            while(hs.contains(right)){
                count++;
                hs.remove(right++);
            }
            
            max = Math.max(max, count);
            
        }      
        
        return max;
    }
}