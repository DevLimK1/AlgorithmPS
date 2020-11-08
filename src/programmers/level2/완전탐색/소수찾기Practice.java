package programmers.level2.완전탐색;

import java.util.Arrays;

public class 소수찾기Practice {
    public int solution(String numbers){
        int maxNum=makeMaxNum(numbers.toCharArray());
        boolean[] primeNum=findPrimeNum(maxNum);

        return findMakePossiblePrimeNum(primeNum,maxNum);
    }

    private int findMakePossiblePrimeNum(boolean[] primeNum, int maxNum) {
        int possiblePrimeNumCount=0;

        for(int primeNumIndex=2;primeNumIndex<=maxNum;primeNumIndex++){
            if(!primeNum[primeNumIndex]&&isPossible(maxNum,primeNumIndex)){
                possiblePrimeNumCount++;
            }
        }

        return 0;

    }

    private boolean isPossible(int maxNum, int primeNum) {
        int[] numCount=countAvailableNums(maxNum);

        while(primeNum!=0){
            if(numCount[primeNum%10]<=0) return false;
            numCount[primeNum%10]--;
            primeNum/=10;
        }

        return true;
    }

    private int[] countAvailableNums(int maxNum) {
        char[] str=String.valueOf(maxNum).toCharArray();
        int[] numCount=new int[10];
        for(int i=0;i<str.length;i++){
            numCount[str[i]-'0']++;
        }
        return numCount;
    }

    private boolean[] findPrimeNum(int maxNum) {
        boolean[] result=new boolean[maxNum+1];
        for(int i=2;i<Math.sqrt(maxNum);i++){
            if(!result[i]){ //에라토스테네스의 체
                for(int j=i*i;j<=maxNum;j+=i){
                    result[j]=true;
                }
            }
        }
        return result;
    }

    private int makeMaxNum(char[] inputNum) {
        Arrays.sort(inputNum);
        int len=inputNum.length;
        for(int i=0;i<len/2;i++){
            char temp=inputNum[i];
            inputNum[i]=inputNum[len-1-i];
            inputNum[len-1-i]=temp;
        }
        return Integer.parseInt(new String(inputNum));
    }

}
