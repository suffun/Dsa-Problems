class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(char ch : s.toCharArray()){
            if(ch =='(') st.push(0);
            else{
                int top = st.pop();
                int count = Math.max(2*top,1);
                st.push(count+st.pop());
            }
        }
        return st.pop();
    }
}