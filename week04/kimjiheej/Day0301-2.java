package hash.JH;

import java.util.HashMap;
import java.util.Map;

class Programmers_전화번호목록 {
    public boolean solution(String[] phone_book) {

        Map<String,Integer> map = new HashMap<>();

        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i],i);
        }

        // 밑의 아이를
        for(int i=0; i<phone_book.length; i++){
            for(int j=1; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j)))
                    return false;
            }
        }

        return true;
    }
}

// substring 의 개념을 까먹어서 못품 !! 진짜.... 해시도 어렵네 ^^
// map 은 put 으로 넣어주고 set 이 add 임 기억하자
// 그리고 containsKey 가 굉장히 유용한 기능이네 !! 바로 해당 키가 있는지 확인해주기 때문임...
