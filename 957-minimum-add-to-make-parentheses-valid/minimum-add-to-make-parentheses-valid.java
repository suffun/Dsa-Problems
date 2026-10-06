class Solution {
    public int minAddToMakeValid(String s) {
        int left = 0;
        int ans = 0;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(') left++;
            else{
                if(left >0) left--;
                else ans++;
            }
        }
        return ans+left;
    }
}