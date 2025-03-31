import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> list = new HashMap<>();
        int callings_cnt = callings.length;
        for(int i = 0; i < players.length; i++){
            list.put(players[i],i);
        }
        
        for(String call : callings){
            int index = list.get(call);
            if(index>0){
                String newPlayer = players[index-1];
                players[index-1] = call;
                players[index] = newPlayer;
                
                list.put(call,index-1);
                list.put(newPlayer, index);
            }
        }
        
        return players;
    }
}