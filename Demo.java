class Demo {
    public  static void main(String[] args) {
        System.out.println("Hello, World!");
        Demo demo = new Demo();
        demo.gun();
        demo.fun();

    }
    void gun(){
        System.out.println("This is gun method");
    }
    void fun(){
        System.out.println("This is fun method");
    }
}