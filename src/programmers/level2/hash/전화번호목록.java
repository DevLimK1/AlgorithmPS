package programmers.level2.hash;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {

        for (int i = 0; i < phone_book.length - 1; i++) {

            int hashPhone = phone_book[i].hashCode();
            int len = phone_book[i].length();

            for (int j = i + 1; j < phone_book.length; j++) {

                if (phone_book[j].length() >= len
                        && hashPhone == (phone_book[j].substring(0, len).hashCode())) {
                    return false;

                } else if (phone_book[j].length() < len
                        && phone_book[i].substring(0, phone_book[j].length())
                        .hashCode() == phone_book[j].hashCode()) {
                    return false;
                }

            }
        }

        return true;

    }
}


//        for(int i=0;i<phone_book.length-1;i++){
//        for(int j=i+1;j<phone_book.length;j++){
//        if(phone_book[i].startsWith(phone_book[j]))
//        return false;
//        if(phone_book[j].startsWith(phone_book[i]))
//        return false;
//        }
//        }
//        return answer;

/*int val=0;
        HashMap<String,Integer> h= new HashMap<>();

        for(String str : phone_book){
            h.put(str,val);
        }

        int phoneBookLength=phone_book.length;
        Set set=h.keySet();
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            if(h.containsKey(key)){
                answer=false;
                break;
            }
        }*/