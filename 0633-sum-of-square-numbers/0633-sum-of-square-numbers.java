class Solution {
    public boolean judgeSquareSum(int c) {
        long start=0;
        long end=(long)Math.sqrt(c);
        while(start<=end){
            long huii=start*start+end*end;
            if(huii==c){
                return true;
            }
            else if(huii>c){
                end--;
            }else{
                start++;
            }
        }
        return false;
    }
}