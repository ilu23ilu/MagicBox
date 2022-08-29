import java.util.Random;

public class MagicBox<T> {
    protected int countItem;
    protected T[] items;

    public MagicBox(int countItem) {
        this.items = (T[]) new Object[countItem];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int countFiledCell = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                countFiledCell++;
            }
        }
        if (items.length - countFiledCell != 0) {
            throw new RuntimeException("Коробка не полна, осталось еще заполнить ячеек: " + (items.length - countFiledCell));
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }
}