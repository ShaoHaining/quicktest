package main.java.demo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，
 * 这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
 *
 * 示例 1:
 *
 * 输入: [1,2,1]
 * 输出: [2,-1,2]
 * 解释: 第一个 1 的下一个更大的数是 2；
 * 数字 2 找不到下一个更大的数；
 * 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
 * 注意: 输入数组的长度不会超过 10000。
 *
 * 提示：利用栈做
 */
public class Demo503 {
    public int[] nextGreaterElements(int[] nums){
        List numsList = Arrays.asList(nums);
        System.out.println(Arrays.toString(nums));
        List<Integer> integerList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        for(int i = 0; i< integerList.size(); i++){
            for (int j = 0; j< integerList.size(); j++){
                if (i == j){

                }
            }
            integerList.get(i);
        }

        System.out.println(integerList.toString());

        return null;
    }

    public static void main(String[] args) {
        Demo503 demo503 = new Demo503();
        int[] ints = {1,2,1};
        demo503.nextGreaterElements(ints);
    }
}
