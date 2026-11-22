class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = 1;
        for(int i =1;i<n;i++){
            pre[i] = pre[i-1] * arr[i-1];
        }
        int suffix =1;
        for(int i = n-1; i>=0; i--){
            pre[i] = pre[i] * suffix;
            suffix = arr[i] * suffix;
        }
        return pre;

    }
}