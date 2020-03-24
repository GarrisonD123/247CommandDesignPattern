
public class SpellCommand implements Command {
	
	private Document doc;
	
	public SpellCommand(Document doc) {
		this.doc = doc;
	}
	
	public void execute() {
		doc.spellCheck();
	}
	
}
