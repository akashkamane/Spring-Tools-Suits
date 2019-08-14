package WebDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebInitializer {
	@RequestMapping("Index")
	public void Home() {
		System.out.println("inside WebInitializer");
		//return "Index";
		
	}

}
