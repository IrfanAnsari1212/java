package Generics;

public class WithGenerics {
 public static void main(String[] args) {
    

    Box<Integer> b1 = new Box<>();// yahi define karna padega kaisa value add karna hai Box me , aise type sefaty rahta hai
   
   
    b1.setValue(875);
    Integer num = b1.getValue();
    System.out.println(num);


    // now lwts use the same Same class for another dataType

    Box<String> s1 = new Box<>();
    s1.setValue("ye String value hai jo same class se milega bas ham ne gegrics se pahle hi bata dia hai ki ye String type ka hoga");
    String str = s1.getValue();
    System.out.println(str);// ye String value hai jo same class se milega bas ham ne gegrics se pahle hi bata dia hai ki ye String type ka hoga






    //test 
    Box2<Integer> b2= new Box2<>();

    b2.setValues(88);
   Integer num2= b2.getValue();
   System.out.println(num2);
 }
}


class Box<T>{
    T value;


    void setValue(T value){
        this.value = value;
    }

    T getValue(){
        return value;
    }
}



class Box2<T>{
    T value;

// setter
    void setValues(T value){
        this.value=value;
    }

    //getter 
    T getValue(){
        return value;
    }
}