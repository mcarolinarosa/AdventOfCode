import java.util.*;
import java.io.*;

public class Part2 {

    public static void main(String [ ] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\carolina\\eclipse-workspace\\AdventOfCode2017-2\\src\\file.txt"));
        String line;
        int num=0;
        int sum=0;
        String aux="";
        ArrayList <Integer> arr = new ArrayList<>();

        while ((line = br.readLine()) != null ) {

            for (int i=0;i<line.length();i++) {
                if (line.charAt(i) != '\t' && line.charAt(i) != ' ') {
                    aux+=line.charAt(i);

                }
                if (i==(line.length()-1) || ((line.charAt(i) == '\t' || line.charAt(i) == ' ') && aux!="")){
                    num=Integer.parseInt(aux);
                    arr.add(num);
                    aux="";
                }
            }
            System.out.println("size"+arr.size());
            for (int j=0;j<=arr.size();j++){
                System.out.println("j="+j);
                for (int k=j+1;k<arr.size();k++){
                    if(arr.get(k)%arr.get(j)==0){
                        sum+=(arr.get(k)/arr.get(j));
                        System.out.println("k="+arr.get(k)+"   j="+arr.get(j));

                    }else if(arr.get(j)%arr.get(k)==0) {
                        sum+=(arr.get(j)/arr.get(k));
                        System.out.println("j="+arr.get(j)+"   k="+arr.get(k));

                    }
                }
            }

            arr.removeAll(arr);
            System.out.println("sum="+sum);

        }
    }
}
