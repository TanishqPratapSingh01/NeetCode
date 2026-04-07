class Solution {
    public static List<Integer> Frequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Use max-heap (PriorityQueue) to get top k by frequency descending
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        for (int num : map.keySet()) {
            pq.offer(num);
        }
        
        List<Integer> result = new ArrayList<>();
       while (result.size() < k && !pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> ans = Frequent(nums,k);
        int arr[] = new int[ans.size()];
        for (int i=0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
