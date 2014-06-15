package com.yar9.learn.fake;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yar9.learn.model.District;
import com.yar9.learn.model.Street;

public class StreetService {
	@SuppressWarnings("serial")
	Map<Integer, List<Street> > dist = new HashMap<Integer, List<Street> > () {{
		put(21, new ArrayList<Street>(){{
			      add(new Street(1, "����·"));
			      add(new Street(2, "����·"));
		        }});
		put(10, new ArrayList <Street>(){{
			      add(new Street(1, "���Ϻ�·"));
			      add(new Street(2, "�ʹ�·"));
			      add(new Street(4, "����·"));
		        }});
		put(521, new ArrayList<Street>(){{
		      add(new Street(1, "����·"));
		      add(new Street(2, "�Ǻ���"));
	        }});
	}};

	public List<Street> getAllStreet(District district) {
		int distId = district.getId();
		return dist.get(distId);

//		return null;
	}

}
