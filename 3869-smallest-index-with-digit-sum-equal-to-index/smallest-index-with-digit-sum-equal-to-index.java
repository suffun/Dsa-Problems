class Solution {
    public int smallestIndex(int[] arr) {
        
        for(int i = 0; i<arr.length;i++){
            int a = arr[i];
            int sum = 0;
            while(a >0){
                sum += a%10;
                a /= 10;
            }
              if(sum == i) return i;
        }
        return -1;
    }
    
}