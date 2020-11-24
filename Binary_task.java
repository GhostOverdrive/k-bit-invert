import java.util.Scanner;
import java.lang.Math;

public class Binary_task {
    public static String toBinary(int num) {
        String out = "";
        int b;
        while (num != 0) {
            b = num % 2;
            out += Integer.toString(b);
            num /= 2;
        }
        //return new StringBuilder(out).reverse().toString();
        return out;
    }

    public static int toDecimal(String binaryNum)
    {
        int out = 0;
        for (int i = binaryNum.length() - 1; i >= 0; i--)
            out += Math.pow(2, i) * (binaryNum.charAt(i) - '0');
        return out;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, k;
        String binaryNum, result = "";
        num = input.nextInt();
        k = input.nextInt(); k--;
        binaryNum = toBinary(num);
        for (int i = 0; i < binaryNum.length(); i++) {
            if (i == k)
                if (binaryNum.charAt(k) == '1')
                    result += '0';
                else
                    result += '1';
            else
                result += binaryNum.charAt(i);
        }
        System.out.println(result);
        System.out.println(toDecimal(result));
    }
}
