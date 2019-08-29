/**
*给定一个用数组表示的一个数，对它进行加一操作。 
*每一个数位都存储在数组的一个位置上。数组下标从大到小表示数位从低位到高位。
**/
public class PlusOne {
      public int[] plusOne(int[] digits) {

        int carry = 1; // 进位标志，下一位来的进位标志
        int tmp;
        for (int i = digits.length - 1; i >= 0; i--) {
            tmp = digits[i];
            digits[i] = (tmp + carry) % 10; // 计算当前位的新值
            carry = (tmp + carry) / 10; // 计算新的进位

            if (carry == 0) { // 没有进位了就可以退出了
                break;
            }
        }

        if (carry == 1) { // 最后还有一个进位
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = carry;;
            return result;
        } else {
            return digits;
        }
    }
}
