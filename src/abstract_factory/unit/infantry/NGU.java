package abstract_factory.unit.infantry;

import abstract_factory.interfaces.Infantry;

import java.util.Date;

public class NGU implements Infantry {
    @Override
    public void startAssault(Date date) {
        System.out.println("NGU started assault in the: " + date);
    }

    @Override
    public void finishAssault(Date date) {
        System.out.println("NGU finished assault in the: " + date);
    }
}
