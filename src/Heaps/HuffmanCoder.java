package Heaps;
import java.io.IOException;
import java.util.*;
public class HuffmanCoder {
    HashMap<Character,String>encoder;
    HashMap<String,Character>decoder;
    private class Node implements Comparable<Node>{
        Character data;
        int cost;
        Node left, right;
        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left=null;
            this.right=null;
        }
        @Override
        public int compareTo(Node other) {
            return this.cost-other.cost;
        }

    }
    public HuffmanCoder(String feeder)throws Exception {
        //make a frequency map
        HashMap<Character, Integer> fmap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            char cc = feeder.charAt(i);
            if (fmap.containsKey(cc)) {
                int currVal = fmap.get(cc);
                fmap.put(cc, currVal + 1);
            } else {
                fmap.put(cc, 1);
            }
        }
        //create min heap
        Heap<Node> minHeap = new Heap<>();
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }
        while (minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();
            Node nn = new Node('\0', first.cost + second.cost);
            nn.left = first;
            nn.right = second;
            minHeap.insert(nn);
        }
        Node ft = minHeap.remove();
        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(ft, "");
    }
    private void initEncoderDecoder(Node node, String osf) {
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            //at the leaf node
            this.encoder.put(node.data,osf);
            this.decoder.put(osf,node.data);
        }
        initEncoderDecoder(node.left, osf+"0");
        initEncoderDecoder(node.right, osf+"1");

    }
    public String encode(String input) {
        String ans="";
        for(int i=0;i<input.length();i++){
            ans=ans+encoder.get(input.charAt(i));
        }
        return ans;
    }
    public String decode(String input){
        String key="";
        String ans="";
        for (int i = 0; i < input.length(); i++) {
            key=key+input.charAt(i);
            if(decoder.containsKey(key)){
                ans=ans+decoder.get(key);
                key="";
            }
        }
        return ans;
    }
}