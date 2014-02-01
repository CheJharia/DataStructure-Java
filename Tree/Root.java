/**
 * @author	 afiqjohari
 * @create   01/02/2014
 * @update   01/02/2014 
 * 
 * Tree structure that store String objects
 * and each tree node may contain at most 10 other nodes
 */

package stringTree;

public class Root extends Node {

	public Root(String name) {
		super(name);
	}

	public void add(Node... nodes) {
		super.add(nodes);
	}

	public void depth_first(int level) {
		System.out.println(this.name);
		super.depth_first(level);
	}

	public static void main(String[] args) {

		// Initialisation of tree
		Node b = new Node("b");
		Node e = new Node("e");
		Node c = new Node("c");
		Node d = new Node("d");
		Node f = new Node("f");
		Node g = new Node("g");
		Root root = new Root("a");
		root.add(b, e);
		b.add(c, d);
		e.add(f, g);

		// depth_first
		root.depth_first(root.depthLevel);

	}

}
