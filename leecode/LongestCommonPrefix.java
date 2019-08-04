public class LongestCommonPrefix {
    public String LongestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String ans = strs[0];
        int len = strs.length;
        for (int i = 1; i < len; i++)
            while (strs[i].indexOf(ans) != 0)
                ans = ans.substring(0, ans.length() - 1);
        return ans;
    }
}
