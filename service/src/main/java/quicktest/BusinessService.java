package main.java.quicktest;

import java.util.*;

import static java.util.Arrays.parallelSort;

public class BusinessService {
    public String testString() {
        return "testString!!!";
    }

    public void testMap() {
        Map<String, Integer> stringMap = new HashMap<>();
        stringMap.put("HaiNing", 18);
        Queue<Integer> testQueue = new LinkedList<>();

        List<Integer> testList = new LinkedList<>();

    }

    /**
     * 有序队列
     * @param S
     * @param K
     * @return
     */
    public String orderlyQueue(String S, int K) {

        String ans = S;
        int len = S.length();

        if (K == 1) {
            for (int i = 0; i < len; i++) {
                String tmp = S.substring(i) + S.substring(0, i);
                if (tmp.compareTo(ans) < 0)
                    ans = tmp;
            }
            return ans;
        } else {
            char[] c = S.toCharArray();
            parallelSort(c);
            return new String(c);
        }

    }

//    public static void testInQueue(){
//        //测试队列
//        System.out.println("测试队列：");
//        Queue queue = new Queue();
//        queue.in(1);
//        queue.in(2);
//        queue.in(3);
//        System.out.println(queue.out());
//        System.out.println(queue.out());
//        queue.in(4);
//        System.out.println(queue.out());
//        System.out.println(queue.out());
//        queue.in(5);
//        System.out.println(queue.out());
//    }

    public Queue<String> testQueue1(){
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.add("c");
        return queue;
    }


}
