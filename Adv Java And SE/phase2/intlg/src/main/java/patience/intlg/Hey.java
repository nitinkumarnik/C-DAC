package patience.intlg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hey {
	
	private ItemRempository r;
	
	@Autowired
	public void setR(ItemRempository r) {
		System.out.println("wired.....!!!!!");
		this.r = r;
		
	}

	@PostMapping("/dml")
	public CResult f3(@RequestBody() Item x)
	{
		CResult r = new CResult(false, "insert/update failed");
		
		if(x.getItemno() == 4)
		{
			r.setStatus(true);
			r.setMessage("succeded");
		}
		
		return r;
	}
	
	@GetMapping("/abc123")
	public Item getItemDetails(@RequestParam("x") int x)
	{
		Item i =null;
		Optional<Item> y = r.findById(x);
		if(y.isPresent())
		{
			i = y.get();
			
		}
		else
			i =new Item(0,0);
		
		
		return i;
	}
	
	
	@PostMapping("/pqr")
	public List<Item> getItemDetailsLessThanPrice(@RequestParam("x") int price)
	{
		List<Item> l = new ArrayList<Item>();
		if(price < 3)
		{
			l.add(new Item(4,2));
			l.add(new Item(3,1));
		}
		else
		{
			l.add(new Item(5,7));
			l.add(new Item(6,8));
		}
		
		return l;
	}

}
