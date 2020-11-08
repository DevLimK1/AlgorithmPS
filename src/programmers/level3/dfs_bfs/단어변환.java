package programmers.level3.dfs_bfs;

public class 단어변환 {
    public int solution(String begin, String target, String[] words) {
        int minimum = words.length + 1;

        minimum = dfs(begin, target, words, new boolean[words.length],
                0, minimum, words.length);


        return minimum==words.length+1 ? 0 : minimum;
    }

    private int dfs(String begin, String target, String[] words, boolean[] visited, int count, int minimum, int maximum) {
         //count : 변환 가능한 경로 갯수 ex. hit->hot count :1 , hit->hot->dot count:2
        for (int i = 0; i < maximum; i++) {
            if (!visited[i] && conversion(begin, words[i])) { //방문하지 않았고, 형변환이 가능하면

                if (words[i].equals(target)) { //target과 같으면
                    return Math.min(minimum, count + 1);
                }

                visited[i] = true;
                int num = dfs(words[i], target, words, visited, count + 1, minimum, maximum);
                if(num<minimum)
                    minimum=num;
                visited[i]=false;
            }
        }
        return minimum;
    }

    private boolean conversion(String begin, String word) { //단어 형변환이 가능한지
        int tmp = 0;

        for (int i = 0; i < begin.length(); i++) {
            if (begin.charAt(i) != word.charAt(i)) {
                tmp++;
                if (tmp > 1) //한번에 한 개의 단어만 변환 가능
                    return false;
            }
        }

        return true;
    }
}
