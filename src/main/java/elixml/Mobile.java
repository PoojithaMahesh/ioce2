package elixml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value("1")
	private int id;
	@Value("Iphone")
	private String name;
	@Value("Yellow")
	private String color;
	 
	@Autowired
	private Charger charger;

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", color=" + color + ", charger=" + charger + "]";
	}
	
	
}
