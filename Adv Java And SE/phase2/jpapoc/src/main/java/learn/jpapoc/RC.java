package learn.jpapoc;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RC {
	
	private ItemRepository r;

	@Autowired
	public void setR(ItemRepository r)
	{
		System.out.println("Wired.");
		this.r = r;
	}
	
	
	@GetMapping("/abc")
	public Item getItemDetails(@RequestParam("x") int x)
	{
		Item i = null;
		
		Optional<Item> y = r.findById(x);
		
		if(y.isPresent())
			i = y.get();
		else
			i = new Item(0,0);
		
		return i;
	}
	
}
