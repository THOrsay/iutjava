package edu.iut.app;

import java.util.ArrayList;
import java.util.LinkedList;

public class Agenda extends ArrayList<ExamEvent> /* EX2: COLLECTION d'ExamEvent */ {
	
	public Agenda() {
		
		
		
	}
	
	ArrayList agenda = new ArrayList();
	
	
	
	public void addCheckedEvent(ExamEvent examEvent, Agenda a) {
		this.add(examEvent);
	}
	
}