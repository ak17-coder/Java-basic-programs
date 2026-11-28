public class TreeSolns
{
    public static TreeNode createBinaryTree()
    {
        System.out.println();
        TreeNode root = new TreeNode(10);

        // TreeNode leftChild = new TreeNode(20);
        // TreeNode rigthChild = new TreeNode(30);

        // root.left = leftChild;
        // root.right = rightChild;

        // Children of Root
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        // Children of first left child of root
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);

        // Children of first right child of root
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);

        return root;
    }

    public static boolean findKey(TreeNode root, int key)
    {
        if(root == null)
            return false;

        if(root.data == key)
            return true;

        boolean leftTree = findKey(root.left, key);
        boolean rightTree = findKey(root.right, key);

        if(leftTree != true && rightTree != true)
            return false;

        return true;
    }

    public static int getSumOfNodes(TreeNode root)
    {
        if(root == null)
            return 0;

        int leftTree  = getSumOfNodes(root.left);
        int rightTree = getSumOfNodes(root.right);

        return leftTree + rightTree + root.data;
    }

    public static int getMax(TreeNode root)
    {
        if(root == null)
            return Integer.MIN_VALUE;

        int leftMax  = getMax(root.left);
        int rightMax = getMax(root.right);

        int max = Math.max(leftMax, rightMax);
        max = Math.max(root.data, max);

        return max;

    }

    public static int getCountOfNodes(TreeNode root)
    {
        if(root == null)
            return 0;

        int leftTree = getCountOfNodes(root.left);
        int rightTree = getCountOfNodes(root.right);

        int myOwnCount = 1;

        int totalCount = myOwnCount + leftTree + rightTree;

        return totalCount;
    }

    public static int getCountOfNodesHard(TreeNode root)
    {
        if(root == null) return 0;
        return getCountOfNodesHard(root.left) + getCountOfNodesHard(root.right) + 1;
    }

    public static void preOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return;

        System.out.print(" " + root.data);

        preOrderPrintTree(root.left);
        preOrderPrintTree(root.right);

    }

    public static void inOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return;

        inOrderPrintTree(root.left);
        System.out.print(" " + root.data);
        inOrderPrintTree(root.right);

    }

    public static void postOrderPrintTree(TreeNode root)
    {
        if(root == null)
            return;

        postOrderPrintTree(root.left);
        postOrderPrintTree(root.right);
        System.out.print(" " + root.data);

    }

    public static void printTreeBadCode(TreeNode root)
    {
        System.out.println(root.data);

        System.out.println(root.left.data);
        System.out.println(root.right.data);

        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);

        System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);

    }

    public static void main(String[] args)
    {
        TreeNode root = createBinaryTree();

        // System.out.println(root); // print address

        // prints data
        // printTreeBadCode(root);

        // // Root Left Right
        // System.out.println("Pre Order : Root Left Right");
        // preOrderPrintTree(root);

        // // Left Root Right
        // System.out.println("\nIn order : Left Root Right");
        // inOrderPrintTree(root);

        // // Left Right Root
        // System.out.println("\nPost order : Left Right Root");
        // postOrderPrintTree(root);

        // int totalCount = getCountOfNodes(root);
        int totalCount = getCountOfNodesHard(root);
        System.out.println("\nCount of Nodes : " + totalCount);

        boolean key = findKey(root, 90);
        System.out.println(key);

        int sum = getSumOfNodes(root);
        System.out.println(sum);

        int max = getMax(root);
        System.out.println(max);
    }
}
