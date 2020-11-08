package programmers.level2.완전탐색;

public class 카펫_mine {
    public int[] solution(int brown, int yellow) {
        int[] answer=new int[2];
        boolean flag=false;

        //brown+yellow
        int sum=brown+yellow;

        //brown+yellow 합한 수 약수를 구한다.
        for(int i=3;i<=sum;i++){
            if(sum%i==0){
                flag=carpetCheck(answer,yellow,sum/i,i);
                if(flag)
                    return answer;
            }
        }

        //3이상인 약수중에 큰 수에서 -2를 하고
        //yellow/(큰수-2) 를 하여
        //나누어 떨어지면 답이 됨
        return answer;
    }

    private boolean carpetCheck(int[] answer, int yellow, int mok, int divisor) {
        int tmp=mok-2;

        if(!(yellow%tmp==0)){
            return false;
        }

        answer[0]=mok;
        answer[1]=divisor;
        return true;
    }
}
