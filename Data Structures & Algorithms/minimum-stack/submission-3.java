class MinStack {
    int min;
    int tr;
    ArrayList<Integer> li;
    Stack<Integer> st;
    public MinStack() {
        st=new Stack<>();
        li=new ArrayList<>();
        min=Integer.MAX_VALUE; 
        tr=-1;
    }
    
    public void push(int val) {
        if(val<=min){
            min=val;
            tr++;
            li.add(min);
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.peek()==min){
              li.remove(li.size() - 1);
            tr--;
            if(tr>=0) min=li.get(tr);
            else min=Integer.MAX_VALUE;
        }
        st.pop();        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return li.get(tr);
    }
}
