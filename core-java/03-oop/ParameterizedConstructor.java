public class ParameterizedConstructor{

    String name;
    int age;

    ParameterizedConstructor(String n, int a){

        name = n;
        age = a;
    }

    public static void main(String[] args) {

        
        ParameterizedConstructor s1 = new ParameterizedConstructor("Amirah", 22);

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}