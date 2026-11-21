class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int preSum = 0;
        int count = 0;
        HashMap<Integer,Integer> maps = new HashMap<>();
        maps.put(0,1);
        for(int i = 0;i<n; i++){
            preSum += arr[i];
            int rem = preSum - k;
            if(maps.containsKey(rem)) count += maps.get(rem);
            maps.put(preSum,maps.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}