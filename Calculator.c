#include<stdio.h>
int main(){
 int a ,b,ch;
 printf("Enter your nos:");
 scanf("%d",&a);
 scanf("%d",&a);
 printf("1.Addition/n2.Subtraction/n");
 printf("3.Multiply/n4.Division/n");
 printf("Enter your choice:");
 scanf("%d",&ch);
 switch(ch){
 case 1:
 printf(a+b);
 break;
 case 2:
 printf(a-b);
 break;
 case 3:
 printf(a*b);
 break;
 case 4:
 printf(a/b);
 break;
}
 return 0;
