package edu.iut.app;

import java.util.ArrayList;
import java.util.Date;

public class ExamEvent {
	public ExamEvent() {		
	}
	
	public ExamEvent(Date date, Person person, ArrayList<Person> jury,
					Classroom classRoom, ArrayList<Document> document) {
		
	}
	
	/** EX2: FAITES LES ACCESSEURS DES ATTRIBUTS, AJOUTER DES ATTRIBUTS **/
	protected Date examDate;
	protected Person student;
	protected ArrayList<Person> jury;
	protected Classroom classroom;
	protected ArrayList<Document> documents;
	
	public Date getExamDate() {
		return examDate;
	}

	public Person getStudent() {
		return student;
	}

	public ArrayList<Person> getJury() {
		return jury;
	 
		}

	public Classroom getClassroom() {
		return classroom;
		
	
	}

	public ArrayList<Document> getDocuments() {
		return documents;
	}
	
	public void add(ExamEvent e){

		
		
	}

	 
}



















/* 

Combien �a fait 1+1 ? 2 ? Non, 1. Tu vois toi et moi on parle �a fait 1. Alors oui dans notre monde 1+1=2
2+2=4, mais c'est parce qu'on est selfish, on veut du pognon. Mais peut �tre que dans un autre
monde 1+1=11, et �a c'est beau

*/