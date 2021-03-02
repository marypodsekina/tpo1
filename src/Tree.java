import java.util.ArrayList;
import java.util.List;

public class Tree<T extends Comparable<T>> {
    private T val;
    private Tree left;
    private Tree right;
    private Tree parent;
    private List<T> listForPrint = new ArrayList<>();

    public T val() {
        return val;
    }

    public Tree left() {
        return left;
    }

    public Tree right() {
        return right;
    }

    public Tree parent() {
        return parent;
    }

    public Tree(T val, Tree parent) {
        this.val = val;
        this.parent = parent;
    }

    public void add(T... vals) {
        for (T v : vals) {
            add(v);
        }
    }

    public void add(T val) {
        if (val.compareTo(this.val) < 0) {
            if (this.left == null) {
                this.left = new Tree(val, this);
            } else if (this.left != null)
                this.left.add(val);
        } else {
            if (this.right == null) {
                this.right = new Tree(val, this);
            } else if (this.right != null)
                this.right.add(val);
        }
    }

    private Tree<T> _search(Tree<T> tree, T val) {
        if (tree == null) return null;
        switch (val.compareTo(tree.val)) {
            case 1:
                return _search(tree.right, val);
            case -1:
                return _search(tree.left, val);
            case 0:
                return tree;
            default:
                return null;
        }
    }

    public Tree<T> search(T val) {
        return _search(this, val);
    }

    private void _print(Tree<T> node) {
        if (node == null) return;
        _print(node.left);
        listForPrint.add(node.val);
        //System.out.print(node + " ");
        if (node.right != null)
            _print(node.right);
    }

    public String print() {
        listForPrint.clear();
        _print(this);
        //System.out.println();
        return listForPrint.toString();
    }

    @Override
    public String toString() {
        return val.toString();
    }
}

