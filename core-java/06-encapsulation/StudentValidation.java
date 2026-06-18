public class StudentValidation {

    private int age;

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        StudentValidation student =
                new StudentValidation();

        student.setAge(-10);

        System.out.println("Age: " +
                student.getAge());
    }
}