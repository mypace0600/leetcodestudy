class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr = new int[20001];
        for(int n : nums){
            arr[n+10000]++;
        }
        int index = 0;
        for(int i=0;i<20001;i++){
            if(arr[i]==1){
                nums[index] = i-10000;
                index++;
            } else if(arr[i]==2){
                nums[index] = i-10000;
                index++;
                nums[index] = i-10000;
                index++;
            } else if(arr[i]>2){
                nums[index] = i-10000;
                index++;
                nums[index] = i-10000;
                index++;
            }
        }
        return index;
    }
}