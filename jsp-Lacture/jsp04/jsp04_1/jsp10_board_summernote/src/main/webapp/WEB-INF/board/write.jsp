<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<main>
<form class="form" action="../board/writeProcess" method="POST">
<table class="board">
<colgroup>
<col style="width:20%">
<col style="width:80%">
</colgroup>
<tbody>
<tr>
<th>이름</th>
<td><input type="text" name="userName"></td>
</tr>
<tr>
<th>내용</th>
<td><textarea name="contents" id="summernote"></textarea></td>
</tr>
</tbody>
</table>
<div class="btns">
<button class="btn confirm">확인</button>
<button class="btn reset">취소</button>
</div>
</form>
</main>
<script>
$("#summernote").summernote({
	height:300,
	callbacks:{
		onImageUpload:function(files) {
			console.log("이미지 첨부 됨");
			console.log(files);
			for(let i=0;i<files.length;i++) {
				uploadImage(file[i],this);
			}
		}
	}
})
function uploadImage(file, editor){
	const sendData = new FormData();
	sendData.append("uploadFile",file);
	$.ajax({
		url:"../board/summernoteFileUpload",
		type:"POST",
		data:sendData,
		contentType:false,
		processData:false,
		success:function(response){
			console.log(response);
			$(editor).summernote("editor.insertImage",response.fileUrl);
		},
		error:function(){
			console.log("파일 업로드 실패");
		}
	})
}
</script>
<%@ include file="../include/footer.jsp"%>