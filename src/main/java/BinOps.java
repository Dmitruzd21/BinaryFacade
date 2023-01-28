public class BinOps {

    public String sum(String a, String b) {
        int firstBinaryNumber = Integer.parseInt(a, 2);
        int secondBinaryNumber = Integer.parseInt(b, 2);
        return Integer.toBinaryString(firstBinaryNumber + secondBinaryNumber);
    }

    public String mult(String a, String b) {
        int firstBinaryNumber = Integer.parseInt(a, 2);
        int secondBinaryNumber = Integer.parseInt(b, 2);
        return Integer.toBinaryString(firstBinaryNumber * secondBinaryNumber);
    }
}
