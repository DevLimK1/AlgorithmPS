package programmers.level3.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class 베스트앨범sol2 {
    class Song implements Comparable<Song> {
        int id, play;
        String genre;

        public Song(int id, int play, String genre) {
            this.id = id;
            this.play = play;
            this.genre = genre;
        }

        @Override
        public int compareTo(Song o) {
            if (this.play == o.play) {
                return this.id - o.id; //오름차순
            } else {
                return o.play - this.play; //내림차순
            }
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> bestAlbum = new ArrayList<>(); //베스트 앨범
        ArrayList<Song> songList = new ArrayList<>(); //노래 리스트
        HashMap<String, Integer> genreMap = new HashMap<>(); //장르와 장르 play 수
        HashMap<String, Integer> albumMap = new HashMap<>(); //장르와 앨범에 수록된 수

        for (int i = 0; i < genres.length; i++) {
            int id = i;
            int play = plays[i];
            String genre = genres[i];

            songList.add(new Song(id, play, genre));

            genreMap.put(genre, genreMap.getOrDefault(genre, 0) + play);
            /*if(genreMap.containsKey(genre)){
                genreMap.put(genre, genreMap.get(genre) + play);
            } else {
                genreMap.put(genre, play);
            }*/

        }

        Collections.sort(songList, new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                if (o1.genre.equals(o2.genre)) {
                    return o1.compareTo(o2); //Song클래스의 compareTo 차순을 따른다.
                } else {
                    return genreMap.get(o2.genre) - genreMap.get(o1.genre); //장르 총 play 수 기준으로 내림차순
                }
            }
        });

        for (Song song : songList) {
            if (!albumMap.containsKey(song.genre)) {
                albumMap.put(song.genre, 1);
                bestAlbum.add(song.id);
            } else {
                int genreCnt = albumMap.get(song.genre);

                if (genreCnt >= 2) continue;
                else {
                    albumMap.put(song.genre, genreCnt + 1);
                    bestAlbum.add(song.id);
                }
            }
        }

        int[] answer = new int[bestAlbum.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = bestAlbum.get(i);
        }


        return answer;
    }
}
