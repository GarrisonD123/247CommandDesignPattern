/**
 * PrintCommand class which implements Command
 * Executes the print command on an input document
 * @author Team Leaking Memory
 * @author Warren Beagle, Garrison Davis, Nicholas Mims, Terric Taylor
 */
public class PrintCommand implements Command{
	
	/**
	 * Private instance of the document to be accessed in the class
	 */
	private Document doc;
	
	/**
	 * Constructor 
	 * @param doc which is set to this doc
	 */
	public PrintCommand(Document doc) {
		this.doc = doc;
	}
	
	/**
	 * Execute command that overrides the parent execute method
	 * Executes print
	 */
	@Override
	public void execute() {
		doc.print();
	}
	
}
