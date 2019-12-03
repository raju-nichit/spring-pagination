package com.programmingkida.api.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programmingkida.api.dao.AuditLog;
import com.programmingkida.api.service.AuditService;

@RestController
@RequestMapping("/audit")
public class AuditController {
	
	@Autowired
	
	AuditService auditService;
	
	@GetMapping
	public ResponseEntity<Object> getAuditLog(@RequestHeader(name = "Accept-Language", required = false) Locale locale,
			@Valid @RequestBody AuditLog auditLog) throws Exception {
		System.out.println("<------------inside SignUp Controller--------->");
		return new ResponseEntity<Object>(auditService.getAuditLog(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> postAuditLog(@RequestBody AuditLog auditLog) throws Exception {
		System.out.println("<------------inside SignUp Controller--------->");
		return new ResponseEntity<Object>(auditService.saveAuditLog(auditLog), HttpStatus.OK);
	}
	
	
}
