package com.care.jenkinsproject.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.care.jenkinsproject.dto.JenkinsDTO;
import com.care.jenkinsproject.repository.JenkinsRepo;

@Service
public class JenkinsService {
	@Autowired(required = false) private JenkinsRepo repo;
	@Autowired private HttpSession session;
	
	public String login(String id, String pw) {
		JenkinsDTO dto = repo.login(id);
		if(dto != null && dto.getPw().equals(pw)) {
			session.setAttribute("member", dto);
			return "로그인 성공";
		}
		return "로그인 실패";
	}
	public List<JenkinsDTO> members(){
		return repo.members();
	}

	public String register(JenkinsDTO member) {
		int count = repo.isExist(member.getId());
		if(count == 0) {
			repo.register(member);
			return "가입 성공";
		}
		return "가입 실패";
	}
}
