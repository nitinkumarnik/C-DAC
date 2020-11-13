package mypatience.myintlg;

public class Hey {
	
	public Item getItemDetails(int x)
	{
		Item y = new Item(x, 3);
		if (x == 4)
			y.setPrice(49);
		return y;
	}
	
	
}
