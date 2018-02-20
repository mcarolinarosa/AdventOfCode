#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 3000

int char_to_digit(char c);


int main() {
    int i;
    int nDigit = 0;
    char a[MAX];
    int sum=0;


    FILE *f;
    char c;

    f=fopen("C:\\Users\\carolina\\CLionProjects\\untitled1\\file.txt","r");
    if (f) {
        while ((c = fgetc(f)) != EOF) {
            a[nDigit] = c;
            nDigit++;
        }
        fclose(f);
    }

    int div=(nDigit)/2;

    printf("a[0]=%c  a[nDigit]=%c \n",a[0],a[nDigit-1]);

    for (i=0;i<=div;i++){
        if(i<=div) {
            if (a[i] == a[i + div]) {
                int num = char_to_digit(a[i]);
                sum += num;
            }
        }
        else {
            if (a[i] == a[nDigit-(nDigit-i)+div]) {
                int num = char_to_digit(a[i]);
                sum += num;
            }
        }

    }

    sum=sum*2;


    printf("%d", sum);

    return 0;
}

int char_to_digit(char c) {
    return c - '0';
}
