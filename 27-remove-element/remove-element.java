class Solution {
    public int removeElement(int[] nums, int val) {
        int[] intArr = new int[101];
        int index = 0;
        for(int num : nums){
            if(num != val){
                intArr[index] = num;
                index++;
            }
        }
        for(int i=0;i<index;i++){
            nums[i] = intArr[i];
        }
        return index;
    }
}