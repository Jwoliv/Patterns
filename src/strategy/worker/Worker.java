package strategy.worker;

public class Worker {
    public void doWork(IWork work) {
        work.startDo();
        System.out.println("Processing...");
        work.finishDo();
    }
}
