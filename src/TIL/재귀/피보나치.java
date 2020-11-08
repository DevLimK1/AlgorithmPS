package TIL.재귀;

public class 피보나치 {
    public static int[] table;

    public static void main(String[] args) {
        table=new int[7+1];
        System.out.println(memoFibo(5));
    }
    //피보나치
    public static int fibo(int data){
        if(data<=1)
            return 1;

        return fibo(data-1)+fibo(data-2);
    }

    //메모 피보나치
    public static int memoFibo(int data){
        if(data<=1){
            table[data]=1;
            return 1;
        }

        if(table[data]>0){
            return table[data];
        }
        table[data]=memoFibo(data-1)+memoFibo(data-2);

        return table[data];

    }

    public static int fact(int data){
        if(data<=1)
            return 1;

        return fact(data-1)*data;
    }

    public static void randomQuiz(){
        for(int i=0;i<50;i++){

        }
    }
}
