// Last updated: 10/6/2026, 4:03:07 PM
1import java.util.*;
2
3class Solution {
4    public List<String> restoreIpAddresses(String s) {
5        List<String> ans = new ArrayList<>();
6        backtrack(s, 0, 0, "", ans);
7        return ans;
8    }
9
10    private void backtrack(String s, int index, int parts,
11                           String path, List<String> ans) {
12        if (parts == 4 && index == s.length()) {
13            ans.add(path.substring(0, path.length() - 1));
14            return;
15        }
16
17        if (parts == 4 || index == s.length()) return;
18
19        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
20            String part = s.substring(index, index + len);
21
22            if (part.length() > 1 && part.charAt(0) == '0') break;
23            if (Integer.parseInt(part) > 255) continue;
24
25            backtrack(s, index + len, parts + 1, path + part + ".", ans);
26        }
27    }
28}