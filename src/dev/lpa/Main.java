package dev.lpa;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static dev.lpa.ArraysCompare.compare_Arrays;
import static dev.lpa.EvenOddSummer.sum_Even_and_Odd;

interface Player {
    String name();
}

record BaseballPlayer(String name, String position) implements Player {}
record FootballPlayer(String name, String position) implements Player {}
record VolleyballPlayer(String name, String position) implements Player {}
record GolfPlayer(String name, String position) implements Player {}

public class Main {
    public static void main(String[] args) {

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
