package com.exercise.example;

public class TreeNode<E> {
	
    E element;
    TreeNode<E> left;
    TreeNode<E> right;
    
	public TreeNode(E e) {
		// TODO Auto-generated constructor stub
		this.element  = e;
	}
	
	//先序遍历
	protected void preorder(TreeNode<E> root) {
		if (root == null)
	        return;
		
		System.out.println(root.element + "  ");
		
		preorder(root.left);
		
		preorder(root.right);
	}
	
	//中序遍历
	protected void inorder(TreeNode<E> root) {

	    if (root == null)
	        return;

	    inorder(root.left);

	    System.out.println(root.element + " ");

	    inorder(root.right);
	}

	//后续遍历
	protected void postorder(TreeNode<E> root) {

	    if (root == null)
	        return;

	    postorder(root.left);

	    postorder(root.right);

	    System.out.println(root.element + " ");
	}

	
}
