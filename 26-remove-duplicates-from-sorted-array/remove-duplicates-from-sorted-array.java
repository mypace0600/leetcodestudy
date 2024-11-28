class Solution {
    public int removeDuplicates(int[] nums) {
        int[] arr = new int[201];
        for(int num : nums){
            int t = num+100;
            arr[t]++;
        }
        int cnt = 0;
        for(int a : arr){
            if(a>0){
                cnt++;
            }
        }
        Integer[] result = new Integer[cnt];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                result[index]=i-100;
                index++;
            }
        }
        for(int i=0;i<result.length;i++){
            nums[i]=result[i];
        }
        return cnt;
    }
}