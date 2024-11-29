class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int len = s.length();
        int lenTest = 0;
        for(int i=0;i<len-1;i++){
            if(replace(s.charAt(i))>=replace(s.charAt(i+1))){
                result += replace(s.charAt(i));
                lenTest++;
            } else {
                result += replace(s.charAt(i+1));
                result -= replace(s.charAt(i));
                i++;
                lenTest+=2;
            }
        }
        if(lenTest<len){
            result+=replace(s.charAt(len-1));
        }
        return result;
    }

    public int replace(char a){
        if(a=='I'){
            return 1;
        } else if(a=='V'){
            return 5;
        } else if(a=='X'){
            return 10;
        } else if(a=='L'){
            return 50;
        } else if(a=='C'){
            return 100;
        } else if(a=='D'){
            return 500;
        } else if(a=='M'){
            return 1000;
        } else{
            return 0;
        }
    }
}