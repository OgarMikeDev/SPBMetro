import java.util.ArrayList;
import core.Line;
import core.Station;
import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Proba {

    static ArrayList<Station> routeForDuration;
    static Station station;
    static Station station_2;
    static Station station_3;
    public static void main(String[] args) {

        routeForDuration = new ArrayList<>();

        Line line1 = new Line(1, "OneLine");
        Line line2 = new Line(2, "TwoLine");

        station = new Station("milk" , line1);

        station_2 = new Station("eba", line1);

        station_3 = new Station("zaeba", line2);

        routeForDuration.add(station);
        routeForDuration.add(station_2);
        routeForDuration.add(station_3);

        for (Station route : routeForDuration) {
            System.out.println(route.getLine());
        }

//        System.out.println(routeForDuration);

//        Proba proba = new Proba();
//        proba.probaGetRouteOnTheLine();
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
