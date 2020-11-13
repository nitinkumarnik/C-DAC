package patience.intlg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cool {
	
	@PostMapping("/ms")
	public List<Emp> f2(@RequestParam("x") int deptid)
	{
		List<Emp> el = new ArrayList<Emp>();
		
		if(deptid == 2)
		{
			el.add(new Emp(1, "A", 2));
			el.add(new Emp(2, "B", 2));
		}
		else 
		{
			el.add(new Emp(2, "C", 3));
			el.add(new Emp(3, "D", 3));
		}
		
		return el;
	}

	@GetMapping("/ss")
	public Emp f1(@RequestParam("x") int empno)
	{
		Emp e = new Emp(empno, "Boomer", 99);
		
		if (empno == 3)
		{
			e.setEmpname("X");
			e.setDeptid(4);
		}
		else
		{
			e.setEmpname("Z");
			e.setDeptid(5);
		}
		
		return e;
	}
	
	
	@PostMapping("/dmlup")
	public CResult f3(@RequestBody() Emp e)
	{
		CResult cr = new CResult(true, "insert failed");
		
		if (e.getEmpno() == 2)
		{
			cr.setStatus(false);
			cr.setMessage("insert succeeded");
		}
		
		return cr;
	}
	
	
	@PostMapping("/cobj")
	public CResult f4(@RequestBody() List<Circle> c)
	{
		int sum = 0;
		for (Circle radi : c)
		{
			// System.out.println(radi.getRadius());
			sum = sum + radi.getRadius();
		}
		
		CResult cc = new CResult(true, "sum of radius "+ sum);
		
		
		
		if (c.size()%2 != 0)
		{
			cc.setStatus(false);
			cc.setMessage("sum of odd radius "+ sum);
		}
		
		return cc;
	}
	
}
