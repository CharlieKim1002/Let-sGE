package com.greedy.goodeat.admin.product.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TBL_ADDFILE")
@SequenceGenerator(name = "ADDFILE_SEQ_GENERATOR", sequenceName = "SEQ_ADDFILE_NO", initialValue = 1, allocationSize = 1)
@DynamicInsert
public class KjyAddfile {
	
	@Id
	@Column(name = "ADDFILE_NO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ADDFILE_SEQ_GENERATOR")
	private Integer addfileNo;
	
	@Column(name = "ORIGINALFILE_NAME")
	private String originalFileName;
	
	@Column(name = "SAVEDFILE_NAME")
	private String savedFileName;
	
	@Column(name = "SAVED_ROUTE")
	private String savedRoute;
	
	@Column(name = "FILE_TYPE")
	private String fileType;
	
	@Column(name = "THUMBNAIL_ROUTE")
	private String thumbnailRoute;
	
	@Column(name = "PRODUCT_CODE")
	private Integer productCode;
	
	
	
	

}
