package pl.jlabs.ints;

import pl.jlabs.ints.MarathonRunner;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {
    public static Map<MarathonRunner, Long> manuallyCreatedRawResults() {
        Map<MarathonRunner, Long> results = new HashMap<>();
        results.put(new MarathonRunner("Mick", "Jagger", 123), 648345L);
        results.put(new MarathonRunner("Jack", "White", 221), 622145L);
        results.put(new MarathonRunner("Mike", "Patton", 231), 582145L);
        results.put(new MarathonRunner("Igy", "Pop", 433), 602145L);
        results.put(new MarathonRunner("Johny", "Cash", 564), 722145L);
        results.put(new MarathonRunner("Jack", "While", 221), 622145L);
        return results;
    }
}
