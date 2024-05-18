import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<String, Integer> words = new TreeMap<>((s1, s2) -> {
            if(s1.length() != s2.length()){
                return s1.length()-s2.length();
            }else{
                return s1.compareTo(s2);
            }
        });
        int N = scan.nextInt();

        for(int i = 0; i < N; i++){
            String word = scan.next();
            if(words.get(word)!=null){
              continue;
            }
            words.put(word, word.length());
        }

        words.keySet().forEach(key ->{
            System.out.println(key);
        });
    }
}
