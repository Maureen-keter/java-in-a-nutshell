public class Inheritance {
    public static void main(String[] args) {
        ScientificCalc obj = new ScientificCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(10,7);
        int r3 = obj.multi(4,5);
        int r4 = obj.div(14,5);
        double r5 = obj.power(2,8);

        System.out.println(r1 + "," + r2 + "," + r3 + "," + r4 + "," + r5);
    }
}