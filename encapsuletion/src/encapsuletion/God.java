package encapsuletion;
class Food{
	
}
class Dosa extends Food{
	
}
class Biryani extends Food{
	
}
class MasalaDosa extends Dosa{
	
}
class ChickenBiryani extends Biryani{
	
}
public class God{
	public static void main(String[] args) {
		Food f=new Food();
		Food f1=new Dosa();
		Food f2=new MasalaDosa();
		Food f3=new Biryani();
		Food f4=new ChickenBiryani();
		
	if (f1 instanceof Food) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	}
}
