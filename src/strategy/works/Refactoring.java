package strategy.works;

import strategy.worker.IWork;

public class Refactoring implements IWork {
    @Override
    public void startDo() {
        System.out.println("Start refactoring");
    }

    @Override
    public void finishDo() {
        System.out.println("Finish refactoring");
    }
}
