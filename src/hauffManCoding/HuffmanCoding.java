package hauffManCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class HuffmanCoding {

    HashMap<Character,String> encoder;
    HashMap<String,Character> decoder;

    private class Node implements Comparable<Node>{

        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        HuffmanCoding hf = new HuffmanCoding();
        hf.encoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String ds = hf.decode(cs);
        System.out.println(ds);

    }

    public void encoder(String feeder){

        Map<Character,Integer> fmap = new HashMap<>();

        for(int i=0;i<feeder.length();i++){

            if(fmap.containsKey(feeder.charAt(i))){
                int a = fmap.get(feeder.charAt(i));
                fmap.put(feeder.charAt(i),++a);
            }
            else
                fmap.put(feeder.charAt(i),1);

        }

        PriorityQueue<Node> heap = new PriorityQueue<>();
        Set<Map.Entry<Character,Integer>> set = fmap.entrySet();

        for(Map.Entry<Character,Integer> entry : set){
            Node node = new Node(entry.getKey(),entry.getValue());
            heap.add(node);
        }

        while (heap.size() != 1){
            Node first = heap.remove();
            Node second = heap.remove();
            Node node = new Node('\0',first.cost+second.cost);
            node.left = first;
            node.right = second;
            heap.add(node);
        }

        Node ft = heap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();
        this.initEncoderDecoder(ft,"");
    }

    private void initEncoderDecoder(Node node, String osf){

        if(node == null)
            return;

        if (node.left == null && node.right == null) {
            this.encoder.put(node.data,osf);
            this.decoder.put(osf,node.data);
        }
        initEncoderDecoder(node.left,osf+"0");
        initEncoderDecoder(node.right,osf+"1");
    }

    public String encode(String source){
        String ans = "";
        for(int i=0;i<source.length();i++){
            ans = ans + encoder.get(source.charAt(i));
        }
        return ans;
    }

    public String decode(String codedString){
        String key = "";
        String ans = "";
        for(int i=0;i<codedString.length();i++){
            key = key + codedString.charAt(i);
            if(decoder.containsKey(key)){
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }


}
