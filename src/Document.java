/**
 * An object to simulate a Document in a Document Editor
 * @author Michael Norton (CSCE 247-001)
 *
 */
public class Document {

	private String name;
	
	public Document(String name) {
		this.name = name;
		System.out.println("Document named " + name + " is created");
	}

	/**
	 * Loads the document into the editor
	 */
	public void load() {
		System.out.println("document " + name + " is loaded into view");
	}
	
	/**
	 * Checks the document for spelling
	 */
	public void spell() {
		System.out.println("document " + " is being checked for spelling errors");
	}
	
	/**
	 * Saves the document from the editor
	 */
	public void save() {
		System.out.println("document " + name + "is being saved");
	}
	
	/**
	 * Sends the document to the printer
	 */
	public void print() {
		System.out.println("document " + name + " is printing");
	}
}
