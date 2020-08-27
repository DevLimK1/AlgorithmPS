package programmers.level2.stack;

import java.util.Stack;

public class 주식가격stack_ver {

    public int[] solution(int[] prices) {
        Stack<Integer> startIdxs = new Stack<>();
        int i=0;
        int[] answer = new int[prices.length];

        startIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!startIdxs.empty() && prices[i] < prices[startIdxs.peek()]) { //앞의 index에 해당하는 값이 뒤의 index의 값보다 크다면
                int startIdx = startIdxs.pop();
                answer[startIdx] = i - startIdx; //더 수가 작은 index에서 시작한 index를 빼서 거리(초)를 구한다.
            }
            startIdxs.push(i); //더 수가 작은 값의 index push
        }
        while (!startIdxs.empty()) {
            int beginIdx = startIdxs.pop();
            answer[beginIdx] = i - beginIdx - 1;//스택에 남아있는 index의 거리(초) 계산
        }

        return answer;
    }
}


   /*//other solution
   public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<>();

        // 뒤에서부터 순회
        for (int i = prices.length - 2; i >= 0; i--) {

            // 앞쪽의 숫자가 뒷쪽의 숫자보다 클 경우
            if (prices[i] > prices[i + 1]) {

                answer[i] = 1;
                stack.push(new int[]{prices[i + 1], i + 1});

                // 앞쪽의 숫자가 뒷쪽의 숫자보다 작거나 같은 경우
            } else {

                // 스택에서 자신보다 낮은 값이 나올때까지 모두 지워줌
                while (stack.size() > 0 && stack.peek()[0] >= prices[i]) {
                    stack.pop();
                }

                // 스택이 빌 경우 (뒷쪽의 모든 값이 자신보다 큼)
                if (stack.size() == 0) {
                    answer[i] = prices.length - i - 1;

                    // 스택에 자신보다 낮은 숫자가 남아있다면 해당 인덱스와 자신의 인덱스를 이용해 계산
                } else {
                    answer[i] = stack.peek()[1] - i;
                }
            }
        }

        return answer;
    }*/