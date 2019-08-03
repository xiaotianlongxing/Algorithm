public class ArrayPlusOne {
    public int[] arrayPlusOne(int[] digits) {
        if (digits.length == 0)
            return new int[] { 1 };
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        digits[digits.length - 1]++;
        for (int i = digits.length - 1; i > 0; i--)
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1]++;
            }
        if (digits[0] != 10)
            return digits;
        else {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            ans[1] = 0;
            for (int i = 1; i < digits.length; i++)
                ans[i + 1] = digits[i];
            return ans;
        }
    }
}
