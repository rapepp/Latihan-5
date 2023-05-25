public class Main {
    public static void main(String[] args) {
        BinartTree tree = new BinartTree();

        tree.NewNode(20);
        tree.NewNode(2);
        tree.NewNode(25);
        tree.NewNode(37);
        tree.NewNode(16);

        System.out.print("\nPre Order : ");
        tree.preOrder(tree.root);
        System.out.print("\nIn Order : ");
        tree.inOrder(tree.root);
        System.out.print("\nPost Order : ");
        tree.postOrder(tree.root);
    }
}
