package com.assignment.student;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		
		/*try {
			ObjectMapper mapper=new ObjectMapper();
			InputStream inputStream=new FileInputStream(new File("/Users/vaishnavi/OneDrive/Desktop/Workassignment1/student.json"));
			TypeReference<List<Student>> typeReference=new TypeReference<List<Student>>() {};
			List<Student> students=mapper.readValue(inputStream, typeReference);
			for(Student s:students) {
				System.out.println("name is "+s.getName()+"bearing roll "+s.getRollnumber());
			}
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
		}*/
	}

}
