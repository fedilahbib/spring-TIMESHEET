package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mission;
import com.example.demo.entity.Timesheet;
import com.example.demo.repository.EntrepriseRepository;
import com.example.demo.repository.TimesheetRepository;
import com.example.demo.service.TimesheetService;

@RestController
public class TimesheetController {

	@Autowired
	private TimesheetRepository timesheetRepository;
	@Autowired
	private TimesheetService timesheetService;
	
	
	@RequestMapping(value = "/mission", method = RequestMethod.POST)
	public int add(@RequestBody Mission mission) {
		return timesheetService.ajouterMission(mission);
	}
	
	
	@RequestMapping(value = "/timesheet/{missionId}/{depId}", method = RequestMethod.POST)
	public void affecterMissionADepartement(@PathVariable int missionId,@PathVariable int depId) {
		 timesheetService.affecterMissionADepartement(  missionId,  depId);

	}
 
}
