package selfArrayList;

import java.util.Arrays;

public class customArrayList {
    private int[]data;
    private int defaultSize=10;
    private int size;

    public customArrayList() {
        this.data =new int[defaultSize];
        this.size=0;
    }
    public void add(int num){
        if(isFull()){
            resize();
        }//add in it
        data[size++]=num;
    }
    public int remove(){
        if(size==0){
            System.out.println("ArayList is empty");
            return Integer.MAX_VALUE;
        }int removed=data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }


    @Override
    public String toString() {
        return "customArrayList{" +
                "data=" + Arrays.toString(data) +
                ", defaultSize=" + defaultSize +
                ", size=" + size +
                '}';
    }

    private void resize() {
        int[]temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] =data[i];
        }data=temp;
    }

    private boolean isFull() {

        return data.length==size;
    }

    public static void main(String[] args) {
    customArrayList list=new customArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
        System.out.println(list);
    }
}
