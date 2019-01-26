/**
 * 查询数据，渲染页面
 * <!-- 添加数据 -->
				<!-- <input type="text" class="inputText" placeholder="向数据库添加数据" maxlength="10" />
                    <a class="btn"> <span class="icon-ssm icon-new"></span> </a> -->
				<!-- 删除或修改数据 -->
				<!-- <a class="showFont">啊啊啊啊啊啊啊啊啊啊</a>
                    <a class="btn"><span class="icon-ssm icon-xiugai"></span></a>
                    <a class="btn"><span class="icon-ssm icon-shanchu"></span></a> -->
				<!-- 修改数据 -->
				<div class="inputBox">
					<input type="text" class="inputText" placeholder="修改数据"
						maxlength="10" /> <a class="btn"> <span
						class="icon-ssm icon-icon--yes"></span></a>
				</div>
 * @returns
 */
function initPage() {
	$.post("init/select", function(param) {
		var data = param.returnData.data;
		if( data !== null){
			var showBox = $("<a>"+data.initContent+"</a>").addClass("showFont");
			var showBtn1 = $("<a></a>").addClass("btn");
			var showBtn2 = $("<a></a>").addClass("btn");
			var icon1 = $("<span></span>").addClass("icon-ssm icon-xiugai").appendTo(showBtn1);
			var icon2 = $("<span></span>").addClass("icon-ssm icon-shanchu").appendTo(showBtn2);
			$(".inputBox").append(showBox).append(showBtn1).append(showBtn2)
		}
	});
}
