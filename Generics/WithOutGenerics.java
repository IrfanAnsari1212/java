package Generics;

public class WithOutGenerics {
    public static void main(String[] args) {
        
        Box b1 = new Box();

        b1.setValue(200);
        Box b2 = new Box();
        b2.setValue("stringvalue hai ye ");
        String vlu = (String) b2.getValue();
        Integer num = (Integer) b1.getValue();

        System.out.println(num);// 200
        System.out.println(vlu);// String value  hai ye 


        // Box me koi v value store kar sakte hai hai mah koi type sefaty nhi hai yaha aur yahi problem hai , generics isi ko solve karte hai 
        //Problem: Object can hold almost any reference type. You must cast the returned value



    }
}


class Box{
    Object value;


    void setValue(Object value){
        this.value=value;
    }

    Object getValue(){
        return  value;
    }
}