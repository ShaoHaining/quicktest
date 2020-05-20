package main.java.quicktest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
 *
 * 注意：
 * 总人数少于1100人。
 *
 * 示例
 *
 * 输入:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * 输出:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 *
 */
public class ReconstructQueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,new Comparator<Object>(){
            @Override
            public int compare(Object o1,Object o2){
                int[] first = (int[]) o1;
                int[] second = (int[]) o2;
                if(first[0]>second[0]){
                    return -1;
                }else if(first[0]<second[0]){
                    return 1;
                }else {
                    if(first[1]>second[1]){
                        return 1;
                    }else if(first[1]<second[1]){
                        return -1;
                    }else return 0;
                }

            }
        });

        List<int[]> list =new ArrayList<>();
        for(int i=0;i<people.length;i++){
            list.add(people[i][1],people[i]);
        }
        int[][] res = new int[people.length][2];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
