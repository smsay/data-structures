public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 5, 12, 3, 6, 11, 13, 2};
        for (int i = 0; i <7 ; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null,false);

    }
}
