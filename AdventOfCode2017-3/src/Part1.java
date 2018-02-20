
import java.util.*;
        import java.io.*;

//puzzle input is 312051
public class Part1 {
    public static void main(String [ ] args){

        int input = 312051;
        int i = 0;
        int aux;
        int sum=0;

        while (i * i < input) {
            i++;
        }
        aux=i-1;
        if (input>(i*i-aux)){
            if (input<(i*i)-(aux/2)+1){
                sum += ((i*i)-(aux/2))-input;
                sum+= aux/2;
                System.out.println(sum);
            }
            else
                System.out.println("not yolo");

        }
        else if (input>(i*i-2*aux)){
            System.out.println("esquerdo");
        }
        else if (input>(i*i-3*aux)){
            System.out.println("cima");
        }
        else if (input>(i*i-4*aux)){
            System.out.println("direito");
        }

    }

}

