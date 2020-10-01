package tree;
import java.util.Scanner;
class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data=data;
	}
}
public class CreateBinaryTree {

	static Scanner sc = null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		createTree();

	}
	static Node createTree() {
		Node root=null;
		System.out.println("enter the data");
		int data=sc.nextInt();
		if(data==-1)return null;
		root=new Node(data);
		System.out.println("enter the left child for "+data);
		root.left=createTree();
		System.out.println("enter the right child for "+data);
		root.right=createTree();
		return root;
	}

}
