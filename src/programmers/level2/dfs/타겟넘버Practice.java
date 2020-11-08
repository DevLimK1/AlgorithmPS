package programmers.level2.dfs;

public class 타겟넘버Practice {
    public int solution(int[] numbers, int target) {
        return DFS(numbers,target,0,0);
    }

    public int DFS(int[] numbers,int target,int index,int num){
        if(index==numbers.length){
            return num==target?1:0;
        }
        else{
            int firstDFS=DFS(numbers,target,index+1,num+numbers[index]);
            int secondDFS=DFS(numbers,target,index+1,num-numbers[index]);
            return firstDFS+secondDFS;
        }
    }
}
