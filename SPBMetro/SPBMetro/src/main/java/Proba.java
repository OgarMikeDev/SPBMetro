import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import core.Line;
import core.Station;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Proba {

    private static String dataFile = "SPBMetro/src/main/resources/map.json";

    private static String getJsonFile() {

        StringBuilder builder = new StringBuilder();

        try {

            List<String> lines = Files.readAllLines(Paths.get(dataFile));

            lines.forEach(line -> builder.append(line));

        }

        catch (Exception ex) {

            ex.printStackTrace();

        }

        return builder.toString();

    }

//    static ArrayList<Station> routeForDuration;
    static Station station_1__1;

    static Station station_1__2;

    static Station station_1__3;


    static Station station_2;
    static Station station_3;
    public static void main(String[] args) {

//        routeForDuration = new ArrayList<>();

        Line line1 = new Line(1, "Кировско-Выборгская линия");
        Line line2 = new Line(2, "Московско-Петроградская линия");

        station_1__1 = new Station("Девяткино" , line1);

        station_1__2 = new Station("Гражданский проспект" , line1);

        station_1__3 = new Station("Академическая" , line1);


        station_2 = new Station("Выборгская", line1);

        station_3 = new Station("Парнас", line2);

        ArrayList arrayListRoute = new ArrayList<>();
        arrayListRoute.add(station_1__1);
        arrayListRoute.add(station_1__2);
        arrayListRoute.add(station_1__3);
//
//        routeForDuration.add(station);
//        routeForDuration.add(station_2);
//        routeForDuration.add(station_3);
//
//        for (Station route : routeForDuration) {
//            System.out.println(route);
//        }


        //Создание объекта класса RouteCalculator()
        StationIndex stationIndex = new StationIndex();
        RouteCalculator routeCalculator = new RouteCalculator(stationIndex);

        //Использование методов класса RouteCalculator()
        routeCalculator.getShortestRoute(station_1__1, station_1__3);

        //Вывод продолжительности маршрута
        System.out.println(calculateDuration(arrayListRoute));

//        System.out.println(routeForDuration);

//        Proba proba = new Proba();
//        proba.probaGetRouteOnTheLine();
    }

    //Расчёт продолжительности маршрута
    public static double calculateDuration(List<Station> route) {
        double duration = 0;
        Station previousStation = null;
        for(int i = 0; i < route.size(); i++) {
            Station station = route.get(i);
            if(i > 0) {
                duration += previousStation.getLine().equals(station.getLine()) ?
                        2.5 : 3.5;
            }
            previousStation = station;
        }
        return duration;
    }



//    List<Station> route;
//
//    Line line1 = new Line(1, "Первая");
//
//        public void probaGetRouteOnTheLine() {
//            route.add(new Station("Петровская", line1));
//            route.add(new Station("Арбузная", line1));
//            RouteCalculator directionDir = null;
//            System.out.println(directionDir.getShortestRoute(route.get(0), route.get(1)));
//        }

//        String one = "one";
//        String two = "two";
//        String five = "five";
//
//        int one_1 = 1;
//        int two_2 = 2;
//        int five_5 = 5;
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(5);
//
//        System.out.println(arrayList.get(1).compareTo(arrayList.get(0)));

//        switch (five) {
//            case 2:
//                System.out.println("True");
//                break;
//            case 1:
//                System.out.println("False_1");
//                break;
//            case 5:
//                System.out.println("False_2");
//                break;
//        }
}
