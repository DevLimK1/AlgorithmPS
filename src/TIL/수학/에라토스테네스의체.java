package TIL.수학;

public class 에라토스테네스의체 {
    static boolean prime[] = new boolean[121];
    public static void main(String[] args) {
        //구하고자 하는 숫자 범위
        int num=30;

        //boolean의 기본 값은 false
        //소수가 아니면 true
        //소수이면 false
        //0과 1은 소수가 아니므로 true
        prime[0]=prime[1]=true;

        for(int i=2;i*i<=num;i++){
            if(!prime[i]){//소수 라면
                for(int j=i*i;j<=num;j+=i){//소수의 배수는 true 변경
                    prime[j]=true;
                }
            }
        }

        for(int i=1;i<=num;i++){
            if(!prime[i]){ //소수 라면
                System.out.print(i+" ");
            }
        }




    }
}
