package variables;
class dog {
	String name; // instance 
	
	static String species = "Afghan Hound";
	void dogdetail() {
		System.out.println("The name of dog is: "+name+ " and the species: "+species);
	}
	
}
public class Question_2 {
public static void main(String[] args) {

	dog d1 = new dog();
	d1.name ="Rocky";
	
	dog d2 = new dog();
	d2.name = "Duke";
	
	
	d1.dogdetail();
	d2.dogdetail();
	
	
}
}
