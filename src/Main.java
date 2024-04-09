public class Main {
    public static void main(String[] args) {
        Stos stos = new Stos(5);
        System.out.println(stos);

        try {
            stos.push(2);
            stos.push(4);
        } catch (StackFullException e) {
            System.out.println("Za duzo elementow");
        }

        System.out.println(stos);
    }
}