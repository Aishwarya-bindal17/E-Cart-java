
public class eCartApplication {

	 public static void main(String[] args) {
	       Customers cu=new Customers();
		   SignUp s= new SignUp();
	       s.display();
	       Item i=new Item();
	       i.display();
	       cart c= new cart();
	       c.getData();
	       c.display(cu.custype);
	 }
}
