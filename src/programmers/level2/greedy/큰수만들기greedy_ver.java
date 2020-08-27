package programmers.level2.greedy;

/*https://programmers.co.kr/learn/courses/30/lessons/42883*/
public class 큰수만들기greedy_ver {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int idx = 0;
        int comp = 0;
        for (int i = 0; i < number.length() - k; i++) { //k개의 수를 제외한 길까지
            comp = 0;
            for (int j = idx; j <= i + k; j++) { //큰 수인 index ~ number.length-1 인덱스까지
                if (comp < number.charAt(j) - '0') {
                    comp = number.charAt(j) - '0';
                    idx = j + 1; // 큰 값의 다음 index 가리키기 위해서
                }
            }
            answer.append(comp);
        }
        return answer.toString();
    }
}
