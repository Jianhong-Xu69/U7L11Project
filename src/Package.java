public class Package {
    private Address origin;
    private Address destination;
    private double weight; //precondition: cannot be less than 0.1
    private double length; //precondition: cannot be less than 2
    private double width; //precondition: cannot be less than 2
    private double height; //precondition: cannot be less than 2

    public Package (Address o, Address d, double weigh, double l, double w, double h){
        origin = o;
        destination = d;
        weight = weigh;
        length = l;
        width = w;
        height = h;
    }

    public Address getOrigin() {
        return origin;
    }
    public Address getDestination() {
        return destination;
    }
    public double getWeight() {
        return weight;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
}
