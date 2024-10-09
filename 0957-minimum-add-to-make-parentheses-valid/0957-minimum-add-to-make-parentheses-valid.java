class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }else if(s.charAt(i)==')'&&(st.isEmpty()||st.peek()!='(')){
                st.push(')');
            }else if(s.charAt(i)==')'&&!st.isEmpty()&&st.peek()=='('){
                st.pop();
            }
        }
        return st.size();
    }
}