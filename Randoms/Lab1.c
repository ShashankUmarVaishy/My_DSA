#include <stdio.h>

void deletePos(int arr[],int pos,int size){

    for(int i=pos;i<=5;i++){
        arr[i-1]=arr[i];
    }
    printf("array after deletion=>");
for(int i=0;i<size-1;i++){
    printf(" %d",arr[i]);
}
putchar('\n');
}
    
void insertValue(int arr[],int data,int pos,int size){
    for(int i=size;i>=pos;i--){
        arr[i]=arr[i-1];
    }
    arr[pos-1]=data;
    printf("Array after Insertion=>");
    for(int i=0;i<=size;i++){
    printf(" %d",arr[i]);
}
putchar('\n');
}
int main() {
 int arr[100]={0,1,2,3,4};
 int size=5;
 
 char oper='a';
 printf("Initial array=>");
for(int i=0;i<size;i++){
    printf(" %d",arr[i]);
}
putchar('\n');
do{
    printf("You want to delete or insert or end? \n d->delete i=insert e->end \n");
scanf("%s",&oper);
if(oper=='d'){
    //delete operation
    int pos;
    printf("Enter position from where to delete:\n");
    scanf("%d",&pos);
    if(pos<size+1 && pos>0){
    deletePos(arr,pos,size);
    size--;
    }else{
        printf("Invalid position\n");
    }
}
else if(oper=='i'){
    //insertion operation 
    printf("Enter value and position respectively:\n");
    int data,pos;
    scanf("%d%d",&data,&pos);
    if(pos<size+2 && pos>0){
    insertValue(arr,data,pos,size);
    size++;
    }else{
    printf("Invalid position\n ");
    }
}else if(oper=='e'){
    printf("Final Array=>");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}
}
while(oper!='e');

return 0;
}