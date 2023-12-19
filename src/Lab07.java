public class Lab07 {
    public static void main(String[] args) {

        HashSetUsingHashMap<Integer> set = new HashSetUsingHashMap<>();

        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        System.out.println("Set: " + set);

        System.out.println("Contains 6 = " + set.contains(6));
        System.out.println("Contains 8 = " + set.contains(8));
        System.out.println("Contains 11 = " + set.contains(11));

        set.remove(6);
        System.out.println("Remove 6: " + set);
        System.out.println("Contains 6 = " + set.contains(6));

    }
}