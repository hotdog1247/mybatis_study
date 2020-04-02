package mybatis_study.mappers.impl;

import org.apache.ibatis.session.SqlSession;

import mybatis_study.dto.Tutor;
import mybatis_study.mappers.TutorMapper;

public class TutorMapperImpl implements TutorMapper {
	private static final TutorMapperImpl instance = new TutorMapperImpl();

	private final String namespace = "mybatis_study.mappers.TutorMapper";
	private SqlSession sqlSession;

	private TutorMapperImpl() {
	}

	public static TutorMapperImpl getInstance() {
		return instance;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Tutor selectTutorByTutorId(Tutor tutor) {
		return sqlSession.selectOne(namespace + ".selectTutorBytutorId" + tutor);
	}

}
