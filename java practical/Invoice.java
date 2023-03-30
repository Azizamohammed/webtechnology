public class Invoice{
    String   partNumber;
    String partDescription;
    Integer purchasedItem;
    Integer pricePeritem;
    
    
    public Invoice(String partNumber, String partDescription, Integer purchasedItem,Integer pricePeritem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.purchasedItem = purchasedItem;
        this.pricePeritem = pricePeritem;
    }

    public Integer getInvoice(){

        if(purchasedItem < 0){
            purchasedItem = 0;
        }
        if (pricePeritem <0) {
            pricePeritem = 0;
            
        } else {
            
        }

        return purchasedItem * pricePeritem;
    }
    public static void main(String[] args) {
        Invoice  inv = new Invoice("kuku", "wa mwezi 1", 12000, 2000);
        System.out.println(inv.getInvoice());
        
    }

    
        
    }



