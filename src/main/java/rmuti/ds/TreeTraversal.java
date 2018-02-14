package rmuti.ds;



public class TreeTraversal {
	public void pre0rder(Node r, Visitor v) {
		if (r == null) {
			return;
		}
		in0rder(r.left, v);
		v.visit(r.getValue());
		in0rder(r.right, v);
	}
	public void in0rder(Node r, Visitor v) {
		if (r == null) {
			return;
		}
		in0rder(r.left, v);
		v.visit(r.getValue());
		in0rder(r.right, v);
	}
	public void post0rder(Node r, Visitor v) {
		if (r == null) {
			return;
		}
		post0rder(r.left, v);
		post0rder(r.right, v);
		v.visit(r.getValue());
		}
}
