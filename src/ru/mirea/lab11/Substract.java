package ru.mirea.lab11;

public class Substract extends BinaryOperation implements IOperation {

    public Substract(IOperation firstOperation, IOperation secondOperation) {
        super(firstOperation, secondOperation);
        value.operation = "-";
    }

    @Override
    public Value getValue() {
        return value;
    }
}