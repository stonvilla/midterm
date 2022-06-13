public class Printers extends Product{
    private static final int purchPrice=200000;
    int quantity;
    public Printers(String name, String manufact, int versNum, int quantity) {
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
        return "Printer";
    }
    public String toString() {
        return super.toString()+"\t"+purchPrice+"\t"+dispQuant()+"\t"+dispPrice()+"\t"+storeValue()+"\t"+prodName();
    }
}
