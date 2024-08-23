class Solution {
    public int findComplement(int num) {
        if(num==0){
            return 1;
        }
        int bit=Integer.toBinaryString(num).length();
        int ans=(1<<bit)-1;
        return num^ans;
    }
}