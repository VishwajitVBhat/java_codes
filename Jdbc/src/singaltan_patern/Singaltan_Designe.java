package singaltan_patern;

//     ----lazy inishlazation----

//class User{
//	private static User u;
//	private User() {
//		
//	}
//	public static User getObject() {
//		if(u==null) {
//			u=new User();
//			return u;
//		}return u;
//	}
//}

//public class Designe {
//public static void main(String[] args) {
//	System.out.println(User.getObject());
//	System.out.println(User.getObject());
//}
//}
 



                              //      ----or-----     //



//   ---- early inishalization ----


class User{
	static final User u=new User();
	private User() {	
	}
	public static User getObject() {
		return u;
	}
}

public class Singaltan_Designe {
public static void main(String[] args) {
	System.out.println(User.getObject());
	System.out.println(User.getObject());
}
}
