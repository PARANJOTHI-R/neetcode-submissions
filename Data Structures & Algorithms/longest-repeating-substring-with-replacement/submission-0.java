class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0;
        int maxFreq=0,maxlen=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            hm.put(curr,hm.getOrDefault(curr,0)+1);
            maxFreq=Math.max(hm.get(curr),maxFreq);
            while((i-l+1)-maxFreq>k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}
