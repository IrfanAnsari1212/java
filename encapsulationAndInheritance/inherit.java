package encapsulationAndInheritance;

//import encapsulationAndInheritance.Student.EngineeringStudent;

public class inherit {
   public static void main(String[] args) {
    
   EngineeringStudent eng = new EngineeringStudent();

   eng.printRollnumber(28);
   Car c1 =new Car();

   c1.start();

   } 
}
class whicle{



    void start(){
        System.out.println("Whicle start");
    }
}



class Car extends whicle{



    void setGear(){

    }
}


class Student{
    String name;
    int age;
    String collageName;
    int rollNumber;




    void printRollnumber(int rln){
        this.rollNumber=rln;
        System.out.println(rollNumber);
    }



    
}

class EngineeringStudent extends Student{
        void accesTolab(){
            System.out.println("Engineering students have access to lab");
        }
    }