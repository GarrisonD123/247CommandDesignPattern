/**
 * SpellCommand class which implements Command
 * Executes the spell command on an input document
 * @author Team Leaking Memory
 * @author Warren Beagle, Garrison Davis, Nicholas Mims, Terric Taylor
 */
public class SpellCommand implements Command {
	
	/**
	 * Private instance of the document to be accessed in the class
	 */
	private Document doc;
	
	/**
	 * Constructor 
	 * @param doc which is set to this doc
	 */
	public SpellCommand(Document doc) {
		this.doc = doc;
	}
	
	/**
	 * Execute command that overrides the parent execute method
	 * Executes spellCheck
	 */
	@Override
	public void execute() {
		doc.spellCheck();
	}
	
}
