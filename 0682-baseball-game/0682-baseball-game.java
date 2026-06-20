class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        int total =0;
        for(int i=0;i<op.length;i++)
        {
            if(op[i].equals("+"))
            {
                int a = st.pop();
                int b = st.pop();
                int c = a+b;
                st.push(b);
                st.push(a);
                st.push(c);
            }
            else if(op[i].equals("C"))
            {
                st.pop();
            }
            else if(op[i].equals("D"))
            {
                st.push(2*(st.peek()));
            }
            else
            {
                st.push(Integer.parseInt(op[i]));
            }
        }
        while(!st.isEmpty())
        {
            total+=st.pop();
        }
        return total;
    }
}