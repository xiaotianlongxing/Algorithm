/**
*最后一个单词的长度
*输入: “Hello World” 
*输出: 5
**/
class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ')
            i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            len++;
        }
        return len;
    }
}
