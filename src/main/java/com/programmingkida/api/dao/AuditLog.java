package com.programmingkida.api.dao;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditLog {
	
	@Id
	@GeneratedValue
	@Type(type="uuid-char")
	@Column(name = "AUDIT_ID",length = 100)
	private UUID id;
	private String description;
	private String auditTypeName;
	private String transcationType;
	private String createdBy;
	
}
