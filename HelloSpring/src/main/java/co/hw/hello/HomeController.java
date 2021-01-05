package co.hw.hello;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
//@Controller("border") 이런식으로 적고 border 관련된 모든 걸이 컨트롤에 적으면 된다.
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {  //"컨텐츠가 루트면" 이라는 뜻
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/second")  //다 생략하고 이렇게 만 쓸 수 있다
	public String second(Model model) {
		String message = "처음으로 해보는 스프링 프로그래밍";
		
		model.addAttribute("message", message );
		
		return "second";
	}
	
}
