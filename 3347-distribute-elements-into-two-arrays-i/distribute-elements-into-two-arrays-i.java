class Solution {
    public int[] resultArray(int[] arr) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(arr[0]);
        arr2.add(arr[1]);

        for(int i = 2; i<arr.length;i++){
            int last1 = arr1.get(arr1.size()-1);
            int last2 = arr2.get(arr2.size()-1);
            if(last1 > last2) arr1.add(arr[i]);
            else arr2.add(arr[i]);
        }
        int[] ans = new int[arr.length];
        int idx = 0;
        for(int ele1 : arr1){
            ans[idx] = ele1;
            idx++;
        }
        for(int ele2 : arr2){
            ans[idx] = ele2;
            idx++;
        }
        return ans;
    }
}