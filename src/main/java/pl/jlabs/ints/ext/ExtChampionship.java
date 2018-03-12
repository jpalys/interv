package pl.jlabs.ints.ext;

import pl.jlabs.ints.Championship;
import pl.jlabs.ints.MarathonRunner;
import pl.jlabs.ints.ResultNotFound;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExtChampionship extends Championship {

    public ExtChampionship(Map<MarathonRunner, Long> rawResults) {
        super(rawResults);
    }

    @Override
    public List<MarathonRunner> getResults() {
        return getRawResults().entrySet().stream()
                .sorted(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    @Override
    public Boolean isWinner(MarathonRunner winner) throws ResultNotFound {
        OptionalInt indexOpt = IntStream.range(0, getResults().size())
                .filter(i -> winner.equals(getResults().get(i)))
                .findFirst();
        return indexOpt.orElseThrow(ResultNotFound::new) == 0;
    }

}
