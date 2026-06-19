public class EnumInsideClass {

    enum Level {

        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        Level level = Level.HIGH;

        System.out.println(level);
    }
}