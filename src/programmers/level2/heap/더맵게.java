package programmers.level2.heap;

import java.util.PriorityQueue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {

        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();//default 최소힙
        //PriorityQueue<Integer> heap=new PriorityQueue<>(Comparator.reverseOrder());//최대힙
        for (int aScoville : scoville) {
            heap.offer(aScoville);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();

            int result = a + (b * 2);

            heap.offer(result);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        더맵게 m = new 더맵게();
        int[] arr = {1, 12, 10, 9, 3, 2};
//        int[] arr={12,10,9,3,2,1};
        int result = m.solution(arr, 7);
        System.out.println(result);
    }
}
