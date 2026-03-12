class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int lo = 0, hi = n-1;
        int first = -1, last = -1;

        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;
             if(arr[mid]>target) hi = mid -1;
             else if(arr[mid]<target) lo = mid + 1;
             else {
             first = mid;
             hi = mid - 1;
             }
        }
      
          lo = 0;
          hi = n-1;
          while(lo<=hi){
            int mid = lo + (hi - lo) / 2;
             if(arr[mid]>target) hi = mid -1;
             else if(arr[mid]<target) lo = mid + 1;
             else { 
             last = mid;
             lo = mid + 1;
             }
        }
        return new int[]{first, last};
    }
}