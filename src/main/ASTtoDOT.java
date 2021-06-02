package main;

import org.eclipse.jdt.core.dom.ASTNode;

import structure.MyASTNode;
import structure.MyMethodNode;

public class ASTtoDOT {

	/**
	 * Convert a method node to .dot string
	 * @param m
	 * @return
	 */
	public static String ASTtoDotParser(MyMethodNode m) {
		String str = "digraph \"DirectedGraph\" {\n";
		// name
		str += ("graph [label = \"" + m.methodNode.getName() + "\", labelloc=t, concentrate = true];\n");
		for (MyASTNode mn : m.nodeList) {
			ASTNode astNode = mn.astNode;
			int hashcode = astNode.hashCode();
			int nodeType = astNode.getNodeType();
			str += ("\"" + String.valueOf(hashcode) + "\" [ label=<"+buildLabel(mn)+"> type=" + String.valueOf(nodeType) + " startLineNumber="
					+ String.valueOf(mn.startLineNum)+" endLineNumber="
							+ String.valueOf(mn.endLineNum) + " ]\n");
		}
		for (int[] k : m.mapping) {
			int pHashcode = k[0];
			int hashcode = k[1];
			str += ("\"" + String.valueOf(pHashcode) + "\" -> \"" + String.valueOf(hashcode) + "\"\n");
		}
		str += "}\n";
		return str;
	}
	
	/**
	 * Configure the label, i.e., what you want to display in the visulization
	 * @param node
	 * @return
	 */
	public static String buildLabel(MyASTNode node) {
		String contentString=node.astNode.toString().replace("\n", " ").replace("\"", "\\\"").replace("  ", " ");
		String nodeType=ASTNode.nodeClassForType(node.astNode.getNodeType()).getName().replace("org.eclipse.jdt.core.dom.", "");

		nodeType = nodeType.replaceAll("(?<!^)([A-Z])", "<br/>$1");

		if(nodeType.toLowerCase().contains("name")) {
			nodeType = "<font color=\"blue\">"+nodeType+"</font>";
		}
		else if(nodeType.toLowerCase().contains("literal")) {
			nodeType = "<font color=\"red\">"+nodeType+"</font>";
		}

		return "<b>"+nodeType+"</b><br/>"+(contentString.length()>15 ? contentString.substring(0,15)+" ... "+contentString.substring(contentString.length()-2) : contentString);

	}
}
