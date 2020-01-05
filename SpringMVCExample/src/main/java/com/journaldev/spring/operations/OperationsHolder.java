package com.journaldev.spring.operations;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Class used to map the operations with the profiles
 * 
 * @author Accenture
 *
 */
public class OperationsHolder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5854135316264666579L;	
	
	private Map<String, List<Operation>> operationsByParentId = new LinkedHashMap<String, List<Operation>>();
	private Map<String, List<Operation>> operationsByType = new LinkedHashMap<String, List<Operation>>();
	private Map<String, Map<String,List<Operation>>> operationsByParentIdAndType = new LinkedHashMap<String, Map<String, List<Operation>>>();
	
	private Map<Integer, Operation> operationById = new LinkedHashMap<Integer, Operation>();
	private Map<String, Operation> operationByUrl = new LinkedHashMap<String, Operation>();
	
	
	
	public List<Operation> getOperationsList(int parentId) {
		return operationsByParentId.get(Integer.toString(parentId));
	}

	public List<Operation> getOperationsList(String type) {
		return operationsByType.get(type);
	}

	public List<Operation> getOperationsList(int parentId, String type) {
		Map<String, List<Operation>> operationsByType = operationsByParentIdAndType.get(Integer.toString(parentId));
		if (operationsByType == null)
			return null;
		
		return operationsByType.get(type);
	}
	
	public void setOperationsByParentId(Map<String, List<Operation>> operationsMapByParentId) {
		this.operationsByParentId = operationsMapByParentId;
	}
	
	public void setOperationsByType(Map<String, List<Operation>> operationsMapByType) {
		this.operationsByType = operationsMapByType;
	}
	
	public void setOperationsByParentIdAndType(Map<String, Map<String,List<Operation>>> operationsMapByParentIdAndType) {
		this.operationsByParentIdAndType = operationsMapByParentIdAndType;
	}
	
	
	public Operation getOperationById(int operationId) {
		return operationById.get(operationId);
	}
	public void setOperationByOperationId(Map<Integer,Operation> operationByOperationId) {
		this.operationById = operationByOperationId;
	}
	
	
	public Operation getOperationByUrl ( String operationsURL ) {
		return operationByUrl.get(operationsURL);
	}
	
	public void setOperationByOperationUrl(Map<String,Operation> operationByOperationUrl) {
		this.operationByUrl = operationByOperationUrl;
	}
	
	public HashMap<Long, String> getOperationsNames() {
		HashMap<Long, String> result = new HashMap<Long, String>();
		
		for ( Entry<Integer, Operation> en : operationById.entrySet()) {
			result.put(en.getKey().longValue(), en.getValue().getName());
		}
		return result;
	}
	
}