package by.epam.tr.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Appliances> appl = new ArrayList<>();
		appl.add(new Laptop(5.5,"Windows",4000,160000,3.2,1080,"yes",3730));
		appl.add(new Laptop(5.5,"IOS",4000,260000,3.2,1440,"no",4230));
		appl.add(new Laptop(5.5,"Windows",4000,160000,3.2,1080,"yes",730));
		appl.add(new TabletPC(2.3,2500, 720, 2, "Black", "yes",1200));
		appl.add(new TabletPC(3,2500, 720, 3, "Blue", "yes",1300));
		appl.add(new TabletPC(3.2,2500, 720, 4, "White", "yes",1400));
		for(Appliances ap:appl) {
			System.out.println(ap.toString());
		}
		//Laptop ap1=(Laptop)appl.get(1);
		System.out.println();
		Collections.sort(appl, new SortByPrice());
		for(Appliances ap:appl) {
			System.out.println(ap.toString());
		}
	}

}
