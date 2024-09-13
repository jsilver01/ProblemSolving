import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            /**
             * LinkedList 에서의 검색은 ArrayList 와 마찬가지로 head 부터 tail 까지
             * 순차적으로 순회하며 데이터를 찾기 때문에 O(N) 의 복잡도를 가진다.
             */
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            LinkedList ll = new LinkedList();
            String[] str = br.readLine().split("");
            for(int i = 0; i < str.length; i++){
                ll.add(str[i]);
            }
            ListIterator<String> cursor = ll.listIterator(ll.size());
            int commandNum = Integer.parseInt(br.readLine());
            String word;
            while(commandNum!=0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                switch(st.nextToken()){
                    case "P":
                       word = st.nextToken();
                       cursor.add(word);
                       break;
                    case "L":
                        if(cursor.hasPrevious()){
                            cursor.previous();
                        }
                        break;
                    case "D":
                        if(cursor.hasNext()){
                            cursor.next();
                        }
                        break;
                    case "B":
                        if(cursor.hasPrevious()){
                            cursor.previous();
                            cursor.remove();
                        }
                        break;
                }
                commandNum--;
            }
            for (Object s : ll) {
                bw.write((String) s);
            }
            bw.flush();
            bw.close();
        }
}
