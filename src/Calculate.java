import java.lang.Math;

@FunctionalInterface
public interface Calculate {
    void calculate ();
    static double roundUp (double value) {
        return Math.ceil(value*Math.pow(10, 4))*Math.pow(10, -4);
    }
    static void staticCalculate(){
        System.out.println("Статический метод: ");
        FindRoots findRoot = new FindRoots();
        findRoot.calculate();
    }
}
