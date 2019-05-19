package Application;

import Tree.BinaryTree;

public class Main {
	public static void main(String[] args) {
		System.out.println("Right view of a binary tree");
		System.out.println("---------------------------");
		try {
			BinaryTree binaryTree = InputProcessor.GetBinaryTreeFromInput();
			System.out.println("Inorder traversal of the constructed tree");
			binaryTree.PrintInorderTraversal(binaryTree.GetBinaryTreeRoot());
			System.out.println("Right view of the binary tree is----");
			binaryTree.PrintRightView(binaryTree.GetBinaryTreeRoot());
		}catch(Exception exception) {
			System.out.println("Main: Thrown exception is "+exception.getMessage());
		}
	}
}
