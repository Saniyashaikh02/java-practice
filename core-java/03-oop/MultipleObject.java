public class MultipleObject {
    String name;
    MultipleObject(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        MultipleObject obj1 = new MultipleObject("Amirah");
        MultipleObject obj2 = new MultipleObject("Saniya");
        MultipleObject obj3 = new MultipleObject(" Sana");
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj3.name);
    }
}
