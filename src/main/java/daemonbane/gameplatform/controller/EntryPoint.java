package daemonbane.gameplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import daemonbane.gameplatform.domain.Army;
import daemonbane.gameplatform.domain.Hero;
import daemonbane.gameplatform.service.Mediator;

@RestController
public class EntryPoint {

	@Autowired
	private Hero hero;

	@Autowired
	private Army army;

	@RequestMapping("/")
	public String index() {

		Mediator.battle(hero, army);

		return "Controller entry point";
	}

}