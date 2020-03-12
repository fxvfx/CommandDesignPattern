/**
 * Creates an object that can print a Document
 * @author Michael Norton (CSCE 247-001)
 *
 */
public class PrintCommand implements Command {

	private Document doc;
	
	public PrintCommand(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.print();

	}

}
