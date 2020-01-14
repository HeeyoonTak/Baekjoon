package baekjoon1991;

//Ʈ����ȸ

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	class Node {
		char data;
		Node left, right;

		public Node(char data) {
			super();
			this.data = data;
		}
	}

	class Tree {
		Node root;

		public void add(char data, char leftData, char rightData) {
			if (root == null) {
				if (data != '.') {
					root = new Node(data);
				}
				if (leftData != '.') {
					root.left = new Node(leftData);
				}
				if (rightData != '.') {
					root.right = new Node(rightData);
				}
			} else
				search(root, data, leftData, rightData);
		}

		private void search(Node root, char data, char leftData, char rightData) {
			if (root == null) {
				return;
			} else if (root.data == data) {
				if (leftData != '.') {
					root.left = new Node(leftData);
				}
				if (leftData != '.') {
					root.right = new Node(rightData);
				}
			} else {
				search(root.left, data, leftData, rightData);
				search(root.right, data, leftData, rightData);
			}
		}

		public void preorder(Node root) {
			System.out.println(root.data);
			if (root.left != null) {
				preorder(root.left);
			}
			if (root.right != null) {
				preorder(root.right);
			}
		}

		public void inorder(Node root) {
			if (root.left != null) {
				inorder(root.left);
			}
			System.out.println(root.data);
			if (root.right != null) {
				inorder(root.right);
			}
		}

		public void postorder(Node root) {
			if (root.left != null) {
				postorder(root.left);
			}
			if (root.right != null) {
				postorder(root.right);
			}
			System.out.println(root.data);
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

	}

}
