import java.util.HashMap;

public class InputHandler {
	
	private HashMap<String, Command> commands;
	
	public InputHandler(Document doc) {
		
		commands = new HashMap<String, Command>();
		commands.put("load", new LoadCommand(doc));
		commands.put("save", new SaveCommand(doc));
		commands.put("spell", new SpellCommand(doc));
		commands.put("print", new PrintCommand(doc));
	}
	
	public void inputEntered(String data) {
		if(commands.containsKey(data)) {
			commands.get(data).execute();
		} else {
			System.out.println("Invalid Command!\n");
		}
	}
}
