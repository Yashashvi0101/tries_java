public class search_in_tries {
    static class Node {
        Node children[] = new Node[26];
        boolean endofword = false;
        Node(){
         for (int i = 0; i < 26; i++) {
           children[i] = null; 
         }
        }
         
      }
      public static Node root =new Node();
      public static void  insert(String word){
         Node curr = root;
         for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level)-'a';
            if (curr.children[idx] == null) {
               curr.children[idx] =new Node();
            }
            curr = curr.children[idx];
            }
            curr.endofword =true;
      }
      public static boolean search(String key){
        Node curr = root;
         for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level)-'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
            }
            return curr.endofword =true;
      }
       public static void main(String[] args) { 
         String words[] ={"the","there","a","their","any","thee"};
         for (int i = 0; i < words.length; i++) {
          insert(words[i]); 
         }
         System.out.println(search("thee"));
         System.out.println(search("theo"));
      }
      
}
