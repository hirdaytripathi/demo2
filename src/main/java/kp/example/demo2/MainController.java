package kp.example.demo2;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping("/")
  public String index() {
	  System.out.println("hi there");
	  List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7);
	  lst.forEach(System.out::println);
    return "home.html";
  }
}
