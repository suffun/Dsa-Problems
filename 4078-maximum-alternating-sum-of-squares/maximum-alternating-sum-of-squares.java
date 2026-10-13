class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n = arr.length;
        long[] product = new long[n];
        for(int i =0; i<n;i++){
            product[i] = (long) arr[i] * arr[i];
        }
        Arrays.sort(product);
        long ans = 0;
        int max = (n + 1) / 2;
        for(int i = n-1; i>= n-max; i--){
            ans+=product[i];
        }
        for(int i = 0 ; i< n-max; i++){
            ans -= product[i];
        }
        return ans;
    }
}