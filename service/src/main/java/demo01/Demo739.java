package main.java.demo01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
 *
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 *
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 *
 */
public class Demo739 {
    public int[] dailyTemperatures(int[] T) {
        List<Integer> temperList = Arrays.stream(T).boxed().collect(Collectors.toList());
        System.out.println(temperList.toString());

        Queue queue = new LinkedList();
        for (int i =0; i< T.length; i++){
            queue.offer(T[i]);
        }
        System.out.println(queue);
        int count = 0;
        int headElement = (int)queue.poll();
        System.out.println(headElement);
        for (int i = 0; i< T.length; i++)
            if (headElement < T[i]){
                count++;
                System.out.println(count);
            }
        return null;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        Demo739 demo739 = new Demo739();
        demo739.dailyTemperatures(temperatures);
    }
}
