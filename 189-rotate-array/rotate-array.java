class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        rotate(arr, 0, n - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);


    }
    public  void rotate(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}