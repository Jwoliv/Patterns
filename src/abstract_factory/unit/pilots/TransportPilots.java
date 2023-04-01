package abstract_factory.unit.pilots;

import abstract_factory.interfaces.Pilots;

import java.util.Date;

public class TransportPilots implements Pilots {
    @Override
    public void landOn(Date date) {
        System.out.println("Land on the transport pilots in the: " + date);
    }

    @Override
    public void takeOff(Date date) {
        System.out.println("Take off the transport pilots in the: " + date);
    }
}
