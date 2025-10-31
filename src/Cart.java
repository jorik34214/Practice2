public class Cart<T> {
    private Object[] items;
    private int count;

    public Cart() {
        items = new Object[10];
        count = 0;
    }

    public void addItem(T item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Cart is full. Can't add more items.");
        }
    }

    public int getCount() {
        return count;
    }

    public String printCart(java.util.function.Function<T, String> formatter) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            T obj = (T) items[i];
            sb.append(formatter.apply(obj));
            if (i < count - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
