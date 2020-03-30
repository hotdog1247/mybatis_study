package mybatis_study.jdbc;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

public class MYbatisSqlSessionFactoryTest {
	protected static final Log log = LogFactory.getLog(MYbatisSqlSessionFactoryTest.class);

	@Test
	public void testOpenSession() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		SqlSession session = MYbatisSqlSessionFactory.openSession();
		log.debug("session " + session);
		Assert.assertNotNull(session);
	}

}
