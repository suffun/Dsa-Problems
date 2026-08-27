class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();

        if (digits.length() == 0) {
            return list;
        }

        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        generate(0, "", digits, map, list);

        return list;
    }

    public void generate(int idx, String ans, String digits,
                         String[] map, List<String> list) {

        // Base case
        if (idx == digits.length()) {
            list.add(ans);
            return;
        }

        // Get letters for current digit
        String letters = map[digits.charAt(idx) - '0'];

        // Try every possible letter
        for (char ch : letters.toCharArray()) {

            generate(idx + 1, ans + ch, digits, map, list);
        }
    }
}