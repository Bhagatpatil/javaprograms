/*No, Java constructors do not necessarily need getters and setters.
 Constructors are used to initialize the state of an object when it is created,
  often by setting its fields or properties. Getters and setters, on the other hand, 
  are methods used to access and modify the fields of an object.

While it's common to have getters and setters for fields to provide controlled 
access to the object's state, they are not required for every field,
 and they are not directly related to constructors. Whether you include 
 getters and setters in your class depends on your design and the access 
 control you want to enforce for the fields of your class. */

 // in the java language no need for use getter and setter in the constructor 
    
    
    
    
    class MyMainEmployee{
        private int id;
        private String name;
    
        public MyMainEmployee(){
            id = 11;
            name = "bhagat";
        }
        public MyMainEmployee(String myName, int myId){
            id = myId;
            name = myName;
        }
        public MyMainEmployee(String myName){
            id = 1;
            name = myName;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            this.name = n;
        }
        public void setId(int i){
            this.id = i;
        }
        public int getId(){
            return id;
        }
    }

    
    public class cwh_42_constructors {
        public static void main(String[] args) {
            //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
            MyMainEmployee harry = new MyMainEmployee();
            //harry.setName("CodeWithHarry");
            //harry.setId(34);
            System.out.println(harry.getId());
            System.out.println(harry.getName());
        }
    }
    
