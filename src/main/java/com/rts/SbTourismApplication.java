package com.rts;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rts.evaluation.controller.TourismController;
import com.rts.evaluation.model.Tourism;
import com.rts.evaluation.repository.TourismDAO;

@SpringBootApplication
public class SbTourismApplication {

	static TourismDAO dao = new TourismDAO();
	public Tourism customer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter custId firstName lastName age city");
		
		return new Tourism(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next());
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SbTourismApplication.class, args);
		SbTourismApplication obj = new SbTourismApplication();
		
		Tourism bean = obj.customer();
		
		TourismController control = new TourismController();
		control.performInsert(bean);
	}

}
