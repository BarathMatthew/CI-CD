package com.rts.evaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rts.evaluation.model.Tourism;
import com.rts.evaluation.repository.TourismDAO;

@RestController
public class TourismController {

	@Autowired
	TourismDAO dao;
	
	public void performInsert(Tourism bean) {
		dao.insert(bean);
		System.out.println("Inserted");
		List<Tourism> list = dao.view();
		System.out.println(list);
	}
}
