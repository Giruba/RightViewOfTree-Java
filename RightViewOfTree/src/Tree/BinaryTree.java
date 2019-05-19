package Tree;

public class BinaryTree {
	private BinaryTreeNode root;
	
	public BinaryTree(BinaryTreeNode binaryTreeNode) {
		this.root = binaryTreeNode;
	}
	
	public void SetBinaryTreeNodeRoot(BinaryTreeNode binaryTreeNode) {
		this.root = binaryTreeNode;
	}
	
	public BinaryTreeNode GetBinaryTreeRoot() {
		return root;
	}
	
	public BinaryTreeNode Insert(BinaryTreeNode binaryTreeNode, int data) {
		
		if(binaryTreeNode == null) {
			binaryTreeNode = new BinaryTreeNode(data);
			return binaryTreeNode;
		}
		
		if(binaryTreeNode.GetBinaryTreeNodeData() < data) {
			binaryTreeNode.SetBinaryTreeNodeRight(
					Insert(binaryTreeNode.GetBinaryTreeNodeRight(), data));
		}else {
			binaryTreeNode.SetBinaryTreeNodeLeft(
					Insert(binaryTreeNode.GetBinaryTreeNodeLeft(), data));
		}
		
		return binaryTreeNode;
	}
	
	public void PrintInorderTraversal(BinaryTreeNode binaryTreeNode) {
		if(binaryTreeNode == null) {
			return;
		}
		PrintInorderTraversal(binaryTreeNode.GetBinaryTreeNodeLeft());
		System.out.println(binaryTreeNode.GetBinaryTreeNodeData()+" ");
		PrintInorderTraversal(binaryTreeNode.GetBinaryTreeNodeRight());
	}
	
	public void PrintRightView(BinaryTreeNode binaryTreeNode) {
		PersistingLevel maxLevel = new PersistingLevel(0);
		_PrintRightView(binaryTreeNode, 1, maxLevel);
	}
	
	private void _PrintRightView(BinaryTreeNode binaryTreeNode, int currentLevel, PersistingLevel persistingLevel) {
		if(binaryTreeNode == null) {
			return;
		}
		
		if(currentLevel > persistingLevel.GetPersistingLevel()) {
			System.out.println(binaryTreeNode.GetBinaryTreeNodeData());
			persistingLevel.SetPersistingLevel(currentLevel);;
		}
		_PrintRightView(binaryTreeNode.GetBinaryTreeNodeRight(), currentLevel+1, persistingLevel);
		_PrintRightView(binaryTreeNode.GetBinaryTreeNodeLeft(), currentLevel+1, persistingLevel);
	}
}
