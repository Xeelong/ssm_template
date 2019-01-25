/**
 * 使用ajax请求数据，并构造表格
 * 
 * @returns
 */
function toAjax() {
	$(".tbody").empty();
	$.post("test/form", {}, function(param) {
		$.each(param.returnData.data, function(index, item) {// 第一个参数是当前索引，第二个是对象
			var td_id = $("<td>" + item.id + "</td>");
			var td_name = $("<td>" + item.name + "</td>");
			var tr = $("<tr></tr>").append(td_id).append(td_name).appendTo(
					".tbody");
		})
	});
	/*
	 * $.ajax({ url : "test/form", type : "POST", data : { data : name },
	 * success : function() { alert("aa"); }, })
	 */
}
