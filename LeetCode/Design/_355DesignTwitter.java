public class _355DesignTwitter {
    class Twitter {
        int time;
        Map<Integer, List<int[]>> tweetMap;
        Map<Integer, Set<Integer>> followMap;

        public Twitter() {
            time = 0;
            tweetMap = new HashMap<>();
            followMap = new HashMap<>();
        }

        public void postTweet(int userId, int tweetId) {
            time++;
            List<int[]> l = tweetMap.getOrDefault(userId, new ArrayList<>());
            l.add(new int[] { time, tweetId });
            tweetMap.put(userId, l);
        }

        public List<Integer> getNewsFeed(int userId) {
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
            if (tweetMap.containsKey(userId)) {
                for (int[] x : tweetMap.get(userId)) {
                    maxHeap.offer(x);
                }
            }
            if (followMap.containsKey(userId)) {
                for (int followee : followMap.get(userId)) {
                    if (tweetMap.containsKey(followee)) {
                        for (int[] t : tweetMap.get(followee)) {
                            maxHeap.offer(t);
                        }
                    }
                }
            }
            List<Integer> res = new ArrayList<>();
            while (!maxHeap.isEmpty() && res.size() < 10) {
                int[] t = maxHeap.poll();
                res.add(t[1]);
            }
            return res;
        }

        public void follow(int followerId, int followeeId) {
            Set<Integer> hs = followMap.getOrDefault(followerId, new HashSet<>());
            hs.add(followeeId);
            followMap.put(followerId, hs);
        }

        public void unfollow(int followerId, int followeeId) {
            Set<Integer> hs = followMap.getOrDefault(followerId, new HashSet<>());
            hs.remove(followeeId);
            followMap.put(followerId, hs);
        }
    }

    /**
     * Your Twitter object will be instantiated and called as such:
     * Twitter obj = new Twitter();
     * obj.postTweet(userId,tweetId);
     * List<Integer> param_2 = obj.getNewsFeed(userId);
     * obj.follow(followerId,followeeId);
     * obj.unfollow(followerId,followeeId);
     */
}
