package lanSimulation.internals;

import lanSimulation.Network;

public class Printer extends Node {

	public Printer(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
		// TODO Apéndice de constructor generado automáticamente
	}
	
	public Printer (byte type, String name){
		super(type, name);
	}

	public void printON(Network network, StringBuffer buf, Node currentNode, String v1, String v2) {
		do {
				buf.append("Printer ");
				buf.append(currentNode.name_);
				buf.append(" [Printer]");
			buf.append(v1);
			currentNode = currentNode.nextNode_;
		} while (currentNode != this);
		buf.append(v2);
	}

	public void printHTMLOn(Network network, StringBuffer buf, Node currentNode) {
		do {
			buf.append("\n\t<LI> ");
				buf.append("Printer ");
				buf.append(currentNode.name_);
				buf.append(" [Printer]");
			String v1 = (" </LI>");
	
			buf.append(v1);
			currentNode = currentNode.nextNode_;
		} while (currentNode != this);
		String v1 = ("\n\t<LI>...</LI>\n</UL>\n\n</BODY>\n</HTML>\n");
		buf.append(v1);
	}

	public void printXMLOn(Network network, StringBuffer buf, Node currentNode) {
		do {
			buf.append("\n\t");
				buf.append("<printer>");
				buf.append(currentNode.name_);
				buf.append("</printer>");
			currentNode = currentNode.nextNode_;
		} while (currentNode != this);
		buf.append("\n</network>");
	}

}
