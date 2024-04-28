/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> main = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return main;
        }
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(root);
        Queue<Node> cq = new ArrayDeque<>();
        
        while(mq.size() > 0){
            
            root = mq.remove();
            list.add(root.val);
            
            for(Node child : root.children){
                cq.add(child);
            }
            
            if(mq.size() == 0){
                mq = cq;
                cq = new ArrayDeque<>();
                main.add(list);
                list = new ArrayList<>();
            }
        }
        
        return main;
    }
}