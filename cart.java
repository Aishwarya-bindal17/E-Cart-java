import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class cart {

	int OrderNo;
	int itemId;
	int qty;
	String itemName;
	int cqty=0;
	int jqty=0;
	int skqty=0;
	int sqty=0;
	int res;
	double tprice;
	
	 static String EName="E-shop";
	
	public void getData() {

		Scanner sc = new Scanner(System.in); 
	      boolean run=true;
		  while(run) {
			System.out.println("Please Select item number or select 5 to exit: ");
			res = sc.nextInt();
			switch(res) {
			
			case 1: System.out.println("Croptop selected");
			System.out.println("Select quantity:");
			qty=sc.nextInt();
			tprice=tprice+ 800*qty;
			cqty=qty;
			break;
			
			case 2:System.out.println("jeans selected");
			System.out.println("Select quantity:");
			qty=sc.nextInt();
			tprice=tprice+ 1000*qty;
			jqty=qty;
			break;
			
			case 3:System.out.println("shirt selected");
			System.out.println("Select quantity:");
			qty=sc.nextInt();
			tprice=tprice+ 900*qty;
			sqty=qty;
			break;
			
			case 4:System.out.println("skirt selected");
			System.out.println("Select quantity:");
			qty=sc.nextInt();
			tprice=tprice+ 700*qty;
			skqty=qty;
			break;
			case 5:
				run=false;
				break;
			default:
				break;
			}
			}	 
		}
	
	public void display(String custype)
	{
        double finalPrice;
        String customerType="Guest";
        
       if (custype.startsWith("p")) {
             finalPrice = new PrimeUsers().CalculateBill(tprice);
             customerType = "Prime User";
         } 
       
         else {
             finalPrice = new Guest().CalculateBill(tprice);
         }

        System.out.println();
        System.out.println("-----------       "+EName+"    ----------");
        System.out.println();
        System.out.println();
        System.out.println("Order details are: ");
        System.out.println();
        System.out.println("Customer Type: " + customerType);
        System.out.println("Ordered Items:");
        System.out.println("   Item    Quantity");
        if (cqty > 0) {
            System.out.println(" Croptop    " + cqty);
        }
        if(jqty > 0) {
            System.out.println("  Jeans      " + jqty);
        }
        if (sqty > 0) {
            System.out.println("  Shirt      " + sqty);
        }
        if (skqty > 0) {
            System.out.println("  Skirt     " + skqty);
        }
        System.out.println("Total Amount: Rs " + tprice);
        System.out.println("Final Payable Amount: Rs " + finalPrice);
    
        LocalDate ld = LocalDate.now();
		System.out.println("date: "+ld);

		LocalTime lt = LocalTime.now();
		System.out.println("time: "+lt);
        System.out.println();
    }
}
	

			 

