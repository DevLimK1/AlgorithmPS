package programmers.level2.hash;

import java.util.HashMap;

public class 위장 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        int result = 1;

//        for (String key : map.keySet()) { //map key 활용
//            result *= map.get(key) + 1;
//        }

        for (int value : map.values()) { //map values 활용
            result *= value + 1; //안입는 경우 +1
        }

        return result - 1; // 모든 옷을 안입는 경우는 -1
    }
}
