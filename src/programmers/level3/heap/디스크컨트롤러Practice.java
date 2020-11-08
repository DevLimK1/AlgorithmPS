//package programmers.level3.heap;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.PriorityQueue;
//
//class Job implements Comparable<Job>{
//    int start;
//    int workTime;
//
//    public Job(int start,int workTime){
//        this.start=start;
//        this.workTime=workTime;
//    }
//
//    @Override
//    public int compareTo(Job o) {//오름차순
//        if(this.workTime<o.workTime){
//            return -1;
//        }
//        else if(this.workTime==o.workTime){
//            if(this.start<o.start)
//                return -1;
//            else
//                return 1;
//        }else
//            return 1;
//    }
//}
//
//public class 디스크컨트롤러Practice {
//
//    public int solution(int[][] jobs) {
//        PriorityQueue<Job> pq = new PriorityQueue<>();
//        List<Job> list = new ArrayList<>();
//
//        //PriorityQueue를 활용한 Job 정렬, min heap
//        for(int i=0;i< jobs.length;i++){
//            pq.add(new Job(jobs[i][0],jobs[i][1]));
//        }
//
//        //list에 우선순위 순으로 정렬된 job 순차적 삽입
//        for(int i=0;i<jobs.length;i++){
//            list.add(pq.poll());
//        }
//
//        int time=0;
//        int sum=0;
//        while(list.size()>0){
//            for(int i=0;i<list.size();i++){
//                //시작시간이 현재 시간보다 이전이라면 시작 가능
//                if(time>=list.get(i).start){
//
//                }
//            }
//        }
//
//    }
//}
