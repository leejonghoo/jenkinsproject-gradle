package com.care.jenkinsproject.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.care.jenkinsproject.dto.JenkinsDTO;
import com.care.jenkinsproject.service.JenkinsService;

@Controller
public class HomeController {
	@Autowired private JenkinsService service;
	@Autowired private HttpSession session;
	
	@RequestMapping("header") public void header() {}
	@RequestMapping("main")	public void main() {}
	@RequestMapping("footer")	public void footer() {}
	
	@RequestMapping("/")
	public String index() {	return "index";	}
	
	@GetMapping("register")	public void register() {}
	@GetMapping("login")	public void login() {}
	@GetMapping("update")	public void update() {}
	
	@PostMapping("login")	
	public String login(String id, String pw, Model model, RedirectAttributes ra) {
		String msg = service.login(id, pw);
		if(msg.equals("로그인 성공")) {
			ra.addFlashAttribute("msg", msg);
			return "redirect:/";
		}
		model.addAttribute("msg", msg);
		return "login";
	}
	@PostMapping("register")	
	public String register(JenkinsDTO dto,Model model, RedirectAttributes ra) {
		String msg = service.register(dto);
		if(msg.equals("가입 성공")) {
			ra.addFlashAttribute("msg", msg);
			return "redirect:/";
		}
		model.addAttribute("msg", msg);
		return "register";
	}
	
	@RequestMapping("logout")
	public String logout() {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("members")
	public void members(Model model) {
		model.addAttribute("members", service.members());
	}
}
