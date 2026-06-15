public class ConstructorOverloading {

    String name;
    int age;

    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ConstructorOverloading(String name) {
        this.name = name;
    }

    ConstructorOverloading(int age) {
        this.age = age;
    }

    ConstructorOverloading() {
        this.name = "Unknown";
        this.age = 0;
    }

    public static void main(String[] args) {

        ConstructorOverloading s1 =
                new ConstructorOverloading("Amirah", 22);

        ConstructorOverloading s2 =
                new ConstructorOverloading("Amirah");

        ConstructorOverloading s3 =
                new ConstructorOverloading(22);

        ConstructorOverloading s4 =
                new ConstructorOverloading();

        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);
        System.out.println(s3.name + " " + s3.age);
        System.out.println(s4.name + " " + s4.age);
    }
}