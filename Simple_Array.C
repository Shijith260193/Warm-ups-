#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i;
    int sum=0;
    int size;
    //printf("Enter the array size\n");
    scanf("%d",&size);
    int array[size];
    for(i=0;i<size;i++)
        {
        scanf("%d",&array[i]);
        sum=sum+array[i];
        
    }
    printf("%d",sum);
    return 0;
}
