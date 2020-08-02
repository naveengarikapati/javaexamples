package generics;

public class Storage<T> {

	private T element;

	void add(T element) {
		this.element = element;
	}

	T getElement() {
		return element;
	}
}
