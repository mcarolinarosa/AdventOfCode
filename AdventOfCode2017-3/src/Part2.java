import java.util.*;
import java.io.*;

//puzzle input is 312051
public class Part2 {
    public static void main(String [ ] args) {

        int input = 312051;
        int[][] quadro = new int[15][15];

        for (int j=0; j<15;j++){
            for (int k=0;k<15;k++) {
                quadro[j][k]=0;
            }
        }

        int i = 0;
        int aux;
        int sum=0;
        int count=0;
        int x=8;
        int y=8;
        quadro[x][y]=1;
        int a=1;
        int b=1;

        while (sum<input){
            if (a==2) {
                count++;
                a=0;
            }
            if (b==5){
                b=1;
            }
            for (int j=0;j<count;j++) {
                if(b==1){
                    x+=1;
                }
                if(b==2){
                    y+=1;
                }
                if(b==3){
                    x-=1;
                }
                if(b==4){
                    y-=1;
                }
                if (x>1&&x<14&&y>1&&y<14) {
                    quadro[x][y] = quadro[x + 1][y] + quadro[x + 1][y - 1] + quadro[x][y - 1] + quadro[x - 1][y - 1] + quadro[x - 1][y] + quadro[x - 1][y + 1] + quadro[x][y + 1] + quadro[x + 1][y + 1];
                    sum = quadro[x][y];
                    if (sum>input){
                        break;
                    }
                }
            }
            if (sum>input){
                break;
            }
            a++;
            b++;
        }

        System.out.println(sum);
    }
}
