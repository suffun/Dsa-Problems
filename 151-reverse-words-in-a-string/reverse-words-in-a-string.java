class Solution {
    public String reverseWords(String s) {
        ArrayList<String> ans = new ArrayList<>();
        int i = 0;
        
        while(i<s.length()){
            while(i<s.length() && s.charAt(i) == ' '){
                i++;
            }

            if (i == s.length()) {
                break;
            }
            int j = i;
            while(j<s.length() && s.charAt(j) != ' '){
                j++;
            }
            ans.add(s.substring(i,j));
            i = j;

        }
        StringBuilder sb = new StringBuilder();
        for(int k = ans.size()-1; k>=0; k--){
            sb.append(ans.get(k));
            if(k != 0) sb.append(" ");
        }
        return sb.toString();
        
    }
}