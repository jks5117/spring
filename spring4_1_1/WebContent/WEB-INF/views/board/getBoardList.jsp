<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
	StringBuilder path = new StringBuilder(request.getContextPath());
	path.append("/");
	List<Map<String, Object>> boardList = null;
	boardList = (List<Map<String, Object>>) request.getAttribute("boardList");
	int size = 0;
	if (boardList != null) {
		size = boardList.size();
	}
	out.print("size:" + size);
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 목록[WEB-INF]</title>
	<!-- jEasyUI 시작 -->
	<link rel="stylesheet" type="text/css" href="<%=path.toString()%>themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=path.toString()%>themes/icon.css">
	<!-- jEasyUI JS 시작 -->
	<script type="text/javascript" src="<%=path.toString()%>js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=path.toString()%>js/jquery.easyui.min.js"></script>
	<script type="text/javascript">

	$(document).ready(function() {
		$('#dg_board').datagrid({
			columns : [[ 
				{field:'BM_NO',title:'글번호',width:100,align:'center'}, 
				{field:'BM_TITLE',title:'제목',width:300,align:'left'}, 
				{field:'BM_DATE',title:'작성일',width:200,align:'center'}, 
				{field:'BS_FILE',title:'첨부파일',width:200,align:'center'}, 
				{field:'BM_HIT',title:'조회수',width:100,align:'center'}
			]]
		});
	
		$('#btn_sel').bind('click', function(){
		    boardSel();
		});
		$('#btn_ins').bind('click', function(){
		    boardIns();
		});
		$('#btn_upd').bind('click', function(){
		    boardUpd();
		});
		$('#btn_del').bind('click', function(){
		    boardDel();
		});
	});
	</script>
</head>
<body>
<script>
function boardSel() {
	$('#dg_board').datagrid({
		url : './getBoardList.sp4',
		onLoadSuccess : function() {
			console.log('성공');
		}
	});
}
function boardIns(){
	$('#dlg_ins').dialog('open')
	
}
function boardUpd(){
	
}
function boardDel(){
	
}
function register(){
	console.log('테스트');
	const title = document.getElementById('title').value;
	const content = document.getElementById('content').value;
	const writer = document.getElementById('writer').value;
	const file = document.getElementById('file').value;
	const email = document.getElementById('email').value;
	const pw = document.getElementById('pw').value;
	location.href="boardInsert.sp4?bm_title="+title+"&bs_file="+file+"&bm_writer="+writer+"&bm_email="+email+"&bm_content="+content+"&bm_pw="+pw;
}
</script>
	<table id="dg_board" class="easyui-datagrid" data-options="title:'게시판',toolbar:'#tb_board'" style="width: 1000px; height: 350px">
<!-- 		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>첨부파일</th>
				<th>조회수</th>
			</tr>
		</thead> -->
		<tbody>
<%
//조회 결과가 없는거야?
if (size == 0) {
%>
			<tr>
				<th colspan="5">조회결과가 없습니다.</th>
			</tr>
<%
} 
else {//조회 결과가 있는데...
for (int i = 0; i < size; i++) {
	Map<String, Object> rmap = boardList.get(i);
	if (i == size)
		break;
%>
			<tr>
				<td><%=rmap.get("BM_NO")%></td>
				<td><a href="getBoardDetail.sp4?bm_no=<%=rmap.get("BM_NO")%>"><%=rmap.get("BM_TITLE")%></a></td>
				<td><%=rmap.get("BM_DATE")%></td>
				<td><%=rmap.get("BS_FILE")%></td>
				<td><%=rmap.get("BM_HIT")%></td>
			</tr>
<%
	} ///////////end of for
} ///////////////end of else
%>
		</tbody>
	</table>
		<div id="tb_board" style="padding: 2px 5px;">
			<a id="btn_sel" href="#" class="easyui-linkbutton" iconCls="icon-search" plain="true">조회</a> 
			<a id="btn_ins" href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true">입력</a> 
			<a id="btn_upd" href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true">수정</a> 
			<!-- <a id="btn_del" href="#" class="easyui-linkbutton" iconCls="icon-cancel" plain="true">삭제</a> -->
		</div>
		<!--=========================== [[글쓰기 화면 시작]] =============================-->
	    <div id="dlg_ins" class="easyui-dialog" title="글쓰기" data-options="iconCls:'icon-save', closed:'true'" style="width:650px;height:650px;padding:10px">
		<form>
			<div style="margin-bottom: 20px">
				<input type="text" id="title" class="easyui-textbox" label="제목"
					labelPosition="top" style="width:60%;">
			</div>
			<div style="margin-bottom: 20px">
				<input type="text" id="content" class="easyui-textbox" label="내용"
					labelPosition="top" style="width: 100%;height:120px;">
			</div>
			<div style="margin-bottom: 20px">
				<input type="text" id="writer" class="easyui-textbox" label="작성자"
					labelPosition="top" style="width:30%;">
			</div>
			<div style="margin-bottom: 20px">
				<input type="text" id="file" class="easyui-textbox" label="첨부파일"
					labelPosition="top" style="width: 100%;">
			</div>
			<div style="margin-bottom: 20px">
				<input type="text" id="email" class="easyui-textbox" label="이메일"
					labelPosition="top" style="width: 40%;">
			</div>
			<div style="margin-bottom: 20px">
				<input type="password" id="pw" class="easyui-textbox" label="비밀번호"
					labelPosition="top" style="width: 20%;">
			</div>
			<div>
				<a href="javascript:register()" class="easyui-linkbutton"
					iconCls="icon-ok" style="width: 100%; height: 32px">등록</a>
			</div>
		</form>
		<!--=========================== [[글쓰기 화면   끝 ]] =============================-->
</body>
</html>