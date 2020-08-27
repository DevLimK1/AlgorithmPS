package TIL.완전탐색;

public class 최소동전갯수 {
    public int solution(int change){
        change=120;
        int ways=0, min=9999;
        for(int i=0;i*50<=change;i++){
            for(int j=0;j*10<=change;j++){
                if((i*50)+(j*10)==change){
                    ways++;
                    min=Math.min(min,i+j);
                }
            }
        }
        System.out.println(ways);
        System.out.println(min);
        return min;
    }

    public static void main(String[] args) {
        new 최소동전갯수().solution(120);
    }
}
