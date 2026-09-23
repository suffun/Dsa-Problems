class Solution {
    public int countKDifference(int[] arr, int k) {
        HashMap<Integer,Integer> maps = new HashMap();
        for(int ele : arr){
            maps.put(ele,maps.getOrDefault(ele,0)+1);
        }
        int count = 0;
        for(int ele : maps.keySet()){
            int target = ele - k;
            if(maps.containsKey(target)){
                count += maps.get(ele) * maps.get(target);
            }
        }
        return count;
    }
}