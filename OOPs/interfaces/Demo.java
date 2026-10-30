package OOPs.interfaces;

public class Demo {
   public static void main(String[]args){
    Payment p = new Creaditcard();
    p.pay();
   } 
}


interface Payment{
    void pay();
}

class Creaditcard implements Payment{
    @Override 
    public void pay(){
        System.out.println("pay via creadit cards");
    }

}

class DebitCard implements Payment{
    @Override 
    public void pay(){
        System.out.println("pay via DebitCards");
    }
}