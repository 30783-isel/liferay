package com.journaldev.spring.operations;

import com.journaldev.spring.exceptions.CriteriaValidationException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSerializer;


public abstract class GboPojo {

	@Override
	public String toString(){

		String result = null;
		try {
			GsonBuilder gsonBuilder = new GsonBuilder();
			if (this instanceof JsonSerializer)
				gsonBuilder.registerTypeAdapter(this.getClass(), this);
			Gson gson = gsonBuilder.create();
			result = gson.toJson(this, this.getClass());
		} catch ( Exception e) {
			result = "[ERROR] printing object via Gson: "+e.getMessage();
		}
		return result;
	}

	public abstract boolean isEmpty() throws CriteriaValidationException;

}
