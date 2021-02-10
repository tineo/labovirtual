package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker implements IOperation {

	List<IOperation> operations = new ArrayList<>();

	public void addOperations(IOperation operation) {
		this.operations.add(operation);
	}

	@Override
	public void save() {
		operations.forEach(operation -> operation.save());
		operations.clear();
	}
}
