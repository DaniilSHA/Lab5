public class Main {
    public static void main(String[] args) {
        FindRoots findRoot = new FindRoots();

        System.out.println(findRoot.functionExp(0.69));
        System.out.println(findRoot.functionSin(2.29));
        System.out.println(findRoot.functionLn(1.94));
        System.out.println(findRoot.functionTg(3.14));
        System.out.println(findRoot.functionCube(2.69));



        System.out.println(findRoot.findRoots("Exp", 0.01, 2, 0.00001));
        System.out.println(findRoot.findRoots("Sin", 2, 3, 0.00001));
        System.out.println(findRoot.findRoots("Ln", 1, 3, 0.00001));
        System.out.println(findRoot.findRoots("Tg", 2, 4, 0.00001));
        System.out.println(findRoot.findRoots("Cube", 1, 5, 0.00001));




    }
}
