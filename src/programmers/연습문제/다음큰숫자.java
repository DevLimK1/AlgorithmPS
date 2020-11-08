package programmers.연습문제;
//https://programmers.co.kr/learn/courses/30/lessons/12911
public class 다음큰숫자 {
    //sol1)
    public int solution(int n) {
        int bitCount = Integer.bitCount(n);
        for(int i = n+1; ;i++) {
            if(bitCount == Integer.bitCount(i)) {
                return i;
            }
        }
    }


}

//sol2)
//public int solution(int n){
//    String nBi=Integer.toBinaryString(n);// n 이진수화
//    int myCount=countOne(nBi);
//
//    for(int i=n+1;;i++){
//        String mBi=Integer.toBinaryString(i);
//        int count=countOne(mBi);
//        if(count==myCount)
//            return i;
//    }
//
//}
//
//    private int countOne(String nBi) {
//        char[] args=nBi.toCharArray();
//        int count =0;
//        for(char k:args){
//            if(k=='1')
//                count++;
//        }
//        return count;
//    }