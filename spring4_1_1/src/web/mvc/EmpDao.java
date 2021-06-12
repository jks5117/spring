package web.mvc;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

import com.vo.BoardMVO;

public class EmpDao {
	Logger logger = Logger.getLogger(EmpDao.class);
	private SqlSessionTemplate sqlSessionTemplate = null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	public List<Map<String, Object>> getEmpList(Map<String, Object> pmap) {
		List<Map<String, Object>> empList = null;
		//List<BoardMVO> boardList2 = null;
		empList = sqlSessionTemplate.selectList("getEmpList",pmap);
		/*
		boardList2 = sqlSessionTemplate.selectList("getBoardMap",pmap);
		for(BoardMVO bmvo:boardList2) {
			logger.info("bmvo : "+bmvo);
			logger.info("bmvo : "+bmvo.getBm_title());
			logger.info("bmvo : "+bmvo.getBsVO().getBs_seq());
			logger.info("bmvo : "+bmvo.getBs_file());
		}
		*/
		return empList;
	}

}
