/**
 * Saves a document
 * @author Francis Villanueva
 * edited by Hannah Killian 03.24.2020
 *
 */
public class SaveCommand implements Command {
	private Document doc;

	public SaveCommand(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.save();

	}
}
