package com.journaldev.spring.operations;

import java.io.Serializable;

import com.journaldev.spring.operations.GboPojo;
import com.journaldev.spring.exceptions.CriteriaValidationException;

/**
 * Class used to hold operation info
 *              >
 * @author Accenture
 *
 */
public class Operation extends GboPojo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4084436782775872135L;
	
	// EM_T_BO_OPERATIONS OPERATION_ID			NUMBER
	private Long id;
	// EM_T_BO_OPERATIONS PARENT_OPERATION_ID	NUMBER
	private Long parentId;
	// EM_T_BO_OPERATIONS DESCRIPTION			VARCHAR2(200 BYTE)
	private String shdes;
	// EM_T_BO_OPERATIONS URL					VARCHAR2(300 BYTE)
	private String url;
	// EM_T_BO_OPERATIONS OP_TYPE				VARCHAR2(50 BYTE)
	private String type;
	// EM_T_BO_OPERATIONS DISPLAY_ORDER			NUMBER
	private Long displayOrder;
	// EM_T_BO_OPERATIONS TITLE					VARCHAR2(100 BYTE)
	private String title; 
	// operation name value from I18N for operations title key
	private String name;

	// EM_T_BO_OPERATIONS ACTIVE				CHAR(1 BYTE)
	// EM_T_BO_OPERATIONS ENTRY_DATE			DATE
	// EM_T_BO_OPERATIONS LAST_USER_ID			VARCHAR2(16 BYTE)
	// EM_T_BO_OPERATIONS LAST_UPDATE_DATE		DATE
	
	/**
	 * Get the operation identifier
	 * @return int
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * Set the operation identifier
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
	/**
	 * Get the operation parent identifier
	 * @return int
	 */
	public Long getParentId() {
		return parentId;
	}

	/**
	 * Set the operation parent identifier
	 * @param parentId
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
	/**
	 * Get the operation title
	 * @return String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the operation title
	 * @param title
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the shdes
	 */
	public String getShdes() {
		return shdes;
	}

	/**
	 * @param shdes the shdes to set
	 */
	public void setShdes(String shdes) {
		this.shdes = shdes;
	}

	/**
	 * Get the operation url
	 * @return String
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * Set the operation url
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/***
	 * Get the operation type
	 * @return String
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Set the operation type
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Get the operation display order
	 * @return int
	 */
	public Long getDisplayOrder() {
		return displayOrder;
	}

	/**
	 * Set the operation display order
	 * @param displayOrder
	 */
	public void setDisplayOrder(Long displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isEmpty() throws CriteriaValidationException {

		boolean empty = true;

		try {
			for(int i=0; i < this.getClass().getDeclaredFields().length; i++) {
				java.lang.reflect.Field field = this.getClass().getDeclaredFields()[i];

				if( field.get(this) != null ) {
					// If String type and empty
					if(field.getType().equals(String.class) && field.get(this).toString().isEmpty()) {
						continue;
					}
					empty = false;
				}
			}

		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new CriteriaValidationException(CriteriaValidationException.ILLEGAL_ARGUMENT_OR_ACCESS,
					e.getClass().getSimpleName(), e.getMessage());
		}
		return empty;
	}	
}
