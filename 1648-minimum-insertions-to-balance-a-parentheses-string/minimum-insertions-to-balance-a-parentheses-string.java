class Solution {
    public int minInsertions(String s) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i <s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='('){
            count+=2;

            if(count %2 != 0){
                ans++;
                count--;
            }
        }
            else{
                count--;
                if(count <0){
                    ans++;
                    count +=2;
                }
            }
        }
        return count +ans;
    }
}