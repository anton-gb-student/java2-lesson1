import java.util.ArrayList;

public class Test {

    // 1. Написать метод, который меняет два элемента массива местами
    // (массив может быть любого ссылочного типа);
    public static <T> T[] reshuffle (T[] src, int x, int y) {
        if (x<0 || y<0 || x>=src.length || y>=src.length) {
            System.out.println("Значения индексов некорректны");
        }
        T [] dst = src.clone();
        dst[x] = src[y];
        dst[y] = src[x];
        return dst;
    }


    // 2. Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList<T> arrToArrayList (T[] t) {
        ArrayList<T> tArrayList = new ArrayList<>(t.length);
        for (int i = 0; i<t.length; i++) {
            tArrayList.add(i, t[i]);
        }
        return tArrayList;
    }

    public static void main(String[] args) {
        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Orange o1 = new Orange();
        System.out.println(ap1.getWeight()); // Проверяем вес фруктов
        System.out.println(o1.getWeight());

        Orange o2 = new Orange();
        Apple ap3 = new Apple();

        Box <Apple> box1 = Box.getOneBox();
        box1.addFruit(ap1);
        box1.addFruit(ap2);
        box1.addFruit(ap3); // Итого в ящике 1 лежат 3 яблока
        Box <Orange> box2 = Box.getOneBox();
        box2.addFruit(o1);
        System.out.println("Вес ящика 1 = " + box1.getWeight()); // Проверяем вес ящиков
        System.out.println("Вес ящика 2 = " + box2.getWeight());
        System.out.println(box1.compare(box2));

        Box<Orange> box3 = Box.getOneBox();
        box3.addFruit(o2);
        box2.pourOutFruits(box3); // Теперь в ящике 3 лежат 2 апельсина
        System.out.println("Вес ящика 1 = " + box1.getWeight());
        System.out.println("Вес ящика 2 = " + box2.getWeight());
        System.out.println("Вес ящика 3 = " + box3.getWeight());
        System.out.println(box1.compare(box3)); // Ящик 1 и ящик 3 сравнялись по весу

        Integer[] arr = {0,1,2,3,4,5,6,7,8,9};
        Integer[] arr2 = reshuffle(arr,2,3);
        for (Integer a : arr2) {
            System.out.print(a + ", ");
        }

        ArrayList<Integer> arrayList = arrToArrayList(arr);
        System.out.println(arrayList);
    }
}
