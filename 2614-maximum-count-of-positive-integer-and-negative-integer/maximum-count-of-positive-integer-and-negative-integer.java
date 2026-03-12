class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length;
        int lo = 0, hi = n-1;
        int firstZero = n;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>=0) {
                firstZero = mid;
                hi = mid - 1;
            }
            
            else{
                lo = mid + 1;
            }
        }
        lo = 0;
        hi = n-1;
        int firstPositive = n;

        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid]>0){
                firstPositive = mid;
                hi = mid - 1;
            }
            else{
                lo = mid +1;
            }
            
        }
        int neg = firstZero;
        int pos = n - firstPositive;

        return Math.max(neg, pos);
    }
}