/**
 * @author xinxin.lu01@hand-china.com
 * @date 下午2:45 14:45
 */


public class Main {
    public static void main(String[] args) {
        Pair<String> p = new Pair<>("l", "xx");
        Pair<Integer> c = Pair.create(1, 2);
        System.out.println(p);
        System.out.println(c);
    }
}
