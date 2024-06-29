

public class sample {
    
        static void Mymethod1(String name, int age){
            System.out.println(name + " is " + age +"years old");
        }
    
    static void Mymethod2(String name, String job){
    System.out.println(name + " works as a " + job);
    }
    
        static void CheckAge(int Age){
            if(Age>18){
                System.out.println("Access Granted - You're old enough");
    } else {
                System.out.println("Access Denied - You young af");
        }}
    
    //The methods above are called in the main method below.
    
    public static void main(String[] args){
        String fname = "Onesmus";
        String lname = "Jackson";
        int x=11, y=22;
        int sum = x + y;
        String txt = "This is the text to be converted to \"Upper Case\" ";
        
        Mymethod1( "Daniel", 12);
        Mymethod1("Queen", 45);
        Mymethod1("Alvin", 9);
        CheckAge(17);
    Mymethod2( "John", "carpenter");
    Mymethod2("Janice", "doctor");
    Mymethod2("Michael", "janitor");
        
    System.out.print("Hello World!!");
    System.out.println("Learning Java");
    System.out.println(fname+ " "+lname);
    System.out.println(sum);
    System.out.println(x!=y);
    System.out.println("The length of the text is " + txt.length());
    System.out.println(txt.toUpperCase());
    
    }
    
    }

