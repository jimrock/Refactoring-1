package com.refactor.bootcamp.switch_statement.example_2.refactored;

public class StrategyFrontendEngineer extends StrategyEngineer {

    @Override
    public double getBillableAmount(double unit) {
        double base = unit * 0.7;
        double tax = base * 0.1;
        return base + tax;
    }
}
