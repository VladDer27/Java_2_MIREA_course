package ru.mirea.lab11;

import ru.mirea.lab11.Value.ValueType;

public class Const implements IOperation {

    private float n;

    public Const(float n) {
        this.n = n;
    }

    @Override
    public Value getValue() {
        return new Value(n, ValueType.CONST);
    }
}