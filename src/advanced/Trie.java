package advanced;

public class Trie {

    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode(){
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    public void insert(TrieNode root,String key){
        TrieNode curNode = root;
        for(int i=0; i<key.length();i++){
            char curr = key.charAt(i);
            if(curNode.children[curr-'a'] == null){
                TrieNode newNode = new TrieNode();
                curNode.children[curr-'a'] = newNode;
            }
            curNode = curNode.children[curr-'a'];
        }
        curNode.isEndOfWord=true;
    }

    public boolean search(TrieNode root,String key){
        TrieNode cur = root;
        for(int i=0;i<key.length();i++){
            char curr = key.charAt(i);
            if(cur.children[curr-'a']==null)
                return false;
            cur = cur.children[curr-'a'];
        }

        return cur.isEndOfWord;
    }

    public static void main(String[] args) {

        TrieNode root = new TrieNode();
        Trie trie = new Trie();

        trie.insert(root,"apple");
        System.out.println(trie.search(root,"app"));

    }

}
