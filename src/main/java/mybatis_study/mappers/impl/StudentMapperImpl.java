package mybatis_study.mappers.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import mybatis_study.dto.Student;
import mybatis_study.mappers.StudentMapper;

public class StudentMapperImpl implements StudentMapper {
	private static final StudentMapperImpl instance = new StudentMapperImpl();

	private final String namespace = "mybatis_study.mappers.StudentMapper";
	private SqlSession sqlSession;

	private StudentMapperImpl() {
	}

	public static StudentMapperImpl getInstance() {
		return instance;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Student selectStudentByNo(Student student) {
		return sqlSession.selectOne(namespace + ".selectStudentbyNo", student);
	}

	@Override
	public Student selectStudentByNoWithResultMap(Student student) {
		return sqlSession.selectOne(namespace + ".selectStudentByNoWithResultMap", student);
	}

	@Override
	public List<Student> selectStudentByAll() {
		return sqlSession.selectList(namespace + ".selectStudentByAll");
	}

	@Override
	public int insertStudent(Student student) {
		int res = sqlSession.insert(namespace + ".insertStudent", student);
		sqlSession.commit();
		return res;
	}

	@Override
	public int insertStudentAutoInc(Student student) {
		int res = sqlSession.insert(namespace + ".insertStudentAutoInc", student);
		sqlSession.commit();
		return res;
	}

	@Override
	public int deleteStudent(int id) {
		int res = sqlSession.delete(namespace + ".deleteStudent", id);
		sqlSession.commit();
		return res;
	}

	@Override
	public int updateStudent(Student student) {
		int res = sqlSession.update(namespace + ".updateStudent", student);
		sqlSession.commit();
		return res;
	}

	@Override
	public List<Student> selectStudentByAllForResultMap() {
		return sqlSession.selectList(namespace + ".selectStudentByAllForResultMap");
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		return sqlSession.selectList(namespace + ".selectStudentByAllForHashMap");
	}

	@Override
	public Student selectStudentByNoAssociation(Student student) {
		return sqlSession.selectOne(namespace + ".selectStudentByNoAssociation", student);
	}
}
