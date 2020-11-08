package programmers.level2.dp;

//https://programmers.co.kr/learn/courses/30/lessons/12905
public class 가장큰정사각형찾기 {
    public int solution(int[][] board) {

        int up, left, upLeft;
        int ans = 0;
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (board[y][x] == 1 && y > 0 && x > 0) {
                    up = board[y - 1][x];
                    left = board[y][x - 1];
                    upLeft = board[y - 1][x - 1];

                    int min = Math.min(up, left);
                    min = Math.min(upLeft, min);
                    board[y][x] = min + 1;

                }
                ans = Math.max(board[y][x], ans);
            }
        }


        return ans * ans;
    }
}


//sol2)
//    public int solution(int [][]board){
//        int up,left,upLeft;
//        int ans=0;
//        for(int y=0;y<board.length;y++){
//            for(int x=0;x<board[y].length;x++){
//                if(board[y][x]==1){
//                    up=board[y-1][x];
//                    left=board[y][x-1];
//                    upLeft=board[y-1][x-1];
//
//                    int min=Math.min(up,left);
//                    min=Math.min(upLeft,min);
//                    board[y][x]=min+1;
//                    ans=Math.max(board[y][x],ans);
//                }
//            }
//        }
//
//
////        for(int y=0;y<board.length;y++){
////            for(int x=0;x<board[y].length;x++){
////                if(board[y][x]>0){
////                    ans=Math.max(ans,board[y][x]); //정사각형의 최대값 찾기
////                }
////            }
////        }
//
//        return ans*ans;
//    }