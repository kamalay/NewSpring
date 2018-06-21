package io.springboot.Api.NewSpring.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @RestController is a convenience annotation that does nothing more than adding the @Controller and @ResponseBody annotations
public class HelloController {
 
	@RequestMapping("/hello")//@RequestMapping is one of the most common annotation used in Spring Web applications. This annotation maps HTTP requests to handler methods of MVC and REST controllers.
	public String sayHello() {
		return "Hello Kishore";
	}
}
