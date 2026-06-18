public class GetterSetterExample {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        GetterSetterExample student =
                new GetterSetterExample();

        student.setName("Amirah");
        student.setAge(21);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}