
package exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> itemquant = new ArrayList<>();
        ArrayList<Integer> paid = new ArrayList<>();
        ArrayList<Integer> due = new ArrayList<>();
        String shipAdr;
        String billAdr;
        Scanner in = new Scanner(System.in);
    public Exercise6() {
        this.shipAdr = "";
        this.billAdr = "";
}
    public void item() {
        System.out.println("ITEM:");
        this.items.add(in.nextLine()); 
        System.out.println("QUAN:");
        this.itemquant.add(in.nextInt());
    }
    public void paidue() {
        System.out.println("PAID:");
        this.paid.add(in.nextInt());
        System.out.println("DUE:");
        this.due.add(in.nextInt());
    }
    public void address() {
        System.out.print("\nEnter shipping address:\n");
        this.shipAdr=in.nextLine();
        System.out.print("\nEnter billing address:\n");
        this.billAdr=in.nextLine();
    }
    public static void main(String[] args) {
        Exercise6 invoice = new Exercise6();
        invoice.item();
        invoice.paidue();
        invoice.address();
        System.out.println("ITEM:" +invoice.items);
        
        System.out.println("QUAN:" +invoice.itemquant);
        
        System.out.println("PAID:" +invoice.paid);
        
        System.out.println("DUE:" +invoice.due);
        
        System.out.println("Billing Address:" +invoice.shipAdr);
        
        System.out.println("Shipping Address:" +invoice.billAdr);
    }
    
}
