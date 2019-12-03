package com.programmingkida.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.programmingkida.api.dao.AuditLog;
import com.programmingkida.api.repository.AuditRepository;

@Service
public class AuditService {

	@Autowired
	private AuditRepository repository;

	public List<AuditLog> getAuditLog() {

		return repository.findTop5ByAuditTypeNameOrderByCreatedByAsc("fedex-express");
	}
	
	public List<AuditLog> saveAuditLog(AuditLog auditLog) {
		 repository.save(auditLog);
		 return repository.findTop5ByAuditTypeNameOrderByCreatedByAsc("fedex-express");

	}
	

}
