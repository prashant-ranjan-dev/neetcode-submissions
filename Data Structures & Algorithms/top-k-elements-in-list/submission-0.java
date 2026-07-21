class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> valuesFreq = new HashMap<>();
        int[] answer = new int[k];
        for(int i : nums){
            valuesFreq.put(i , valuesFreq.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
        new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(),  a.getValue()));

        maxHeap.addAll(valuesFreq.entrySet());

        for(int i = 0; i <k && !maxHeap.isEmpty() ; i++){
            answer[i]= maxHeap.poll().getKey();
        }
        return answer;
    }
}
