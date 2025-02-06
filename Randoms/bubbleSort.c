#include <stdio.h>

void printArray(int arr[],int length){
for(int i=0;i<length;i++){
    printf("%d ",arr[i]);
}
}

int main(){
int arr[]={1,3,2,43,76,53,21,90,-21,-87,100};


int length=sizeof(arr)/sizeof(arr[0]);
printf("Original Array \n");
printArray(arr,length);
for(int i=0;i<length;i++){
    for(int j=0;j<length-1-i;j++){
        if(arr[j]>arr[j+1]){
            
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
           
        }
    }
}
printf("\n  Array after sorting \n");
printArray(arr,length);

    return 0;
}

