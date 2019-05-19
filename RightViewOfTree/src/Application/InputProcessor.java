package Application;

import Tree.BinaryTree;
import Tree.BinaryTreeNode;

import java.util.Scanner;

public class InputProcessor {

	public static BinaryTree GetBinaryTreeFromInput() {
		BinaryTree binaryTree = new BinaryTree(null);
		
		System.out.println("Enter the number of elements to be inserted in the tree");
		try {
			Scanner scanner = new Scanner(System.in);
			int sizeOfTree = scanner.nextInt();
			for(int index = 0; index < sizeOfTree; index++) {
				System.out.println("Enter the element "+(index+1)+":");
				binaryTree.SetBinaryTreeNodeRoot(
						binaryTree.Insert(binaryTree.GetBinaryTreeRoot(), scanner.nextInt()));
			}
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getLocalizedMessage());
		}		
		return binaryTree;
	}
}
