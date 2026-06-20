class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(Integer i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int[]arr=new int[k];
        int i=0;
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(hm.entrySet());
        while(!pq.isEmpty() && k>0){
            Map.Entry<Integer,Integer> entry = pq.poll();
            arr[i++]=entry.getKey();
            k--;
        }
        return arr;
    }
}
