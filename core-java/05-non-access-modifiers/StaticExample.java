public class StaticExample {

    static String school = "ABC School";

    String studentName;

    public StaticExample(String studentName) {
        this.studentName = studentName;
    }

    public static void main(String[] args) {

        StaticExample s1 = new StaticExample("Varad");
        StaticExample s2 = new StaticExample("Saniya");

        System.out.println(s1.studentName + " - " + school);
        System.out.println(s2.studentName + " - " + school);
    }
}