package com.learn.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;

@Data
public class JavaCollection {

	List<String> addressList;
	// No duplicates
	Set<String> addressSet;
	Map<Integer, String> addressMap;
	// Name-Value pairs where both are String
	Properties addressProp;

}
