package programmers.level2.hash;

public class 전화번호목록arr_ver {
    public boolean solution(String[] phoneBook) {

        for (int i = 0; i < phoneBook.length - 1; i++) {
            for (int j = i + 1; j < phoneBook.length; j++) {
                if (phoneBook[i].indexOf(phoneBook[j])==0) {
                    return false;
                }
                if (phoneBook[j].indexOf(phoneBook[i])==0) {
                    return false;
                }
            }
        }
        return true;
    }
}
/* if (phoneBook[i].startsWith(phoneBook[j])) {
                    return false;
                }
                if (phoneBook[j].startsWith(phoneBook[i])) {
                    return false;
                }*/