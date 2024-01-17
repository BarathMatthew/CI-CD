package com.rts.evaluation.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rts.evaluation.model.Tourism;

@Repository
public class TourismDAO {

	static List<Tourism> list;
	
	public static boolean insert(Tourism bean) {
		list = new ArrayList<Tourism>();
		list.add(bean);
		return true;
	}
	
	public static List<Tourism> view(){
		return list;
	}
}
