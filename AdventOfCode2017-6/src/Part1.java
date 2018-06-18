
import java.util.*;
import java.io.*;

public class Part1 {

    public static void main(String [ ] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\carolina\\Desktop\\AdventOfCode\\AdventOfCode2017-6\\src\\file.txt"));
        String line;
        int count = 0;
        String aux = "";
        int num = 0;
        int j = 0;
        ArrayList<int[]> banks_all = new ArrayList<>();

        int[] array = new int[16];

        line = br.readLine();

        //para ler do ficheiro e passar para num
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) != ' ' && line.charAt(i) != '\t') {
                aux += line.charAt(i);
            }
            if (i == (line.length() - 1) || ((line.charAt(i) == '\t' || line.charAt(i) == ' ') && aux != "")) {
                num = Integer.parseInt(aux);
                array[j] = num;
                j++;
                aux = "";
            }
        }
        
        do {
            //encontra o maior
            int maior = 0, posM = 0, n = 0;

            for (int i = 0; i < j; i++) {
                if (array[i] > maior) {
                    maior = array[i];
                    posM = i;
                }
            }
            array[posM] = 0;
            for (int i = 0; i < maior; i++) {
                if (posM == j-1){
                    posM=0;
                }
                else {
                    posM++;
                }
                array[posM]++;
            }

            count++;

            int[] novo = new int[16];
            for (int i=0;i<novo.length; i++){
                novo[i]=array[i];
            }

            if(verificaExiste(banks_all, novo)){
                break;
            }

            banks_all.add(novo);
        }while(true);

        System.out.println("count = "+count);
    }


    static boolean verificaExiste(ArrayList<int[]> banks_all, int[] array){
        for (int [] curr : banks_all){
            if (Arrays.equals(curr, array))
                return true;
        }
        return false;
    }

    static void imprimeArray(int [] a){
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]+"   ");
        }
        System.out.println();
    }
}
