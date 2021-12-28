package com.ventures.cms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ventures.cms.model.Class;
import com.ventures.cms.service.ClassService;

@RestController
@RequestMapping("/class")
public class ClassController {

	@Autowired
	ClassService classService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Class> create(@RequestBody Class cls) {
		return new ResponseEntity<Class>(classService.createClass(cls), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Class> create(@PathVariable Long id) {
		return new ResponseEntity<Class>(classService.getClass(id), HttpStatus.OK);
	}
}
