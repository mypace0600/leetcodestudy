class Solution {
    public int[] plusOne(int[] digits) {
        boolean plusOne = true;
        for(int i=digits.length-1;i>=0;i--){
            int nowNum = digits[i];
            System.out.println("1 nowNum:"+nowNum);
            System.out.println("1 plusOne:"+plusOne);
            if(plusOne){
                nowNum++;
                System.out.println("2 nowNum:"+nowNum);
                if(nowNum>9){
                    digits[i]=0;
                    plusOne = true;
                } else {
                    digits[i]++;
                    plusOne = false;
                    break;
                }
                System.out.println("2 plusOne:"+plusOne);
            }
            if(nowNum<=9) {
                digits[i]++;
                plusOne = false;
                break;
            }
        }

        if(plusOne){
            int len = digits.length;
            len++;
            int[] result = new int[len];
            result[0]=1;
            for(int i=1;i<len;i++){
                result[1] = digits[i-1];
            }
            return result;
        }
        
        return digits;
    }
}