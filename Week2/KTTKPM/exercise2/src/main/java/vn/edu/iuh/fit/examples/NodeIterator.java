package vn.edu.iuh.fit.examples;

import com.github.javaparser.ast.Node;
/**
 * @author Thien Dat
 * @crated-date 27/1/024
 *
 */
public class NodeIterator {
	public interface NodeHandler {
		boolean handle(Node node);
	}

	private NodeHandler nodeHandler;

	public NodeIterator(NodeHandler nodeHandler) {
		this.nodeHandler = nodeHandler;
	}

	public void explore(Node node) {
		//Hello
		if (nodeHandler.handle(node)) {
			for (Node child : node.getChildNodes()) {
				explore(child);
			}
		}
	}
}