import java.util.HashMap;

/**
 * Handles the input of commands for the document.
 */
public class InputHandler {
	/**
	 * HashMap to hold the inputs to match to commands.
	 * [String -> Command]:
	 * "load" -> SpellCommand
	 * "save" -> SaveCommand
	 * "spell" -> SpellCommand
	 * "print" -> PrintCommand
	 */
	private HashMap<String, Command> commands;
	
	/**
	 * Constructs the InputHandler.
	 * @param doc	The Document the commands should be executed onto.
	 */
	public InputHandler(Document doc) {
		commands = new HashMap<String, Command>();
		
		//Sets each String key to a Command value.
		commands.put("load", new LoadCommand(doc));
		commands.put("save", new SaveCommand(doc));
		commands.put("spell", new SpellCommand(doc));
		commands.put("print", new PrintCommand(doc));
	}
	
	/**
	 * Checks if the input entered is a key, and if so executes the corresponding command.
	 * @param data	The command typed into the console.
	 */
	public void inputEntered(String data) {
		//Checks if the entered input is a command.
		if(commands.containsKey(data)) {
			commands.get(data).execute();
		} else {
			System.out.println("Invalid Command!\n");
		}
	}
}
