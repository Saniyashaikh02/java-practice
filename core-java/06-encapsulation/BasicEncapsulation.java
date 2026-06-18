public class BasicEncapsulation {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        BasicEncapsulation obj = new BasicEncapsulation();

        obj.setName("Amirah");

        System.out.println(obj.getName());
    }
}