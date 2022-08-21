import core.Line;
import core.Station;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {

    List<Station> routeForDuration;
    StationIndex stationIndex = new StationIndex();
    RouteCalculator calculator = new RouteCalculator(stationIndex);
    @Override
    protected void setUp() throws Exception {

        routeForDuration = new ArrayList<>();

        Line line1 = new Line(1, "One");
        Line line2 = new Line(2, "Two");

        routeForDuration.add(new Station("Петровская", line1));
        routeForDuration.add(new Station("Арбузная", line1));
        routeForDuration.add(new Station("Морковная", line2));
        routeForDuration.add(new Station("Яблочная", line2));

    }


    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(routeForDuration);
        double expected = 8.5;
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine() throws Exception {
        List <Station> actual = List.of(
                stationIndex.getStation("station_1.1"),
                stationIndex.getStation("station_1.2"),
                stationIndex.getStation("station_1.3"),
                stationIndex.getStation("station_1.4")
        );

        List <Station> expected = calculator.getShortestRoute(stationIndex.getStation("station_1.1")
        ,stationIndex.getStation("station_1.4"));

        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
