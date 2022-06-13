public class Computers extends Product{

    private static final int purchPrice=300000;
    int quantity;

    public Computers(String name, String manufact, int versNum, int quantity) {
        super(name, manufact, versNum);
        this.quantity=quantity;
    }
    public int dispPrice(){
        return purchPrice*quantity;
    }
    public int dispQuant(){
        return quantity;
    }
    public int storeValue(){
        return purchPrice+quantity;
    }
    public String prodName(){
        return "Computer";
    }
    public String toString() {
        return super.toString()+"\t"+purchPrice+"\t"+dispQuant()+"\t"+dispPrice()+"\t"+storeValue()+"\t"+prodName();
    }

}
