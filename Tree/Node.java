/**
 * @author 	afiqjohari
 * @create   01/02/2014
 * @update   01/02/2014 
 * 
 * Tree structure that store String objects
 * and each tree node may contain at most 10 other nodes
 */

public class Node {
	protected String name;
	protected int numberOfNodes = 0; // nodes counter
	protected Node[] nodes = new Node[10]; // one node can only contain at most
											// 10 nodes by default
	protected int depthLevel = 0;

	public Node(String name) {
		this.name = name;
	}

	public void add(Node... nodes) {
		for (Node node : nodes) {
			this.nodes[this.numberOfNodes] = node;
			numberOfNodes++;
		}
	}

	public String getName() {
		return this.name;
	}

	public void depth_first(int level) {
		level++;
		for (int i = 0; i < this.numberOfNodes; i++) { // loop over node array
			for (int j = 0; j < level; j++) { // print blank spaces to indicate
												// depth level
				System.out.print(" ");
			}
			System.out.println(this.nodes[i].getName());
			this.nodes[i].depthLevel = level;
			if (this.nodes[i].numberOfNodes > 0) {
				this.nodes[i].depth_first(this.nodes[i].depthLevel);
			}

		}
	}
}
