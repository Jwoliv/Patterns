package abstract_factory.group;

import abstract_factory.interfaces.Group;
import abstract_factory.interfaces.Infantry;
import abstract_factory.interfaces.Pilots;
import abstract_factory.unit.infantry.SOF;
import abstract_factory.unit.pilots.AttackPilots;

public class AttackGroup implements Group {
    @Override
    public Infantry getInfantry() {
        return new SOF();
    }

    @Override
    public Pilots getPilots() {
        return new AttackPilots();
    }
}
