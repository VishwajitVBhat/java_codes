package plane;
//class Plane{
//	void takeoff() {
//		System.out.println("take off");
//	}
//	void fly() {
//		System.out.println("palin is flying");
//	}
//	void land() {
//		System.out.println("plain is landed");
//	}
//}
//class CargoPlane extends Plane{
//	void takeoff() {
//		System.out.println(" cp take off");
//	}
//	void fly() {
//		System.out.println("cp palin is flying");
//	}
//	void land() {
//		System.out.println("cp plain is landed");
//	}
//}
//class PassengerPlane extends Plane{
//	void takeoff() {
//		System.out.println("pp take off");
//	}
//	void fly() {
//		System.out.println("pp palin is flying");
//	}
//	void land() {
//		System.out.println("pp plain is landed");
//	}
//}
//class FighterJet extends Plane{
//	void takeoff() {
//		System.out.println("fp take off");
//	}
//	void fly() {
//		System.out.println("fp palin is flying");
//	}
//	void land() {
//		System.out.println("fpplain is landed");
//	}
//}
//class AirPort{
//	void allowplain(CargoPlane ref) {
//		ref.takeoff();
//		ref.fly();
//		ref.land();
//	}
//	void allowplain(PassengerPlane ref) {
//		ref.takeoff();
//		ref.fly();
//		ref.land();
//	}
//	void allowplain(FighterJet ref) {
//		ref.takeoff();
//		ref.fly();
//		ref.land();
//	}
//}
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CargoPlane cp=new CargoPlane();
//		PassengerPlane pp=new PassengerPlane();
//		FighterJet fp=new FighterJet();
//		AirPort a=new AirPort();
//		a.allowplain(cp);
//		a.allowplain(pp);
//		a.allowplain(fp);
//	}
//
//}





class Plane{
	void takeoff() {
		System.out.println("take off");
	}
	void fly() {
		System.out.println("palin is flying");
	}
	void land() {
		System.out.println("plain is landed");
	}
}
class CargoPlane extends Plane{
	void takeoff() {
		System.out.println(" cp take off");
	}
	void fly() {
		System.out.println("cp palin is flying");
	}
	void land() {
		System.out.println("cp plain is landed");
	}
}
class PassengerPlane extends Plane{
	void takeoff() {
		System.out.println("pp take off");
	}
	void fly() {
		System.out.println("pp palin is flying");
	}
	void land() {
		System.out.println("pp plain is landed");
	}
}
class FighterJet extends Plane{
	void takeoff() {
		System.out.println("fp take off");
	}
	void fly() {
		System.out.println("fp palin is flying");
	}
	void land() {
		System.out.println("fpplain is landed");
	}
}
class AirPort{
	void allowplain(Plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane cp=new CargoPlane();
		Plane pp=new PassengerPlane();
		Plane fp=new FighterJet();
		AirPort a=new AirPort();
		a.allowplain(cp);
		a.allowplain(pp);
		a.allowplain(fp);
	}

}
