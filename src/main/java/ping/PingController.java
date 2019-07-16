package ping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
	
	@RequestMapping("/ping")
	public PingEntity ping(@RequestParam(value = "me", defaultValue = "Duke") String meRequestParameter) {
		return new PingEntity(meRequestParameter);
	}	
}
