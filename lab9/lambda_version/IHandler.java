package chain_of_responsibility;

import java.util.function.Function;

public interface IHandler {
	public Function<Handler, Void> setSuccessor();
	public Function<String, Void> handleReq();
}
