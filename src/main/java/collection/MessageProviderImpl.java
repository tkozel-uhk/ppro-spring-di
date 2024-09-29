package collection;

import java.util.List;

/**
 * Kolekce zprav
 * Ukazka prace s kolekcemi.
 * @author Tomas Kozel
 *
 */
public class MessageProviderImpl implements MessageProvider {
	List<String> messages;

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	@Override
	public void printAllMessages() {
		for (String msg : messages) {
			System.out.println(msg);
		}
	}
	
}
