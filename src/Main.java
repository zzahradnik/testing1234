class Student {
	// Variables
    private String x;
    private String y;
    
    // Class Constructor
    public Student(String x, String y) 
    {
        this.x = x;
        this.y = y;
    }
    
    // Method Print
    public void print() 
    {
        System.out.println("(" + y + "," + x + ")");
    }
    
    /* Method Scale
    public void scale()
    {
    	x = x/2;
    	y = y/2;
    } */
}

public class Main {
    public static void main(String[] args) {
        // New Class Instance
    	Student[] student = new Student[] 
    			{
    			new Student("Joe", "Bronie"),
    			new Student("Zach", "Zahradnik")
    			};
    	 for (Student blah : student)
    	 {
    		 blah.print();
    		
    	 }
            
        
    }
}