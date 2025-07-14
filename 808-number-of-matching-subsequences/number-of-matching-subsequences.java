class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int ans = 0;
        char[] ch = s.toCharArray();

        for (String str : map.keySet()) {
            if (str.length() > ch.length) continue; // optional quick skip

            int i = 0, j = 0;

            while (i < ch.length && j < str.length()) {
                if (ch[i] == str.charAt(j)) {
                    j++;
                }
                i++;
            }

            if (j == str.length()) {
                ans += map.get(str);
            }
        }

        return ans;
    }
}
