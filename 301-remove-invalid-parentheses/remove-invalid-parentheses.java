class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        HashSet<String> set = new HashSet<>();
        q.add(s);
        set.add(s);

        boolean found = false;
        while(q.size() > 0){
            String curr = q.remove();
            if(isValid(curr)){
                ans.add(curr);
                found = true;
            }
            if(found == true) continue;

            for(int i =0; i<curr.length();i++){
            if(curr.charAt(i) != '(' && curr.charAt(i) != ')') continue;
            StringBuilder sb = new StringBuilder(curr);
            sb.deleteCharAt(i);
            String newString = sb.toString();
            if(!set.contains(newString)){
                set.add(newString);
                q.add(newString);
            }
           }
        }
       
        return ans;
    }
    public boolean isValid(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') count++;
            if(ch ==')') count--;
            if(count<0) return false;
        }
        return(count==0);
    }
}