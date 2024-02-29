import java.util.HashMap;
import java.util.Map;

class  Programmars_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {

        String answer ="";

        HashMap<String,Integer> map = new HashMap<>();

        for(String player : participant){
            map.put(player, map.getOrDefault(player,0) + 1);
        }

        for(String player : completion){
            map.put(player, map.get(player)-1); // 새로 들어온 것은 갱신됨. 덮어씌워짐.
        }

        for(Map.Entry<String,Integer> elem : map.entrySet()){
            if(elem.getValue() > 0 )
                answer = elem.getKey();
        }
        return answer;
    }
}