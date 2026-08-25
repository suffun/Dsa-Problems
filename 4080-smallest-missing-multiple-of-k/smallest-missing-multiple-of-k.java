class Solution {
    public int missingMultiple(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        int i = 1;
        while(set.contains(i*k)) i++;
        return i*k;
    }
}