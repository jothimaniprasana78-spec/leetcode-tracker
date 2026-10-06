// Last updated: 10/6/2026, 4:04:33 PM
1import java.util.*;
2
3class Solution {
4    public List<TreeNode> generateTrees(int n) {
5        if (n == 0) return new ArrayList<>();
6        return build(1, n);
7    }
8
9    private List<TreeNode> build(int start, int end) {
10        List<TreeNode> ans = new ArrayList<>();
11
12        if (start > end) {
13            ans.add(null);
14            return ans;
15        }
16
17        for (int i = start; i <= end; i++) {
18            List<TreeNode> left = build(start, i - 1);
19            List<TreeNode> right = build(i + 1, end);
20
21            for (TreeNode l : left) {
22                for (TreeNode r : right) {
23                    TreeNode root = new TreeNode(i);
24                    root.left = l;
25                    root.right = r;
26                    ans.add(root);
27                }
28            }
29        }
30
31        return ans;
32    }
33}