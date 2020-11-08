package programmers.level3.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class 베스트앨범sol2Practice {
    class Song implements Comparable<Song> {

        int id,play;
        String genre;

        public Song(int id, int play, String genre) {
            this.id = id;
            this.play = play;
            this.genre = genre;
        }

        @Override
        public int compareTo(Song o) {
            if(this.play==o.play){
                return this.id-o.id; //오름차순
            }else{
                return o.play-this.play; //내림차순
            }
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> bestAlbum = new ArrayList<>();
        ArrayList<Song> songList=new ArrayList<>();
        HashMap<String, Integer> genreMap = new HashMap<>();
        HashMap<String, Integer> albumMap = new HashMap<>();

        for(int i=0;i<genres.length;i++){
            int id=i;
            int play=plays[i];
            String genre=genres[i];

            songList.add(new Song(id,play,genre));

            genreMap.put(genre,genreMap.getOrDefault(genre,0)+play);
        }

        Collections.sort(songList, new Comparator<Song>(){

            @Override
            public int compare(Song o1, Song o2) {
                if(o1.genre.equals(o2.genre)){
                    return o1.compareTo(o2);//Song클래스의 compareTo 차순을 따른다
                }
                else{ //장르 총 play 수 기준으로 내림차순
                    return genreMap.get(o2.genre)-genreMap.get(o1.genre);
                }
            }
        });

        for(Song song:songList){ //베스트 앨범 수록곡 수
            if(!albumMap.containsKey(song.genre)){
                albumMap.put(song.genre,1);
                bestAlbum.add(song.id);
            }else{
                int genreCnt=albumMap.get(song.genre);

                if(genreCnt>=2)
                    continue;
                else{
                    albumMap.put(song.genre,genreCnt+1);
                    bestAlbum.add(song.id);
                }
            }
        }

        int[] answer=new int[bestAlbum.size()];

        for(int i=0;i<bestAlbum.size();i++){
            answer[i]=bestAlbum.get(i);
        }

        return answer;

    }
}
