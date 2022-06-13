// j Bosco Nzeyimana
//ID:20151022

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> prodList = new ArrayList<>();
        prodList.add(new Computers("toshiba","Intel",2250,22));
        prodList.add(new Printers("HP","HP",1234,13));
        prodList.add(new Scanners("Marc","lsla",1234,35));
        prodList.add(new Printers("thinkpad","lsla",1234,19));
        prodList.add(new Computers("MacBook","Apple",1915,25));
        prodList.add(new Scanners("lenovo","lsla",113,32));
        prodList.add(new Printers("Panasonic","lsla",1934,17));
        prodList.add(new Computers("HP","lsla",234,24));
        prodList.add(new Scanners("HP","lsla",1234,12));
        prodList.add(new Printers("Lexmark","lsla",1034,33));


        for (Product prod:prodList){
            System.out.println(prod);
        }
    }
}

