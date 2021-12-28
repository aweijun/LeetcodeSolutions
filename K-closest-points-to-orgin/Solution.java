class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>((x , y) ->  (x.distance > y.distance ? 1 : -1));
        for (int i = 0; i < points.length; i++ ) {
            queue.offer(new Pair(i , distance(points[i])));
        }
        int[][] ans = new int[k][2];
        for (int j = 0; j < k ; j++) {
            ans[j] = points[queue.poll().pair];
        }
        return ans;
    }
    public static double distance(int[] point) {
        return Math.sqrt(Math.pow(point[0],2)  + Math.pow(point[1], 2));
    }
    
    class Pair {
        int pair;
        double distance;
        public Pair (int pair , double distance) {
            this.pair = pair;
            this.distance = distance;
        }
    }
}