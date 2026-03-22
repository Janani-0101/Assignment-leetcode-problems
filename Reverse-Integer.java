class Solution {
    public int reverse(int n) {
        int dig = 0;
        long res=0;
        while(n!=0){
            dig = n%10;
            res = res*10+dig;
            n /= 10;
        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
        return (int)res;
    }
}
