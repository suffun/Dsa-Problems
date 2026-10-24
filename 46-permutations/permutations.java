class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] check = new boolean[arr.length];
        permutations(arr,check,list,ans);
        return ans;
    } 
    public void permutations(int[] arr, boolean[] check, List<Integer> list, List<List<Integer>> ans){
        int n = arr.length;
        if(list.size() == n){
            List<Integer> copy = new ArrayList<>(list);
            ans.add(copy);
            return;

        }
        for(int i =0; i<n; i++){
          if(!check[i]){
            list.add(arr[i]);
            check[i] = true;
            permutations(arr,check,list,ans);
            list.remove(list.size()-1);
            check[i] = false;
          }

        }
    }
}