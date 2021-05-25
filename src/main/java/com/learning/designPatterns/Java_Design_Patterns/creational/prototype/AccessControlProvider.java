package com.learning.designPatterns.Java_Design_Patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {
	
	private static Map<String, AccessControl> accessControls = new HashMap<String, AccessControl>();
	
	static {
		accessControls.put("User", new AccessControl("User Access", "Read Access"));
		accessControls.put("Admin", new AccessControl("Admin Access", "Read+Write Access"));
	}
	
	public static AccessControl getAccessControlInstance(String controlType) {
		if(controlType != null && accessControls.containsKey(controlType)) {
			try {
				return accessControls.get(controlType).clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Invalid controlTYpe");
	}

}
