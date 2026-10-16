class Solution {
    public int[] findIntersectionValues(int[] arr1, int[] arr2) {
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<arr1.length;i++){
            for(int j = 0 ; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    count1++;
                    break;
                }
            }
        }
        for(int i = 0; i<arr2.length;i++){
            for(int j = 0 ; j<arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    count2++;
                    break;
                }
            }
        }
        return new int[]{count1,count2};
    }
} 