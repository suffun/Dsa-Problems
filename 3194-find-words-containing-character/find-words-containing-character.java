class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
       for(int i = 0; i<words.length; i++){
        String j = words[i];
        for(int k =0; k<j.length();k++){
            if(x == j.charAt(k)){
                ans.add(i);
                break;
            }
        }
       }
       return ans;

    }
}