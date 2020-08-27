package programmers.level2.완전탐색;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {
    static Set<Integer> hashSet = new HashSet<>();

    // 소수 판별하기 boolean
    public static boolean isPrimeNumber(int N){
        // 소수는 2부터 시작한다.
        if(N <=1){
            return false;
        }

        // 소수가 아닐 경우 바로 return true;
        for(int i=2; i<N; i++){
            // 나눠 떨어진다는 것은 약수가 존재한다는 것.
            // 즉 소수가 아님.
            if(N%i == 0){
                return false;
            }
        }

        return true;
    }

    static void comb(int[] num, boolean[] visited, int numLength, String str) {
        if(numLength == -1){
            return;
        }

        if(isPrimeNumber(Integer.parseInt(str))){
            hashSet.add(Integer.parseInt(str));
        }

        for(int i=0; i<num.length; i++){
            if(visited[i] == false){
                visited[i] = true;
                comb(num, visited, numLength-1, str + String.valueOf(num[i]));
                visited[i] = false;
            }
        }

        return;
    }


    public int solution(String numbers) {
        int numLength=numbers.length();
        int[] num = new int[numbers.length()];
        boolean[] visited = new boolean[num.length];

        //String으로 된 숫자배열(String type)을 int배열로 만들기.
        for(int i=0; i<numbers.length(); i++){
            num[i] = numbers.charAt(i) - '0';
        }

        // 소수의 개수
        int answer = 0;

        for(int i=0; i<numLength; i++){
            visited[i] = true;
            comb(num, visited, numLength, String.valueOf(num[i]));
            visited[i] = false;
        }


        return hashSet.size();
    }
}



/*   public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        int count = 0;
        while (set.iterator().hasNext()) {
            int a = set.iterator().next();
            set.remove(a);
            if (a == 2) count++;
            if (a % 2 != 0 && isPrime(a)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n) {
        if (n == 0 || n == 1) return false;
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        if (!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), set);
    }*/