package dev.lpa;

import java.util.*;

import static dev.lpa.ArraysCompare.compare_Arrays;
import static dev.lpa.EvenOddSummer.sum_Even_and_Odd;
import static dev.lpa.ListSearch.search_Through_List;
import static dev.lpa.ListReverse.reverse_a_List;
import static dev.lpa.ArrayListMerger.mergeArrays;
import static dev.lpa.PredicateArray.predicate_Arrays;

interface Player {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {}
record FootballPlayer(String name, String position) implements Player {}
record VolleyballPlayer(String name, String position) implements Player {}
record GolfPlayer(String name, String position) implements Player {}

public class Main {
    public static void main(String[] args) {
        int studentCount = 10;
        List<StudentExtra> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new StudentExtra());
        }
        students.add(new LPAStudent());
        printList(students);

        List<LPAStudent> LPAstudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            LPAstudents.add(new LPAStudent());
        }
        printList(LPAstudents);
    }

    public static void printList(List students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void genericsExercise10() {
        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==" : (val < 0) ? "<"  : ">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String s : fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), s, val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A"+(int)'A' + " " + "a:"+(int)'a');
        System.out.println("B"+(int)'B' + " " + "b:"+(int)'b');
        System.out.println("C"+(int)'C' + " " + "c:"+(int)'c');

        Student tim = new Student("Tim");
        Student [] students = {new Student("Zach"), new Student("Tim"), new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tim.compareTo(new Student("Mary")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }

    public static void genericsExercise9() {
        var nationalUSParks = new Park[] {
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park("Yosemite", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi",
                        "47.2160, -95.2348", "29.1566, -89.2495",
                        "35.1556, -90.0659"),
                new River("Missouri", "45.9239, -111.4983," +
                        "38.8146, -90.1218")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.renderLayer();
    }

    public static void genericsExercise8() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> predicativeIntegers = List.of(5, 10);

        PredicateArray.predicate_Arrays(integers, predicativeIntegers);

        List<String> texts = List.of("The world", "I love", "is lacking", "good in it", "my boyfriend", "Cedrick",
                "I will", "I might", "I am", "going to", "give up", "pause", "Sebastian?", "Sebastian", "is his human name");
        List<String> predicativeTexts = List.of("is his human name", "Cedrick", "Sebastian", "my boyfriend", "I love");
        predicate_Arrays(texts, predicativeTexts);
    }

    public static void genericsExercise7() {
        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(10, 11, 12, 13, 14, 15));

        ArrayListMerger.mergeArrays(arr1, arr2);

        ArrayList<String> message1 = new ArrayList<>(List.of("My", "boyfriend", "whom", "never", "Still", "my", "Sebastian."));
        ArrayList<String> message2 = new ArrayList<>(List.of("beloved", "Cedrick", "I will", "forget", "in", "memory"));

        mergeArrays(message1, message2);
        System.out.println("This information will never cease.");
    }

    public static void genericsExercise6() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        reverse_a_List(integers);

        List<String> theTruth = List.of("I love", "Cedrick", "My beloved", "Dragon Boyfriend");
        reverse_a_List(theTruth);
    }

    public static void genericsExercise5() {
        List<String> strings = List.of("Etharil", "Ked", "Mem Mi Mem", "Szatko");
        List<Integer> integers = List.of(1, 3, 4, 5, 12, 69, 2137, 420, 1337);

        search_Through_List(strings, "Ked");
        search_Through_List(strings, "Sprytny Inicjator");
        search_Through_List(integers, 2137);
        search_Through_List(integers, 421);
    }

    public static void genericsExercise4() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Double> doubles = List.of(2.0, 1.5, 4.2, 2.1);

        sum_Even_and_Odd(integers);
        sum_Even_and_Odd(doubles);
    }

    public static void genericsExercise3() {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {1, 2, 3, 4};
        Integer[] arr3 = {3, 2, 1, 4, 5};
        Integer[] arr4 = {5, 2, 3, 1, 6};
        String[] arr5 = {"JavaScript", "World"};
        String[] arr6 = {"JavaScript", "World"};

        System.out.println("Original arrays:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr4: " + Arrays.toString(arr4));
        System.out.println("arr5: " + Arrays.toString(arr5));
        System.out.println("arr6: " + Arrays.toString(arr6));

        System.out.println("\nCompare arr1 and arr2: " + compare_Arrays(arr1, arr2));
        System.out.println("Compare arr1 and arr3: " + compare_Arrays(arr1, arr3));
        System.out.println("Compare arr4 and arr5: " + compare_Arrays(arr4, arr5));
        System.out.println("Compare arr5 and arr6: " + compare_Arrays(arr5, arr6));
    }

    public static void genericsExercise2() {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Residency", UsageType.RESIDENTAL));
        mappables.add(new Building("Sydney Opera House", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvd", UtilityType.ELECTRICAL));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }

    public static void genericsExercise1() {
        var philly = new Affiliation("city", "Philadelphia, PA", "US");

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        Team<BaseballPlayer, Affiliation> phillies2 = new Team<>("Philadelphia Phillies", philly);
        Team<BaseballPlayer, Affiliation> astros2 = new Team<>("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        SportsTeam phillies = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros = new SportsTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies2.addTeamMember(harper);
        phillies2.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies2.addTeamMember(guthrie);
        phillies2.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, Affiliation> afc = new Team<>("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("H Harvey", "Fielder"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);

        Team<GolfPlayer, Affiliation> melbourneVB = new Team<>("Melbourne Vipers");
        melbourneVB.addTeamMember(new GolfPlayer("R Robertson", "Golf Position"));
        melbourneVB.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score,
                                   SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}

class StudentGPAComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}

class Student implements Comparable<Student> {
    String name;
    private static int LAST_ID = 1000;
    static Random random = new Random();
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
