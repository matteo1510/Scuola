#include<stdio.h>
#include<time.h>
#include<stdlib.h>

int main(int argc, char** argv) {
    
    int a[5];
    int i;
    
    
    for(i=0;i<6;i++){
        a[i]=i+1;
    }
    
    for(i=0;i<5;i++){
        printf("%d", a[i]);
    } 
    
    printf("\n");
    
    for(i=4;i>=0;i--){
        printf("%d", a[i]);
    }
    
    return 0;
}

