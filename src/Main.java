public class Main {
    public static void main(String[] args) {
        MagicBox<String> box1 = new MagicBox<>(6);
        box1.add("1");
        box1.add("2");
        box1.add("3");
        box1.add("4");
        box1.add("5");
        box1.add("6");
        System.out.println(box1.pick());

        MagicBox<Integer> box2 = new MagicBox<>(6);
        box2.add(1);
        box2.add(2);
        box2.add(3);
        box2.add(4);
        box2.add(5);
        box2.add(6);
        System.out.println(box2.pick());
    }
}
