package pl.jlabs.ints;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Championship {
    private Map<MarathonRunner, Long> rawResults;

    public Championship(Map<MarathonRunner, Long> rawResults) {
        this.rawResults = rawResults;
    }

    public List<MarathonRunner> getResults() {
        //TODO add implementation
        return new ArrayList<>();
    }

    public Boolean isWinner(MarathonRunner winner) throws ResultNotFound {
        //TODO add implementation
        return null;
    }


    protected Map<MarathonRunner, Long> getRawResults() {
        return rawResults;
    }
}
