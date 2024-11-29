class Solution {
    public String longestCommonPrefix(String[] strs) {

        String result = "";
        String shortStr = "";
        int shortStrIndex = 0;
        int shortLen = 200;

        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<shortLen){
                shortLen = strs[i].length();
                shortStr = strs[i];
                shortStrIndex = i;
            }
        }
        int commonIndex = -1;
        boolean flag = false;
        for(int i =shortStr.length();i>0;i--){
            String compareStr = shortStr.substring(0,i);
            int count = 0;
            for(int j=0;j<strs.length;j++){
                String testStr = strs[j].substring(0,i);
                if(!compareStr.equals(testStr)){
                    break;
                } else {
                    count ++;
                }
            }
            if(count == strs.length){
                commonIndex = i;
                flag = true;
                break;
            }
            if(flag){
                break;
            }
        }

        if(commonIndex >=0){
            result = shortStr.substring(0,commonIndex);
        }

        return result;
    }
}