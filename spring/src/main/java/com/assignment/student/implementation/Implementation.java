package com.assignment.student.implementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.student.model.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class Implementation {
  public List<Student> getAll(){
	  float total = 0;
	  try {
			ObjectMapper mapper=new ObjectMapper();
			InputStream inputStream=new FileInputStream(new File("/Users/vaishnavi/OneDrive/Desktop/Workassignment1/student.json"));
			TypeReference<List<Student>> typeReference=new TypeReference<List<Student>>() {};
			List<Student> students=mapper.readValue(inputStream, typeReference);
			for (Student s : students) {
				total = s.getMark1() + s.getMark2() + s.getMark3();
				s.setTotal((int) total);
				if (total >= 250)
					s.setGrade("A");
				else if (total >= 200)
					s.setGrade("B");
				else if (total >= 150)
					s.setGrade("C");
				
				else
					s.setGrade("Fail");
				System.out.println("RollNumber:: " + s.getRollnumber() + "\nName:: " + s.getName() + "\nMark1:: "
						+ s.getMark1() + "\nMark2:: " + s.getMark2() + "\nMark3:: " + s.getMark3() + "\nTotal:: "
						+ s.getTotal() + "\nGrade:: " + s.getGrade());
				
			}
			inputStream.close();
			return students;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  return new ArrayList<Student>();
  }
}
