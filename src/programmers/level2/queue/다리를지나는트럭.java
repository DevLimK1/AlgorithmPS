package programmers.level2.queue;

import java.util.LinkedList;
import java.util.Queue;

class Truck{
    int weight;
    int entryTime;

    public Truck(int weight, int entryTime) {
        this.weight = weight;
        this.entryTime = entryTime;
    }
}

public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> waiting=new LinkedList<>();
        Queue<Truck> bridge=new LinkedList<>();

        for(int i=0;i<truck_weights.length;i++){ //대기하는 트럭 생성
            waiting.offer(new Truck(truck_weights[i],0));
        }

        int time=0;
        int totalWeight=0;

        while(!waiting.isEmpty()||!bridge.isEmpty()){//대기하는 트럭이 있거나, 다리를 건너고 있는 트럭이 있으면
            time++;
            if(!bridge.isEmpty()){//다리를 건너고 있는 트럭이 있으면
                Truck t=bridge.peek();
                if(time-t.entryTime>=bridge_length){//(전체시간-다리 진입한 시간)>=다리를 건너는 시간
                    totalWeight-=t.weight;
                    bridge.poll();
                }
            }

            if(!waiting.isEmpty()){//대기하는 트럭이 있으면
                if(totalWeight+waiting.peek().weight<=weight){
                    Truck t=waiting.poll();
                    totalWeight+=t.weight;

                    bridge.offer(new Truck(t.weight,time));
                }

            }
        }
        return time;

    }
}
