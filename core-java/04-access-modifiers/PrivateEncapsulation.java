public class PrivateEncapsulation {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        PrivateEncapsulation obj = new PrivateEncapsulation();

        obj.setName("Saniya");

        System.out.println(obj.getName());
    }
}