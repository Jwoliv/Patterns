package abstract_factory.unit.infantry;

import abstract_factory.interfaces.Infantry;

import java.util.Date;

public class SOF implements Infantry {
    @Override
    public void startAssault(Date date) {
        System.out.println("SOF started assault in the: " + date);
    }

    @Override
    public void finishAssault(Date date) {
        System.out.println("SOF finished assault in the: " + date);
    }
}
