import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    @Test
    void addNewNode(){
        Tree<Integer> tree = new Tree<Integer>(15, null);
        tree.add(5, 13, 40, 9);
        tree.add(2);
        List list = new ArrayList<Integer>(Arrays.asList(2, 5, 9, 13, 15, 40));
        assertEquals(tree.print(),list.toString());
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 11, 8})
    void leftTree(int val){
        Tree<Integer> tree = new Tree<Integer>(15, null);
        tree.add(5, 13, 40, 9);
        tree.add(val);
        assertTrue(tree.left().search(val)!=null);
        assertTrue(tree.right().search(val)==null);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 45, 19})
    void rightTree(int val){
        Tree<Integer> tree = new Tree<Integer>(15, null);
        tree.add(5, 13, 40, 9);
        tree.add(val);
        assertTrue(tree.left().search(val)==null);
        assertTrue(tree.right().search(val)!=null);
    }

    @Test
    void binaryTreeStructure(){
        Tree<Integer> tree = new Tree<Integer>(15, null);
        tree.add(5, 13, 40, 9);
    }

    @Test
    void checkSearch(){
        Tree<Integer> tree1 = new Tree<Integer>(15, null);
        tree1.add(5, 13, 40, 9);
        Tree<Integer> tree2 = new Tree<Integer>(13, null);
        tree2.add(9);
        assertEquals(tree1.search(13).print(),tree2.print());
    }

}