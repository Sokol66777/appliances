package by.epam.tr.main;

import java.util.Comparator;

public class SortByPrice implements Comparator<Appliances> {
	

	@Override
	public int compare(Appliances app1, Appliances app2) {
		// TODO Auto-generated method stub
		if(app1.getPrice()>app2.getPrice()) {
			return 1;
		}
		else if(app1.getPrice()<app2.getPrice()) {
			return -1;
		}
		return 0;
	}

}
