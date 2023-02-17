public class FrontDoor {
    public static void main(String[] args) {
        Address start = new Address("9999 Random Street APT 10, Brooklyn, NY 10099");
        Address end = new Address(start);
        Package test = new Package(start, end, 40, 3,4,3);
        System.out.println(PackageCalculator.CalculatePostage("10099", "20099", 40, 36));
        System.out.println(PackageCalculator.CalculatePostage(test));
    }
}
