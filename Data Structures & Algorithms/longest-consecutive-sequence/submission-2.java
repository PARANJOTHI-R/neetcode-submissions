class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.add(nums[i]))
                pq.offer(nums[i]);
        }
        int max=0;
        int cnt=0;
        int ele=pq.poll();
        while(!pq.isEmpty()){
            int curr=pq.poll();
            if(Math.abs(curr-ele)==1){
                cnt++;
            }else cnt=0;
            ele=curr;
            max=Math.max(max,cnt);
        }
        return max+1;
    }
}
