public class controlflowexercise {
    public static void main(String[] args) {
        int switchValue = 5;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1.");
            case 2 -> System.out.println("Value was 2.");
            case 3, 4, 5, 6, 7, 8 -> {
                System.out.println("Value was 3, 4, 5, 6, 7 or 8.");
                System.out.println("Actually it was a " + switchValue + ".");
            }
            default -> System.out.println("Value was not 1, 2, 3, 4, 5, 6, 7 or 8.");
        }
    }
}
