class Solution {
    public List<Integer> findDuplicates(int[] arr) {
          int n = arr.length;
          List<Integer> ans = new ArrayList<>();
          int i = 0;
          while(i<n){
            int rightIdx = arr[i] -1;
            if(arr[i] == i+1 || arr[rightIdx] == arr[i]) i++;
            else{
                swap(i,rightIdx,arr);
            }
          }
          for(i = 0; i<n; i++){
            if(arr[i] != i+1) ans.add(arr[i]);
          }
        return ans;
    }
    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}