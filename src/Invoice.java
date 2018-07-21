public class Invoice {
    public static String formatid(String oldId) {
        return oldId + "_invoice";
    }
}
class SalesInvoice extends Invoice{
    public static String formatid(String oldId){
        return oldId +"_salesInvoice";
    }
}
