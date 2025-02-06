#include<stdio.h>
void printArray(int arr[],int length){
for(int i=0;i<length;i++){
    printf("%d ",arr[i]);
}
}

int main (){
    int arr[]={1,3,2,43,76,53,21,32,45,67,98,65,11,90,-21,-87,100};

int length=sizeof(arr)/sizeof(arr[0]);
printf("Original Array \n");
printArray(arr,length);
for(int i=0;i<length;i++){
    int minIdx=i;
    for(int j=i;j<length;j++){
       if(arr[minIdx]>arr[j]){
        minIdx=j;
       }  
        }
     int temp=arr[minIdx];
        arr[minIdx]=arr[i];
        arr[i]=temp;

    }
    printf("\n  Array after sorting \n");
    printArray(arr,length);
    return 0;
}
