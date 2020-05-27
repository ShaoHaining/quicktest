package main.java.demo01;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 */
public class Demo05 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        if (chars.length < 2){
            return "";
        }
        // 单轴
        for (int i = 1; i< chars.length -1; i++){
            if (chars[i-1] == chars[i+1]){
                System.out.println(chars[i-1]);
            }
//            System.out.println(chars[i]);
        }


        return "";
    }

    private static void find(String s, int i, int j){


    }

    public static void main(String[] args) {
        String s = "babad";
        Demo05 demo05 = new Demo05();
        demo05.longestPalindrome(s);
    }
}
