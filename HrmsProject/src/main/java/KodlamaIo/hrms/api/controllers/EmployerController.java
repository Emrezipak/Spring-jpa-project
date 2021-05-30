package KodlamaIo.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.hrms.business.abstracts.EmployerService;
import KodlamaIo.hrms.core.utilities.results.DataResult;
import KodlamaIo.hrms.core.utilities.results.Result;
import KodlamaIo.hrms.entities.concretes.Employer;


@RestController
@RequestMapping("/employer")
public class EmployerController {
	
	private EmployerService employerService;
    @Autowired
	public EmployerController(EmployerService employerService) {
		this.employerService = employerService;
	}
    
    @GetMapping("/getall")
    public DataResult<List<Employer>> getAll() {
    	
    	return this.employerService.getAll();
    }
    
    @PostMapping("/add")
    
    public Result add(@RequestBody Employer employer) {
    	
    	return this.employerService.save(employer);
    }
    
	

}
