class Solution {
    public int mySqrt(int x) {
        Long i = 1L;
        Long a = 1L;
        Long b = 1L;
        if(x==0){
            return 0;
        }
        while(true){
            a = i*i;
            b = (i+1) * (i+1);
            if(a<=x && b>x){
                break;
            }
            if(i==46340){
                System.out.println("a:"+a+" / b:"+b);
            }
            i++;
        }
        return Math.toIntExact(i);
    }
}