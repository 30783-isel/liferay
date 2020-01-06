package com.journaldev.spring.beans.context;

import java.io.IOException;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Component
public class ConvertJsonToObjectClss<T> {

	private static Logger logger = LoggerFactory.getLogger(ConvertJsonToObjectClss.class);
	private Class<T> valueType;

	public T convertJsonToObjWithJackson(String str) {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		T t = null;
		try {
			t = mapper.readValue(str, getValueType());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return t;
	}

	public T convertJsonToObjWithGson(String str) {
		Gson gson = new Gson();
		GsonBuilder builder = new GsonBuilder();
		gson = builder.create();
		T t = gson.fromJson(str, getValueType());
		return t;
	}

	public Class<T> getValueType() {
		return valueType;
	}

	public void setValueType(Class<T> valueType) {
		this.valueType = valueType;
	}

}
