package com.rts;



import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rts.evaluation.model.Tourism;
import com.rts.evaluation.repository.TourismDAO;

@SpringBootTest
class SbTourismApplicationTests {

	@Autowired
	static TourismDAO dao;
	Tourism bean = new Tourism(1, "Barath", "Matthew", 21, "Tenkasi");
	
//	@Test
//	void contextLoads() {
//	}
	
	@Test
	public void testPerformInsert(){
		dao = new TourismDAO();
		boolean result = dao.insert(bean);
		assertEquals(result,true);
	}

}
