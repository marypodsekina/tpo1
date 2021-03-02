import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Tree<Integer> tr = new Tree<Integer>(15,null);
        tr.add(5,17,14,8,10,45,18,5);
        System.out.println(tr.print());

    }
}
