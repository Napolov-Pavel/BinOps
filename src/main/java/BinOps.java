public class BinOps {
    public String sum(String a, String b) {
        Integer first = Integer.parseInt(a, 2);
        Integer second = Integer.parseInt(b, 2);
        return Integer.toBinaryString(first + second);
    }

    public String mult(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        return Integer.toBinaryString(first * second);
    }
}
