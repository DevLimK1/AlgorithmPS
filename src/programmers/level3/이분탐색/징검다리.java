package programmers.level3.이분탐색;

import java.util.Arrays;

public class 징검다리 {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks);//이분탐색할 때는 정렬을 해야함
        int left=1;
        int right=distance;
        int remove=0;//제거한 바위갯수
        int mid;//바위사이의 최소 거리
        int lastRock=0;//비교할 기준 점이 되는 마지막 바위
        while(left<=right){
            mid=(left+right)/2; //이분 탐색
//            for(int i=0;i<rocks.length;i++){
//                if(mid>rocks[i]-lastRock) remove++;
//                else lastRock=rocks[i];
//            }
            for(int rock: rocks){
                if(mid>rock-lastRock)
                    remove++; //최소한의 거리(mid)보다 작으면 돌 제거 왜? 최소한의 거리가 mid인데 더 작을 수는 없으니깐..
                else
                    lastRock=rock;//최소한의 거리 mid 보다 크면 해당 돌이 비교 위치가 된다.
            }

            if(mid>distance-lastRock) remove++;//마지막바위와 도착지간의 거리 체크

            if(remove>n) right=mid-1; //제거할 돌의 갯수 n 보다 제거한 돌의 갯수가 많으면 최소한의 거리(mid)의 범위가 너무 크다는 것이니깐
                // mid-1 를 해서 범위를 좁혀야한다.
            else{ //제거할 돌의 갯수가 제거된 돌의 갯수보다 작거나 같으면
                answer=Math.max(answer, mid);
                left=mid+1;
            }
            remove=0;
            lastRock=0;
        }
        return answer;
    }
}

/*
        // 먼저 입력받은 rock를 오름차순 정렬한다.
        Arrays.sort(rocks);

        // 최소 1~ 최대 distance 범위에서 선택 된 정수 x를 선택 후
        // 주어진 돌 들의 간격을 x이상이 되게 만들어 준다.

        // x이상을 만들기 위해서 제거해야하는 돌이 n개를 초과한다면, x보다 작은 범위에 정답이 있다.

        // 제거해야 하는 돌이 n개 이하인 경우에는, 거리가 x이상이 되도록 만들 수 있기 때문에 그 중 최댓값을 찾아간다.
        // x이상의 범위에서 더 큰 값이 성립하는지 계속 확인해야 한다.

        // 여기서 제거해야하는 돌이 n개보다 작은 경우에도 가능한 경우는,
        // 모든 돌이 x이상으로 정렬 되 어 있을 때는 나열 된 돌 중에서 아무거나 빼도 x이상의 조건이 유지됨으로, n개까지 뺄 수 있도록 만들 수 있다.

        // 처음에 rocks[0]으로 초기화 했더니 자꾸실패났다....
        // 답이 될 수 있는 최소거리는 중간에 더 작은 범위가 나올 수 있다..
        long left = 1;
        // 최대범위는 도착 거리이다.
        long right = distance;

        long answer = 0 ;

        // 정해진 범위내에서 이분탐색을 수행한다.
        // left==right인 경우에도 최종조건이 맞는지 확인해주어야하기 때문에 포함한다.
        while( left <= right ) {

            // 조건을 만족시키기 위해서 제거해야하는 돌의 갯수
            int removeRockCnt = 0 ;

            // 이전 돌의 위치값이 기록된다. 돌이 제거되지 않는경우가 발생할 때, 이전돌의 위치를 변경시켜준다.
            int prev = 0;

            long minDistance = (left+right)/2;

            for( int rock : rocks ) {

                // 가장 가까운 위치에 있는 돌부터 ~ 가장 멀리 있는 돌까지 차례대로 돌 사이의 거리를 확인한다.
                // 돌 사이의 거리가 최소가 될 수 있는 경우는 현재 돌과, 이전 돌의 거리가 된다. ( 시작 돌의 위치는 이전 돌의 거리가 0이된다. )

                // 즉, [ 현재돌 - 이전돌 ]을해서 돌 사이의 거리를 구했을 때, 기준이되는 minDistance보다 작은경우가 있다면
                // 현재 돌을 제거해주어야 된다.
                // 현재 돌을 제거하면 다음 돌과 이전 돌의 거리는 더 길어질 수 밖에 없기 때문이다.
                if( (rock - prev) < minDistance ) removeRockCnt++;


                    // 그러나 [ 현재돌 - 이전돌 ] 사이의 거리가 기준이 되는 minDistance보다 크거나 같은 경우라면 우리가 찾고자하는 조건에 성립하기 때문에
                    // 현재돌을 기준으로 다시 조건에 맞지않는 대상이 있는지 찾아주어야한다. 고로 prev의 값을 현재돌로 변경해준다.
                else prev = rock;


                // 이 과정을 순서대로 처리하다보면, [ 처음돌 ~ 마지막 돌 ]이 나란히 놓여있을 때, 모든 돌 사이의거리가 minDistance 이상이 된다.
            }

            // minDistance이상의 거리를 유지하는 돌을 위치하도록 하였을 때, 제거되는 돌의 갯수를 removeRockCnt로 기록하였다.

            // 추가로 문제의 특성상 마지막으로 남아있는 돌과 distance의 거리도 확인해주어야 한다.
            // 모든 돌을 제거하면서 확인하기 때문에, 마지막에 남아있는돌의 위치는 prev에 기록되어있다.
            if( distance - prev < minDistance ) removeRockCnt++;

            // removeRockCnt가 n보다 작거나 같은경우에는, 가능한 minDistance 중 최댓값을 기록하고,
            // 최댓값을 찾아야 하기때문에 더 큰 범위에서도 조건이 만족하는 경우가 있는지 확인한다.
            if( removeRockCnt <= n ) {
                answer = Math.max(answer, minDistance);
                left = minDistance+1 ;
            }
            // 큰 경우에는 더 작은범위에서 조건을 성립하는 minDistance를 찾아야 한다.
            else right = minDistance-1;
        }

        return (int)answer ;*/