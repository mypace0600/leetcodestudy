class Solution {
    public String addBinary(String a, String b) {
        
        int lenA = a.length();
        int lenB = b.length();
        int gap = lenA-lenB;
        String c = "";
        if(gap>0){
            for(int i=0;i<gap;i++){
                c += "0";
            }
            c+= b;
            b = c;
        } else if(gap<0) {
            gap*=-1;
            for(int i=0;i<gap;i++){
                c += "0";
            }
            c+= a;
            a =c;
        }
        System.out.println(a);
        System.out.println(b);
        
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();

        boolean plusOne = false;
        for(int i=a.length()-1;i>=0;i--){
            if(plusOne){
                if(arr[i]=='1' && brr[i]=='1'){
                    arr[i]='1';
                    plusOne = true;
                } else if((arr[i]=='1' && brr[i]=='0')
                ||(arr[i]=='0' && brr[i]=='1')){
                    arr[i]='0';
                    plusOne = true;
                } else{
                    arr[i]='1';
                    plusOne = false;
                }
            }else {
                if(arr[i]=='1' && brr[i]=='1'){
                    arr[i]='0';
                    plusOne = true;
                }  else if((arr[i]=='1' && brr[i]=='0')
                ||(arr[i]=='0' && brr[i]=='1')){
                    arr[i]='1';
                    plusOne = false;
                } else{
                    arr[i]='0';
                    plusOne = false;
                }
            }
        }

        a = String.valueOf(arr);
        if(plusOne){
            a = "1"+a;
        }
        return a;

    }
}