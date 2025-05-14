import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < tc; i++){
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> iter = list.listIterator();
            String line = br.readLine();
            for(char c : line.toCharArray()){
                if(c == '<'){
                    if(iter.hasPrevious()){
                        iter.previous() ;
                    }
                } else if (c == '>') {
                    if(iter.hasNext()){
                        iter.next();
                    }
                } else if (c == '-') {
                    if(iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }
                } else{
                    iter.add(c);
                }
            }
            for(Character c :list){
                result.append(c);
            }
            result.append('\n');
        }
        System.out.println(result);
    }
}
