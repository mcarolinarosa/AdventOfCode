import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Part1 {

    public static void main(String [ ] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\carolina\\Desktop\\AdventOfCode\\AdventOfCode2017-4\\src\\file.txt"));
        String line;
        int count=0;
        ArrayList <String> words = new ArrayList<>();
        String aux="";
        while ((line = br.readLine()) != null ) {
            for (int i=0;i<line.length();i++) {
                if (line.charAt(i) != ' ') {
                    aux+=line.charAt(i);
                }
                if (line.charAt(i) == ' '||i==line.length()-1){ //a última condição tem de ser verificada para a última palavra ser adicionada ao arrayList
                    if (words.contains(aux)){
                        break;
                    }
                    else{
                        words.add(aux);
                    }
                    aux="";
                }
                if (i==line.length()-1){
                    count++;
                }
            }
            words.clear();
            aux="";
        }
        System.out.println(count);
    }
}
