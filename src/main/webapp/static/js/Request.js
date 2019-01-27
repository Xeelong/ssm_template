/**
 * 查询数据，渲染页面
 */
function initPage() {
	$.post("init/select", function(param) {
		var data = param.returnData.data;
		if (data !== null) {
			$(".inputBox").empty();
			$.cookie("value", data.initContent)
			// 删除或修改数据
			var showBox = $("<a>" + data.initContent + "</a>").addClass(
					"showFont");
			// 修改按钮
			var showBtn1 = $("<a></a>").addClass("btn").attr("onClick",
					"updData()").attr("title","修改");
			// 删除按钮
			var showBtn2 = $("<a></a>").addClass("btn")
					.attr("id", "delete_btn").attr("title","删除").attr("onClick","remove()");
			var icon1 = $("<span></span>").addClass("icon-ssm icon-xiugai")
					.appendTo(showBtn1);
			var icon2 = $("<span></span>").addClass("icon-ssm icon-shanchu")
					.appendTo(showBtn2);
			$(".inputBox").append(showBox).append(showBtn1).append(showBtn2)
		} else {
			insert();
		}
	});
}

/**
 * 修改数据
 */
function updData() {
	$(".inputBox").empty();
	var updBox = $("<input />").attr("type", "text")
			.attr("placeholder", "修改数据").attr("maxlength", "20").addClass(
					"inputText").attr("value", $.cookie("value"));
	var updBtn1 = $("<a></a>").addClass("btn").attr("onClick", "updNow()").attr("title","提交修改");
	var updBtn2 = $("<a></a>").addClass("btn").attr("onClick", "updBack()").attr("title","返回");
	var icon1 = $("<span></span>").addClass("icon-ssm icon-icon--yes")
			.appendTo(updBtn1);
	var icon2 = $("<span></span>").addClass("icon-ssm icon-fanhui").appendTo(
			updBtn2);
	$(".inputBox").append(updBox).append(updBtn1).append(updBtn2)
}

/**
 * 确认修改
 */
function updNow() {
	var value = $(".inputText").val();
	$.post("init/updata", {
		value : value
	}, function(param) {
		if (param.returnData.data === 1) {
			alert(param.msg);
			updBack();
		} else {
			alert("修改失败，请检查代码后重试");
		}
	})
}
/**
 * 取消修改
 */
function updBack() {
	window.location.reload();
}

/**
 * 添加数据
 */
function insert() {
	var insertBox = $("<input />").attr("type", "text").attr("placeholder",
			"添加数据").attr("maxlength", "20").addClass("inputText")
	var javaBox = $("<a></a>").addClass("btn_sp");
	var insertBtn = $("<a></a>").addClass("btn").attr("title", "添加").attr(
			"onClick", "insertNow()");
	var icon1 = $("<span></span>").addClass("icon-ssm icon-java").appendTo(
			javaBox);
	var icon2 = $("<span></span>").addClass("icon-ssm icon-new").appendTo(
			insertBtn);
	$(".inputBox").append(insertBox).append(javaBox).append(insertBtn);
}
/**
 * 添加
 */
function insertNow() {
	var value = $(".inputText").val();
	if(value==""){
		alert("请输入要添加的内容");
		return false;
	}
	$.post("init/insert", {
		value : value
	}, function(param) {
		if(param.returnData.data===1){
			alert(param.msg);
			updBack();
		}else{
			alert("添加失败，请检查代码后重试");
		}
	})
}
/**
 * 删除
 */
function remove(){
	$.post("init/remove",function(param){
		if(param.returnData.data===1){
			alert(param.msg);
			updBack();
		}else{
			alert("删除失败，请检查代码后重试");
		}
	})
}
