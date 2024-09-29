package di;

/**
 * Ukazka constructor injection a problemu s pretizenim
 * @author Tomas Kozel
 */
public class Item {
	private String name;
	private int value;

	public Item() {
	}

	public Item(String name) {
		this.name = name;
		value = 0;
	}

	public Item(int value) {
		name = "Unknown";
		this.value = value;
	}

	public Item(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Item (name=%s, value=%d)", name,value);
	}
}
