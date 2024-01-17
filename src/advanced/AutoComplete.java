package advanced;

public class AutoComplete {

    public static void main(String[] args) {

        String str [] = {"harsh","harshvardhan","harish","hari","haresh"};
        Trie trie = new Trie();
        Trie.TrieNode root = new Trie.TrieNode();
        for(String s : str)
            trie.insert(root,s);

        printSuggestions(root,"har");

    }

    static void printSuggestions(Trie.TrieNode root, String res)
    {
        if (root.isEndOfWord == true)
        {
            System.out.print(res + " ");
        }
        for(int i = 0; i < 26; i++)
        {

            if (root.children[i] != null)
            {
                res += (char)i;
                printSuggestions(root.children[i], res);
                res = res.substring(0, res.length() - 2);
            }
        }
    }

}
