class Pair implements Comparable<Pair> {
    int val;
    int dist;

    Pair(int val, int dist) {
        this.val = val;
        this.dist = dist;
    }

    public int compareTo(Pair p) {
        if (this.dist != p.dist)
            return this.dist - p.dist;

        return this.val - p.val;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int val : arr) {
            int dist = Math.abs(val - x);

            pq.add(new Pair(val, dist));

            if (pq.size() > k)
                pq.remove();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.remove().val);
        }

        Collections.sort(ans);

        return ans;
    }
}