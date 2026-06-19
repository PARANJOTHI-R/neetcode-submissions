class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2) return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<len1;i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            hm.put(a,hm.getOrDefault(a,0)+1);
            hm.put(b,hm.getOrDefault(b,0)-1);
        }
        for(Character val:hm.keySet()){
            if(hm.get(val)!=0) return false;
        }
        return true;
    }
}
