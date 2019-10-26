package mani.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView model=new ModelAndView("page");
		model.addObject("msg","Welcome to my website");
		return model; 
	}
	@RequestMapping(value= {"/test"})
	public ModelAndView test(@RequestParam("msg")String msg) {
		ModelAndView model=new ModelAndView("page");
		model.addObject("msg",msg);
		return model; 
	}
}
