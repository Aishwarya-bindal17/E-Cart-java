import java.util.Scanner;
public class Item {
	int i;

	
	public void display() {
	System.out.println("Types: 1. Clothes     2.Foot Wear");
	System.out.println("Enter choice:");
	Scanner sc = new Scanner(System.in); 
	i = sc.nextInt();
	if(i==1) {
    System.out.println("----------   Clothes    ------------");
    System.out.println();
    System.out.println("1.Croptop        Rs800");
	System.out.println("2.jeans          Rs1000");
	System.out.println("3.shirt          Rs900");
	System.out.println("4.skirt          Rs700");
	}
	else {
	System.out.println("----------   Foot Wear    ------------");
	System.out.println();
    System.out.println("1.shoes          Rs1500");
	System.out.println("2.sandal         Rs1000");
	System.out.println("3.slippers       Rs500");
	System.out.println();
	}
	}
}

