/**
 * @author xinxin.lu01@hand-china.com
 * @date 下午2:41 14:41
 */


public class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getLast() {
        return last;
    }

    public void setLast(T last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    public static <K> Pair<K> create(K first, K last){
        return new Pair<K>(first,last);
    }
}
