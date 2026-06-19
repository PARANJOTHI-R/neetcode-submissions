class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char[]arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!hm.containsKey(key)) hm.put(key,new ArrayList<>());
            hm.get(key).add(s);
        }
        List<List<String>> list=new ArrayList<>();
        for(List<String> li:hm.values()){
            list.add(li);
        }
        return list;
    }
}
