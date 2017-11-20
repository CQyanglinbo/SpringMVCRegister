package online.shixun.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import online.shixun.project.entity.DefaultUser;
import online.shixun.project.entity.SimpleUser;

@Controller
@RequestMapping("user")
public class UserController {
	@RequestMapping(value="{userType}",method=RequestMethod.GET)
	public String registerPage(Model model,@PathVariable String userType){
		System.out.println("进入"+userType+"用户注册页面...");
		return userType+"Register";
	}
	
	@RequestMapping(value="simpleUserRegister",method=RequestMethod.POST)
	public String simpleUserRegister(@Valid SimpleUser user,BindingResult bindingResult,HttpServletRequest request){
		if(bindingResult.hasErrors()){
			request.setAttribute("message", "注册失败，请检查数据有效性!");
			return "simpleRegister";
		}else{
			request.setAttribute("user", user);
			return "registerSuccess";
		}		
	}
	@RequestMapping(value="defaultUserRegister",method=RequestMethod.POST)
	public String defaultUserRegister(@Valid DefaultUser user,BindingResult bindingResult,HttpServletRequest request){
		if(bindingResult.hasErrors()){
			request.setAttribute("message", "注册失败，请检查数据有效性!");
			return "defaultRegister";
		}else{
			request.setAttribute("user", user);
			return "registerSuccess";
		}		
	}
}
