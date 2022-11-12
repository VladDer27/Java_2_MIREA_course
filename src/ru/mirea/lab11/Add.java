package ru.mirea.lab11;

public class Add extends BinaryOperation implements IOperation {

    public Add(IOperation firstOperation, IOperation secondOperation) {
        super(firstOperation, secondOperation);
        value.operation = "+";
    }

    @Override
    public Value getValue() {
        return value;
    }
}
