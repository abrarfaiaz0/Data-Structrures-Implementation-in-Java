public class BinaryTree{

    private TreeNode root;
    
    private static class TreeNode{
        
        private int data;
        private TreeNode left;
        private TreeNode right;
        
        public TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    
    }
    public void insertBST(int value)
    {
        root=insertBST(root, value);
    }

    public TreeNode insertBST(TreeNode root,int value){
        if(root == null)
        {
            root = new TreeNode(value);
            return root;
        }
        if(value>root.data)
            root.right = insertBST(root.right,value);
        else 
            root.left = insertBST(root.left,value);

        return root;
    }

    public void length()
    {
        int l=0;
    }
    
    public void PreOrder()
    {
        PreOrder(root);
    }
    
    public static void PreOrder(TreeNode root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" --> ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    
    public void InOrder()
    {
        InOrder(root);
    }

    public static void InOrder(TreeNode root)
    {
        if(root==null)
            return;
        
        InOrder(root.left);
        System.out.print(root.data);
        InOrder(root.right);       
    }

    public void PostOrder()
    {
        PostOrder(root);
    }
    
    public static void PostOrder(TreeNode root)
    {
        if(root==null)
            return;
        
        PostOrder(root.left);
        System.out.print(root.data+" --> ");   
        PostOrder(root.right);
    }

    public static void main(String[] args) {
        
    
        BinaryTree a = new BinaryTree();

        a.insertBST(99);
        a.insertBST(55);
        a.insertBST(42);
        a.insertBST(91);
        a.insertBST(17);
        a.insertBST(85);

        a.InOrder();
        
        
    }
}
        
    
