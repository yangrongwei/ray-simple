package com.yar9.learn.fake;

import java.util.ArrayList;
import java.util.List;

import com.yar9.learn.model.District;

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
