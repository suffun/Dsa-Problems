class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int ele : arr){
            set.add(ele);
            min = Math.min(min, ele);
            max = Math.max(max, ele);
        }
        for(int i=min; i<=max; i++ ){
            if(!set.contains(i)) ans.add(i);
        }
         return ans;
    }
}