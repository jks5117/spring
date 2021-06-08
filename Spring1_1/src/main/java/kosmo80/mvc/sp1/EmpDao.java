package kosmo80.mvc.sp1;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

import com.vo.EmpVO;

public class EmpDao {
	Logger logger = Logger.getLogger(EmpDao.class);
	//@Autowired
	private SqlSessionTemplate sqlSessionTemplate = null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public List<Map<String, Object>> getEmpList() {
		logger.info("getEmpList 호출 성공");
		List<Map<String, Object>> empList = null;
		EmpVO eVO = new EmpVO();
		empList = sqlSessionTemplate.selectList("getEmpList",eVO);
		return empList;
	}
}
