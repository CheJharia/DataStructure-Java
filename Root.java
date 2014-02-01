/**
 * @author	 afiqjohari
 * @create   01/02/2014
 * @update   01/02/2014 
 * 
 * Tree structure that store String objects
 * and each tree node may contain at most 10 other nodes
 */

package stringTree;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class Root extends Node{

	public Root(String name) {
		super(name);
	}
	
	public void add(Node node) {
		super.add(node);
	}

	public void depth_first(int level) {
		System.out.println(this.name);
		super.depth_first(level);
	}
	
	public static void main(String[] args) {
		
//		Initialisation of tree
//		Node b = new Node("b");
//		Node e = new Node("e");
//		Node c = new Node("c");
//		Node d = new Node("d");
//		Node f = new Node("f");
//		Node g = new Node("g");
//		Root root = new Root("a");
//		root.add(b);
//		root.add(e);
//		b.add(c);
//		b.add(d);
//		e.add(f);
//		e.add(g);
		Root root = new Root("a");
		Node b = new Node("b");
		Node c = new Node("b");
		Node d = new Node("b");
		Node e = new Node("b");
		root.add(b);
		root.add(c);
		root.add(d);
		root.add(e);
		
		Node f = new Node("c");
		Node g = new Node("c");
		Node h = new Node("c");
		Node i = new Node("c");
		b.add(f);
		b.add(g);
		b.add(h);
		b.add(i);
		
		Node j = new Node("d");
		Node k = new Node("d");
		Node l = new Node("d");
		Node m = new Node("d");
		c.add(j);
		c.add(k);
		c.add(l);
		c.add(m);
		
		Node n = new Node("e");
		Node o = new Node("e");
		Node p = new Node("e");
		Node q = new Node("e");
		d.add(n);
		d.add(o);
		d.add(p);
		d.add(q);
		
		Node r = new Node("f");
		Node s = new Node("f");
		Node t = new Node("f");
		Node u = new Node("f");
		e.add(r);
		e.add(s);
		e.add(t);
		e.add(u);

		

//		depth_first 
		root.depth_first(root.depthLevel);
		
		
	}

}
