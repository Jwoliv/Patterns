package strategy;

import strategy.worker.Worker;
import strategy.works.Programming;
import strategy.works.Refactoring;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.doWork(new Programming());
        System.out.println("-------------------------");
        worker.doWork(new Refactoring());
    }
}
