package abstract_factory;

import abstract_factory.group.AttackGroup;
import abstract_factory.group.TransportGroup;
import abstract_factory.interfaces.Group;
import abstract_factory.interfaces.Infantry;
import abstract_factory.interfaces.Pilots;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        startDoWork(new AttackGroup());
        startDoWork(new TransportGroup());
        System.out.println("\n");
        stopDoWork(new AttackGroup());
        stopDoWork(new TransportGroup());
    }
    public static void startDoWork(Group group) {
        Infantry infantry = group.getInfantry();
        Pilots pilots = group.getPilots();
        Date currentDate = new Date();
        infantry.startAssault(currentDate);
        pilots.landOn(currentDate);
        System.out.println("---------------------------");
    }
    public static void stopDoWork(Group group) {
        Infantry infantry = group.getInfantry();
        Pilots pilots = group.getPilots();
        Date currentDate = new Date();
        infantry.finishAssault(currentDate);
        pilots.takeOff(currentDate);
        System.out.println("---------------------------");
    }
}
