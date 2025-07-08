package factory_design_pattern;

import java.util.Scanner;

interface Light{
	void sOn();
	void soff();
	}
class TubeLight implements Light{
	public void sOn() {
		System.out.println("Tubelight is on");
	}
	public void soff() {
		System.out.println("Tubelight is off");
	}
	}
class LedLight implements Light{
	public void sOn() {
		System.out.println("Ledlight is on");
	}
	public void soff() {
		System.out.println("Ledlight is off");
	}
	}
class LightFactory{
	public static Light getphone(String lg) {
		if(lg.equalsIgnoreCase("TubeLight")) {
			return new TubeLight();	
		}
		else if(lg.equalsIgnoreCase("LedLight")) {
			return new LedLight();	
		}
		else {
			return null;
		}
	}
}
public class FactoryDesignPatter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter light type\nLedLight \nTubeLight");
	String l=sc.nextLine();
	Light lt=LightFactory.getphone(l);
	lt.sOn();
	lt.soff();
	sc.close();
}
}
