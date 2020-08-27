package programmers.level2.greedy;

public class 조이스틱 {
    public int solution(String name) {
        // 1. 위, 아래 최소 이동
        int ans = 0;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i)!= 'A') {
                int up = name.charAt(i) - 'A';
                int down = 1 + 'Z' - name.charAt(i);
                ans += (up < down)? up : down;
            }
        }

        // 2. A 아닌 모든 문자를 들릴 수 있는 최소 좌우 이동
        // 모든 위치에서 역으로 돌아가는 경우 최소를 찾는다.
        int minMove = name.length() - 1;
        for(int i = 0 ; i < name.length() ; i++) {
            if(name.charAt(i) != 'A') {
                int next = i+1;
                while(next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }
                int move = 2 * i + name.length() - next;
                minMove = Math.min(move, minMove);
            }
        }

        return ans + minMove;
    }
}


/*  public int solution(String name) {
        int answer = 0;
        int exp = name.length() - 1;
        for(int i = 0; i < name.length(); i++){
            char c = name.charAt(i);
            answer += ('Z'- c + 1) > c - 'A' ? c - 'A' : ('Z' - c + 1);
            if(c == 'A'){
                int nextIdx = i+1;
                int countA = 0;
                while (nextIdx < name.length() &&
                        name.charAt(nextIdx) == 'A'){
                    countA ++;
                    nextIdx++;
                }
                int tmp = (i-1)*2 + (name.length() -1 -i - countA) ;
                if(exp > tmp) exp = tmp;
            }
        }

        answer += exp;
        return answer;
    }*/