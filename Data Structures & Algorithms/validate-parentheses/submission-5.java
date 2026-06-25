class Solution {
    public boolean isValid(String s) {
        if((s.length() & 1) == 1) return false;
        Deque<Character> st = new ArrayDeque<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            char curr=s.charAt(i);
            if(curr=='(') st.push(')');
            else if(curr=='[') st.push(']');
            else if(curr=='{') st.push('}');
            else {
                if(st.isEmpty() || st.pop()!=curr) return false;
            }
        }
        return st.isEmpty();
    }
}
