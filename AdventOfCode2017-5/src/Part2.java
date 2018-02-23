import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Part2 {

    public static void main(String [ ] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\carolina\\Desktop\\AdventOfCode\\AdventOfCode2017-5\\src\\file.txt"));
        String line;
        int cenas = 0;
        int count = 0;
        ArrayList<Integer> jumps = new ArrayList<>();

        while ((line = br.readLine()) != null ) {
            jumps.add(Integer.parseInt(line));
        }
        while (cenas < jumps.size()){
            int val=jumps.get(cenas);
            if (val>=3){
                jumps.set(cenas,val-1);

            }
            else{
                jumps.set(cenas,val+1);
            }
            cenas=cenas+val;

            count++;
        }

        System.out.println("count = " + count);
    }
}
