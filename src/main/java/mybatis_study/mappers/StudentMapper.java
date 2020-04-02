package mybatis_study.mappers;

import java.util.List;
import java.util.Map;

import mybatis_study.dto.Student;

public interface StudentMapper {
	// typeHandelr를 사용함
	Student selectStudentByNo(Student student);

	// typeHandelr를 사용하지 않음
	Student selectStudentByNoWithResultMap(Student student);

	List<Student> selectStudentByAll();

	int insertStudent(Student student);

	int insertStudentAutoInc(Student student);

	int deleteStudent(int id);

	int updateStudent(Student student);

	// ResultMap
	List<Student> selectStudentByAllForResultMap();
	
	//hashMap
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	//내포된 결과매핑(ResultMap)을 사용한 일대일 매핑 
	Student selectStudentByNoAssociation(Student student);
}
