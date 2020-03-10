import java.util.HashMap;

/**
 * Handles inputs for a Document Editor program
 * 
 * @author Francis Villanueva
 *
 */
public class InputHandler {
	private HashMap<String,Command> commands;
	
	public InputHandler(Document document) {
		commands = new HashMap<>();
		
		// Initialize individual commands & insert them into the commands HashMap
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SpellCommand(document));
		commands.put("spell", new SaveCommand(document));
		commands.put("print", new PrintCommand(document));
	}
	
	/**
	 * Validates/runs the user's command key input
	 * @param data: string key to the commands HashMap
	 */
	public void inputEntered(String data) {
		if(commands.containsKey(data)) //does not deal with case sensitivity
			commands.get(data);
		else
			System.out.println("Sorry, we don't recognize that command");
	}
}
