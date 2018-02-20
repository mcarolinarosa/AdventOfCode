import java.util.*;
import java.io.*;

public class Part1 {

    public static void main(String [ ] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\carolina\\eclipse-workspace\\AdventOfCode2017-2\\src\\file.txt"));
        String line;
        int max=0;
        int min=10000;
        int num=0;
        int sum=0;
        String aux="";
        while ((line = br.readLine()) != null ) {
            for (int i=0;i<line.length();i++) {
                if (line.charAt(i) != '\t' && line.charAt(i) != ' ') {
                    aux+=line.charAt(i);

                }
                if (i==(line.length()-1) || ((line.charAt(i) == '\t' || line.charAt(i) == ' ') && aux!="")){
                    num=Integer.parseInt(aux);
                    System.out.println("num="+ num);
                    if (num <min){
                        min=num;
                    }
                    if (num>max){
                        max=num;
                    }
                    aux="";
                }
            }
            sum+=(max-min);
            System.out.println("sum="+sum);
            max=0;
            min=10000;
        }
    }
}
