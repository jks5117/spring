package web.mvc;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class Board41Logic {
	Logger logger = Logger.getLogger(Board41Logic.class);
	int imsi = 1;
	private Board41MDao boardMDao = null;
	public void setBoardMDao(Board41MDao boardMDao) {
		this.boardMDao = boardMDao;
	}
	private Board41SDao boardSDao = null;
	public void setBoardSDao(Board41SDao boardSDao) {
		this.boardSDao = boardSDao;
	}
	
	public List<Map<String,Object>> getBoardList(Map<String, Object> pmap) {
		logger.info("getBoardList 호출 성공");
		List<Map<String,Object>> boardList = null;
		String gubun = null;
		if(pmap.get("gubun") !=null) {
			gubun = pmap.get("gubun").toString();
		}
		if(gubun!=null && "detail".equals(gubun)) {
			int bm_no = 0;
			bm_no = Integer.parseInt(pmap.get("bm_no").toString());
			boardMDao.hitCount(bm_no);
		}
		boardList = boardMDao.getBoardList(pmap);
		return boardList;
	}
	//=>board/boardInsert.sp4?bm_no=100&bm_title=%EC%96%B5&bs_file=a.txt&bm_writer=%EC%9D%B4%EC%88%9C%EC%8B%A0&bm_email=test@hot.com&bm_content=%EC%97%B0%EC%8A%B5&bm_pw=123
	public int boardInsert(Map<String, Object> pmap) {
		logger.info("boardInsert 호출 성공");
		int result = 0;
		int bm_no = 0;
		int bm_group = 0;
		if (pmap.get("bm_no")==null){//read.jsp 눌렀다 
			bm_no = boardMDao.getBmNo();
			pmap.put("bm_no", bm_no);
		}
		if (pmap.get("bm_group")!=null){//read.jsp 눌렀다 
			bm_group = Integer.parseInt(pmap.get("bm_group").toString());
		}
		if(bm_group > 0) {
			boardMDao.bmStepUpdate(pmap);//조건에 맞지 않으면 처리가 생략 될 수 있다.
			pmap.put("bm_pos",Integer.parseInt(pmap.get("bm_pos").toString())+1);
			pmap.put("bm_step",Integer.parseInt(pmap.get("bm_step").toString())+1);
		}
		//너 새글이구나
		else {
			bm_group = boardMDao.getBmGroup();//새로운 그룹번호를 채번하는 자리
			pmap.put("bm_group", bm_group);
			pmap.put("bm_pos",0);
			pmap.put("bm_step",0);
		}
		//첨부파일이 있어?
		if((pmap.get("bs_file")!=null)&&(pmap.get("bs_file").toString().length() > 0)) {
			logger.info("첨부파일 로직 경유");
			//pmap.put("bm_no", bm_no);
			pmap.put("bs_seq", 1);
			boardSDao.boardSInsert(pmap);
		}
		
		boardMDao.boardMInsert(pmap);
		result = 1;
		return result;
	}
	public int boardDelete(Map<String, Object> pmap) {
		logger.info("boardDelete 호출 성공");
		int result = 0;
		int mresult = 0;
		int sresult = 0;
		sresult = boardSDao.boardSDelete(pmap);
		mresult = boardMDao.boardMDelete(pmap);
		
		if(mresult==sresult) {
			result=1;
		}
		else{
			result=0;
		}
		return result;
	}
	public int boardUpdate(Map<String, Object> pmap) {
		logger.info("boardUpdate 호출 성공");
		int result = 0;
		int mresult = 0;
		int sresult = 0;
		int nofile = 1;
		
		mresult = boardMDao.boardMUpdate(pmap);
		sresult = boardSDao.boardSUpdate(pmap);
		if(mresult == sresult) {
			result = 1;
		}
		logger.info(result);
		return result;
	}
	
	
	//로직
	public List<Map<String,Object>> getBmNoo(Map<String,Object> target) {
		logger.info("boardUpdate 호출 성공");
		List<Map<String,Object>> result = null;
		result = boardMDao.getBmNoo(target);
		logger.info(" boardUpdate로직 : " +result);
		return result;
	}
}