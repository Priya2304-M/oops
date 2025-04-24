abstract class animals {
    abstract void sound();
}
class tiger extends animals {
    @Override
    public void sound() {
        System.out.println("tiger growls");
    }
}
class lion extends animals {
    @Override
    public void sound() {
        System.out.println("lion growls");
    }
}
public class Abstractani {
    public static void main(String[] args) {
        tiger tiger=new tiger();
        tiger.sound();
        lion lion=new lion();
        lion.sound();
        System.out.println("priya");
        System.out.println("24221");
    }
}