public class FrontDoor {
    public static void main(String[] args) {
        Address test = new Address("223 8th Avenue APT 7N, Brooklyn, NY 11201");
        System.out.println(test);
        Address test2 = new Address("228 18th Avenue, Brooklyn, NY 11251");
        System.out.println(test2);
        Address test3 = new Address("A-888", "random street thingy ahhhhh", "19B", "randomy CT", "OH", "00000");
        System.out.println(test3);
        Address test4 = new Address(test);
        test4.setCity("NJ");
        System.out.println(test4);
        System.out.println(test);
    }
}
