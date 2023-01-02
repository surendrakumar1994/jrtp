package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping("/")
	public String welcome() {
		return "<h2>Welcome to Ashok It :)</h2>";
	}
	@GetMapping("/admin")
	public String adminProcess() {
		return "<h2>Welcome to Admin :)</h2>";
	}
	@GetMapping("/user")
	public String userProcess() {
		return "<h2> Welcome to User :)</h2>";
	}
}
