package com.yar9.learn;

import java.util.ArrayList;
import java.util.List;

public class DistrictService {
	@SuppressWarnings("serial")
	List<District> dist = new ArrayList<District>() {{
		add(new District(21, "�Ϻ�"));
		add(new District(10, "����"));
		add(new District(521, "����"));
	}};

	public List<District> getAllDistrict() {
		
		return dist;
	}

}
