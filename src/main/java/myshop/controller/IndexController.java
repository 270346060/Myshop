package myshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myshop.model.Cellphone;
import myshop.service.CellphoneService;

@Controller
public class IndexController {
	private CellphoneService cellphoneService;
	
	@Autowired
	public IndexController(CellphoneService cellphoneService) {
		this.cellphoneService = cellphoneService;
	}

	@RequestMapping(method=RequestMethod.GET,value="/")
	public String index(Model model,
			@ModelAttribute Cellphone cellphone){
		List<Cellphone> cellphones = cellphoneService.search(cellphone);
		model.addAttribute("cellphones", cellphones);
		return "index";
	}

}
