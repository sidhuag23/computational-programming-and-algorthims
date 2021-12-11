#include<stdio.h>
//program to print a pyramid 

int main(void){

    for(int i=0,n=6; i<=n; i++){
       printf(" \n"); //new line


            for(int x=i; x<=n; x++){
               printf("/");  //x <- i
             } //white space

            for(int j=0; j<=(i*2); j++){
               printf("*");  //j <- i
            } //character

   }

  return 0;
}
