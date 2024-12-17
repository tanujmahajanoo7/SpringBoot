package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetController {
	
	@Autowired
	MessageService messageService;
	
    @RequestMapping("/")
	public String home() {
        return "home";
    }
    
    @PostMapping("/greet")
    public String sendMessage(@RequestParam("un") String name, Model model) {
    	String message = messageService.buildMessage(name);
    	model.addAttribute("msg",message);
    	return "greet";
    }
}
