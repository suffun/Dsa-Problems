class Solution {
    public int maximumProduct(int[] arr) {
        // Arrays.sort(arr);
        // int n = arr.length;
        // int max1 = arr[n-1] * arr[n-2] * arr[n-3];
        // int max2 = arr[0] * arr[1] * arr[n-1];
        // return Math.max(max1,max2); 


        int max1 =  Integer.MIN_VALUE;
        int max2 =  Integer.MIN_VALUE;
        int max3 =  Integer.MIN_VALUE;

        int min1 =  Integer.MAX_VALUE;
        int min2 =  Integer.MAX_VALUE;

        for(int ele : arr){
            if(ele > max1){
                max3 = max2;
                max2 = max1;
                max1 = ele;
            }
            else if(ele > max2){
                max3 = max2;
                max2 = ele;
            }
            else if(ele > max3){
                max3 = ele;
            }
            if(ele<min1){
                min2 = min1;
                min1 = ele;
            }
            else if(ele<min2){
                min2 = ele;
            }
        }
       return Math.max(max1 * max2 * max3, min1 * min2 * max1);

        
    }
}