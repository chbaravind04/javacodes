interface Method  { 
	void display();
	 void print() {  
		System.out.println("Default method");
	}
	 int cube(int x) { 
		return (x*x*x);
	}
}
class Method1 implements Method {
	   void display() { 
	    	System.out.println("welcome to vignan");
	    }
}
class Method2 implements Method { 
	 void display() { 
		 System.out.println("welcome to cybersecurity");
	 }   
	 void print() { 
		   System.out.println("Here Default method is overridden");
	   }
}

public class Main{
             public static void main(String args[]) {
            	 
               Method a=new Method1(); 
               a.display();
               a.print(); 
             System.out.println("cube value of x is:"+Method.cube(3)); 
         
            Method2 b=new Method2();
             b.print();
             } 
}
