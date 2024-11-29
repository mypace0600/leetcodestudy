class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int t = k%len;
        int s = len - t;
        int[] temp = new int[len];
        int index = 0;
        for(int i=s;i<len;i++){
            temp[index] = nums[i];
            index++;
        }
        for(int i=0;i<s;i++){
            temp[index] = nums[i];
            index++;
        }
        for(int i=0;i<len;i++){
            nums[i]=temp[i];
        }
    }
}