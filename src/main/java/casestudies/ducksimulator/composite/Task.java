package casestudies.ducksimulator.composite;

import java.util.function.Consumer;

public interface Task <T> {
	void accept(Consumer<T> task);
}
