public class Product {
    String name;
    String manufact;
    int versNum;

    public Product(String name, String manufact, int versNum) {
        this.name = name;
        this.manufact = manufact;
        this.versNum = versNum;
    }
    public String toString() {
        return name +"\t"+ manufact+"\t"+versNum;
    }

}
