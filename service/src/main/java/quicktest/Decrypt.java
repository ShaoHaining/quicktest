package main.java.quicktest;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * 题目描述
 * <p>
 * 苗苗截获了希希发出去的一串数字，不过希希告诉苗苗数列是加密过的。苗苗通过某种手段得知了解密方法：
 * 首先将第一个数字删除，紧接着将第二个数字放到这串数字的末尾，再将第三个数字删除并将第四个数字放到末尾，如此继续，直到剩下最后一个数，
 * 将最后一个数也删除，然后，按照刚才删除的顺序，把这些删除的数连在一起就是加密之前的原文了。于是破解了希希的数列。
 * <p>
 * 解答要求时间限制：1000ms, 内存限制：64MB
 * <p>
 * 输入
 * <p>
 * 输入一串数字（长度不超过10000），数字之间没有空格。
 * <p>
 * 输出
 * <p>
 * 输出加密之前的原文（数字之间没有空格）。
 * <p>
 * 样例
 * <p>
 * 输入样例 1 
 * <p>
 * 631758924
 * 输出样例 1
 * <p>
 * 615947283
 */
public class Decrypt {
    public int decryptQueue(Integer num) {
        Queue queue = new LinkedList();
        int result = 0;
        String reString = "";
        char[] ch = String.valueOf(num).toCharArray();
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            queue.offer(Integer.valueOf(ch[i] - '0'));
        }
        while (!queue.isEmpty()) {
            result = (int)queue.poll();
            System.out.println("swx001 "+result);
            reString= String.valueOf(result);
            System.out.println("swx002 "+reString);
//            reString = reString+result;
//            System.out.println("swx004 "+reString);

//            reString = String.valueOf(queue.poll()) + reString;
//            System.out.println(reString);

//            result = (int) queue.poll();
            if (!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
//            System.out.println(result);
            resultList.add(result);

            System.out.println("swx003 "+String.valueOf(resultList));

        }
//        System.out.println(reString);
        return result;
    }

    public static void main(String[] args) {
        Decrypt decrypt = new Decrypt();
        System.out.println(decrypt.decryptQueue(631758924));
    }
}
