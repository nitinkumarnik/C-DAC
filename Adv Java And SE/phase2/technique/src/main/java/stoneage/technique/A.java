package stoneage.technique;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {
	
	@GetMapping("/psbt")
	public Circle f1()
	{
		Circle c = new Circle(3);
		return c;
	}
	
	
	@GetMapping("/ppvg")
	public Circle f2(@RequestParam("y") int x)
	{
		System.out.println("fs getting called.");
		Circle c = new Circle(1);
		if (x == 2)
			c.setRadius(0);	
		return c;
	}
	
	
	@PostMapping("/ovbir")
	public String f4(@RequestBody Circle c)
	{
		System.out.println("circle being passed in request");
		String s = "laziness to return json";
		if(c.getRadius() == 3)
		{
			s = "Shortcut to hell.";
		}
		
		return s;
	}

}
