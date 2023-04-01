package abstract_factory.group;

import abstract_factory.interfaces.Group;
import abstract_factory.interfaces.Infantry;
import abstract_factory.interfaces.Pilots;
import abstract_factory.unit.infantry.NGU;
import abstract_factory.unit.pilots.TransportPilots;

public class TransportGroup implements Group {
    @Override
    public Infantry getInfantry() {
        return new NGU();
    }

    @Override
    public Pilots getPilots() {
        return new TransportPilots();
    }
}
