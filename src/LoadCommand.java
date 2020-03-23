/**
 * Creates an object that loads the document.
 * @author Tariq Scott
 *	@param doc
 *	@return 
 */
public class LoadCommand implements Command {
	private Document doc;
	
	public LoadCommand(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.load();
	}

}
