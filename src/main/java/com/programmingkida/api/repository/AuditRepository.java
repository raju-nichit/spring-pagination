package com.programmingkida.api.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.programmingkida.api.dao.AuditLog;

@Repository
public interface AuditRepository extends JpaRepository<AuditLog, UUID> {

	public List<AuditLog> findTop5ByAuditTypeNameOrderByCreatedByAsc(String lastname);

}
