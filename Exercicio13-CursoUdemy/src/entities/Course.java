package entities;

import java.util.LinkedHashSet;
import java.util.Set;

public class Course {

	private int idCourse;
	
	private Set<Integer> students = new LinkedHashSet<>();

	public Course(int idCourse) {
		this.idCourse = idCourse;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public Set<Integer> getAlunos() {
		return students;
	}

	public void addAlunos(Integer aluno) {
		students.add(aluno);
	}
}
