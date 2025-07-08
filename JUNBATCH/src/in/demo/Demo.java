package in.demo;
import in.dummy.*;
public class Demo extends Dummy {
void m() {
	try {
		Class.forName("in.dummy.Dummy");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
