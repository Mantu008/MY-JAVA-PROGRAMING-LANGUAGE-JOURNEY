#include<stdio.h>
int main(){
    int a[5]={1,2,3,4,5};
    int i;
    int pos;
    int inc;
  printf("array before incerting value:\n");
    for(i=0;i<5;i++){
        printf("a[%d]=%d\n",i,a[i]);

     }

    printf("enter the position where incert value:\n");
    scanf("%d",&pos);
    printf("enter the value which incert in array:\n");
    scanf("%d",&inc);

     a[6];

     for(i=6;i>=pos;i--){
         a[i]=a[i-1];
     }

     a[pos]=inc;


     printf("array after incerting value:\n");


      for(i=0;i<6;i++){
        printf("a[%d]=%d\n",i,a[i]);

     }



   




    return 0;
}