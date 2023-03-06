import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Node {
    public int val;
    public List<Node> children;


    public Node() {
        children = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class _1506FindRoot {
    public int isParent(List<Node> tree,int result){
        ListIterator<Node> iterator = tree.listIterator();
        while(iterator.hasNext()){
            Node parent = iterator.next();
            result = result^parent.val;
        }
        return result;
    }

    public Node findRoot(List<Node> tree) {
        int result = 0;

        ListIterator<Node>iterator = tree.listIterator();
        while(iterator.hasNext()){
            Node parent = iterator.next();
            // result = result^parent.val;
            if(parent!=null){
                List<Node>children = parent.children;
                ListIterator<Node>iter = children.listIterator();
                while(iter.hasNext()){
                    Node child = iter.next();
                    result=result^child.val;
                }
            }
        }
        int val = isParent(tree,result);
        iterator = tree.listIterator();
        while(iterator.hasNext()){
            Node parent = iterator.next();
            if(parent.val == val)return parent;
        }
        return null;
    }
}
