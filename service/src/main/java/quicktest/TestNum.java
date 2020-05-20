package main.java.quicktest;

public class TestNum {
    public static void main(String[] args) {
//        int temp1[] = {1,2,3};
//        int number;
//        System.out.println(number);

        int len = 3;
        String[] array = {"1", "2", "3"};
        execute(array, len, "");
    }

    public static void execute(String[] array, int len, String str) {
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (str.length() == len) {
                System.out.println(str);
            }
            else {
                execute(array, len, str);
            }
            str = str.substring(0, str.length() - 1);
        }
    }
}
