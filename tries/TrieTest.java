import java.util.*;
public class TrieTest {
    public static void main(String[] agrs) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        trie.printAll(trie.root);
    }
}