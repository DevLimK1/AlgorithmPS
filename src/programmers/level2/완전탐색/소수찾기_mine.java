package programmers.level2.완전탐색;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기_mine {
    static Set<Integer> hashSet = new HashSet<>();


    public int solution(String numbers) {
        int numLength=numbers.length();
        int[] num=new int[numLength];
        boolean[] visited=new boolean[numLength];

        //String으로 된 숫자배열->int 배열
        for(int i=0;i<numLength;i++){
            num[i]=numbers.charAt(i)-'0';
        }

        //소수의 개수=0;

        for(int i=0;i<numLength;i++){
            visited[i]=true;
            comb(num,visited,numLength,String.valueOf(num[i]));
            visited[i]=false;
        }

        return hashSet.size();

    }

    private void comb(int[] num, boolean[] visited, int numLength, String str) {
       if(numLength==-1){
           return;
       }

       if(isPrimeNumber(Integer.parseInt(str))){ //소수인지 판별
           hashSet.add(Integer.parseInt(str));
       }

       for(int i=0;i<num.length;i++){
           if(!visited[i]){//방문하지 않았으면
               visited[i]=true;
               comb(num,visited,numLength-1,str+num[i]);
               visited[i]= false;
           }
       }

    }

    private boolean isPrimeNumber(int num) {
        if(num<=1)
            return false;

        for(int i=2;i<num;i++){
            if(num%i==0)//약수이면
                return false;
        }

        return true;
    }
}
