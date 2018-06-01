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
			switch (currentNode.type_) {
			case Node.NODE:
				buf.append("Node ");
				buf.append(currentNode.name_);
				buf.append(" [Node]");
				break;
			case Node.WORKSTATION:
				buf.append("Workstation ");
				buf.append(currentNode.name_);
				buf.append(" [Workstation]");
				break;
			case Node.PRINTER:
				buf.append("Printer ");
				buf.append(currentNode.name_);
				buf.append(" [Printer]");
				break;
			default:
				buf.append("(Unexpected)");
				;
				break;
			}
			;
			
			buf.append(v1);
			currentNode = currentNode.nextNode_;
		} while (currentNode != this);
		buf.append(v2);
	}

	public void printHTMLOn(Network network, StringBuffer buf, Node currentNode) {
		do {
			buf.append("\n\t<LI> ");
			switch (currentNode.type_) {
			case Node.NODE:
				buf.append("Node ");
				buf.append(currentNode.name_);
				buf.append(" [Node]");
				break;
			case Node.WORKSTATION:
				buf.append("Workstation ");
				buf.append(currentNode.name_);
				buf.append(" [Workstation]");
				break;
			case Node.PRINTER:
				buf.append("Printer ");
				buf.append(currentNode.name_);
				buf.append(" [Printer]");
				break;
			default:
				buf.append("(Unexpected)");
				;
				break;
			}
			;
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
			switch (currentNode.type_) {
			case Node.NODE:
				buf.append("<node>");
				buf.append(currentNode.name_);
				buf.append("</node>");
				break;
			case Node.WORKSTATION:
				buf.append("<workstation>");
				buf.append(currentNode.name_);
				buf.append("</workstation>");
				break;
			case Node.PRINTER:
				buf.append("<printer>");
				buf.append(currentNode.name_);
				buf.append("</printer>");
				break;
			default:
				buf.append("<unknown></unknown>");
				;
				break;
			}
			;
			currentNode = currentNode.nextNode_;
		} while (currentNode != this);
		buf.append("\n</network>");
	}

}
