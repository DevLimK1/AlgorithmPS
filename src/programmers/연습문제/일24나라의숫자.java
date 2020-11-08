package programmers.연습문제;

//https://programmers.co.kr/learn/courses/30/lessons/12899
public class 일24나라의숫자 {
    public String solution(int n) {
        String answer = "";

        String[] arr={"4","1","2"};

        while(n>0){
            answer=arr[n%3]+answer;
            n=(n-1)/3;
        }
        return answer;
    }
}

/*sol1)
while(n>0){
            int reminder=n%3;
            n/=3;

            if(reminder==0)
                n--;

            answer=arr[reminder]+answer; //
        }*/