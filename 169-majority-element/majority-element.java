class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int mid = len/2;
        return nums[mid];
    }
}