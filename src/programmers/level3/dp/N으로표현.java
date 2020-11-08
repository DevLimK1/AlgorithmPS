package programmers.level3.dp;

import java.util.ArrayList;
import java.util.TreeSet;

public class N으로표현 {
    TreeSet<Integer> check = new TreeSet<>();
    ArrayList<Integer>[] cache = new ArrayList[9];

    public int solution(int N, int number) {
        if (N == number) {
            return 1;
        }

        int temp = N;
        for (int i = 1; i < 9; i++) {
            if (temp == number) return i;
            cache[i] = new ArrayList<>();
            cache[i].add(temp);
            check.add(temp);
            temp *= 10;
            temp += N;
        }

        for (int digit = 1; digit < 9; digit++) {
            for (int i = 1; i < digit; i++) {
                int j = digit - i;
                for (int left : cache[i]) {
                    for (int right : cache[j]) {
                        cal(digit, left, right);
                        if (check.contains(number)) {
                            return digit;
                        }
                    }
                }
            }
        }
        return -1;

    }

    private void cal(int digit, int left, int right) {
        addCache(digit, add(left, right));
        addCache(digit, sub(left, right));
        addCache(digit, mul(left, right));
        addCache(digit, div(left, right));
    }

    private void addCache(int digit, int ret) {
        if(!check.contains(ret)){ //결과가 set에 없으면
            check.add(ret);
            cache[digit].add(ret); //자릿수 ArrayList에 값 저장
        }
    }

    private int add(int left, int right) {
        return left + right;
    }

    private int sub(int left, int right) {
        return left - right;
    }

    private int mul(int left, int right) {
        return left * right;
    }

    private int div(int left, int right) {
        if(right==0)
            return 0;
        return left / right;
    }


}
