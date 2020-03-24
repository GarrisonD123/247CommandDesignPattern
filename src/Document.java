/**
 * Document Class
 * Sets the name of the document and executes commands
 * @author Team Leaking Memory
 * @author Warren Beagle, Garrison Davis, Nicholas Mims, Terric Taylor
 */
public class Document {
	
	/**
	 * Private instance of the document name to be accessed throughout the class
	 */
	private String name;

	/**
	 * Constructor
	 * Prints a statement that the document is created
	 * @param name of the document
	 */
	public Document(String name) {
		this.name = name;
		System.out.println("Document named " + name + " is created");
	}
	
	/**
	 * Load method
	 * Prints a statement that the document is loaded
	 */
	public void load() {
		System.out.println("document " + name + " is loaded into view");
	}
	
	/**
	 * Save method
	 * Prints a statement that the document is saved
	 */
	public void save() {
		System.out.println("document " + name + " is being saved...");
	}
	
	/**
	 * SpellCheck method
	 * Prints a statement that the document is being spell checked
	 */
	public void spellCheck() {
		System.out.println("document " + name + " is being checked for spelling errors");
	}

	/**
	 * Print method
	 * Prints a statement that the document is being printed
	 */
	public void print() {
		System.out.println("document " + name + " is printing...");
	}
	
}
		
