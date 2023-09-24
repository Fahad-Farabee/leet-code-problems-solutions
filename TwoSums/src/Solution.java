class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j;

        for(int i = 0 ; i<nums.length; i++){
            if(i != nums.length-1){
                j = i+1;
                if(nums[j] == target-nums[i]){
                    return new int[] {i,j};
                }
            } else if (i == nums.length - 1) {
                j = 0;
                if (nums[j] == target-nums[i]){
                   return new int[] {i,j};
                }
            }
        }

        return nums;
    }
}
