package programmers.level1.hash;

import java.util.HashMap;

public class 완주하지못한선수sol2 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        int val = 0;
        HashMap<String, Integer> map = new
                HashMap<String, Integer>();

        for (String part : participant) {
            if (map.get(part) == null)
                map.put(part, 1);
            else {
                val = map.get(part) + 1;
                map.put(part, val);
            }
        }

        for (String comp : completion) {
            val = map.get(comp) - 1;
            map.put(comp, val);
        }


        for (String key : map.keySet()) {
            if (map.get(key) == 1) answer = key;
        }


        return answer;
    }
}
