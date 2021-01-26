package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.GuestDao;
import com.javaex.vo.GuestVo;

@Controller
@RequestMapping(value="/guest")
public class GuestController {
	
	@Autowired
	GuestDao guDao;
	
	
	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		
		model.addAttribute("guList", guDao.getList());
		
		return "list";
	
	}
	
	
	@RequestMapping(value="/deleteForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String deleteForm() {
		
		return "deleteForm";
	}
	
	@RequestMapping(value="/delete", method= {RequestMethod.GET, RequestMethod.POST})
	public String delete(@ModelAttribute GuestVo guVo, Model model) {
		
		int result = guDao.delete(guVo);
			
		if(result==1) {
			return "redirect:list";
		}
		
		else {
			model.addAttribute("fail", result);
			return "deleteForm";
		}
	}
	
	@RequestMapping(value="/insert", method ={RequestMethod.GET, RequestMethod.POST} )
	public String insert(@ModelAttribute GuestVo guVo) {
		
		guDao.insert(guVo);
		
		return "redirect:list";
	}
	
	
	@RequestMapping(value="/updateForm", method ={RequestMethod.GET, RequestMethod.POST} )
	public String updateForm(@RequestParam("no") int no, Model model) {
		
		
		model.addAttribute("guVo", guDao.getOne(no));
		
		return "updateForm";
	}
	
	@RequestMapping(value="/update", method ={RequestMethod.GET, RequestMethod.POST} )
	public String update(@ModelAttribute GuestVo guVo) {
		
		guDao.update(guVo);
		return "redirect:list";
	}
	
	
	
	
	
	
}
