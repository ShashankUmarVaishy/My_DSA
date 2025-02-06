#include<stdio.h>
void printArray(int arr[],int length){
for(int i=0;i<length;i++){
    printf("%d ",arr[i]);
}
}
int main(){
    int arr[]={1,2,34,65,32,78,98,-21,-53};
    int length=sizeof(arr)/sizeof(arr[0]);
    for(int i=1;i<length;i++){
        int currEle=arr[i];
       for(int j=i-1;j>=0;j--){
        if(arr[j]>currEle){
            //swap with front pos
            arr[j+1]=arr[j];
            arr[j]=currEle;
        }
           
        else break;
       }
       }
    printArray(arr,length);
    }
