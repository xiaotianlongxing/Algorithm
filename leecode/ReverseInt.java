/**
*123 -> 321
*逆置 x 用 x%10 之后 x/10 直到 x 为0，可以取得 x 的每位的值，用 ans = x%10 + ans*10 可以逆置 x 的每位， 
*另外内置常数 Integer.MAX_VALUE 即为23311 − 1 
*Integer.MAX_VALUE 即为 −2331
public class ReverseInt{
    public static int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            ans = x % 10 + ans * 10;
            x /= 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;
        return (int) ans;
    }
}
