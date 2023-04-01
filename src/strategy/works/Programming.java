package strategy.works;

import strategy.worker.IWork;

public class Programming implements IWork {
    @Override
    public void startDo() {
        System.out.println("Start programming");
    }

    @Override
    public void finishDo() {
        System.out.println("Finish programming");
    }
}
