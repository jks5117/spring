package web.mvc;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class Board41Logic {
	Logger logger = Logger.getLogger(Board41Logic.class);
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
		boardList = boardMDao.getBoardList(pmap);
		return boardList;
	}
	//=>board/boardInsert.sp4?bm_no=100&bm_title=%EC%96%B5&bs_file=a.txt&bm_writer=%EC%9D%B4%EC%88%9C%EC%8B%A0&bm_email=test@hot.com&bm_content=%EC%97%B0%EC%8A%B5&bm_pw=123
	public int boardInsert(Map<String, Object> pmap) {
		logger.info("boardInsert 호출 성공");
		int result = 0;
		int bm_no = 0;
		int bm_group = 0;
		if (pmap.get("bm_group")!=null){//read.jsp 눌렀다 
			bm_group = Integer.parseInt(pmap.get("bm_group").toString());
			logger.info("33번행 bm_group : "+bm_group);
		}
		if(bm_group > 0) {
			boardMDao.bmStepUpdate(pmap);//조건에 맞지 않으면 처리가 생략 될 수 있다.
			pmap.put("bm_pos",Integer.parseInt(pmap.get("bm_pos").toString())+1);
			logger.info("bm_pos : "+Integer.parseInt(pmap.get("bm_pos").toString())+1);
			pmap.put("bm_step",Integer.parseInt(pmap.get("bm_step").toString())+1);
			logger.info("bm_step : "+Integer.parseInt(pmap.get("bm_step").toString())+1);
		}
		//너 새글이구나
		else {
			bm_group = boardMDao.getBmGroup();//새로운 그룹번호를 채번하는 자리
			logger.info("43번행 bm_group : "+bm_group);//4
			pmap.put("bm_group", bm_group);
			pmap.put("bm_pos",0);
			pmap.put("bm_step",0);
		}
		//첨부파일이 있어?
		if((pmap.get("bm_pos")!=null)&(pmap.get("bm_pos").toString().length() > 0)) {
			pmap.put("bm_no", bm_no);
			pmap.put("bm_seq", 1);
			boardSDao.boardSInsert(pmap);
		}
		boardMDao.boardMInsert(pmap);
		result = 1;
		return result;
	}

}
