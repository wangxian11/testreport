<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>卸船错误信息列表</title>
	<%
		pageContext.setAttribute("APP_PATH", request.getContextPath());
	%>
	<script type="text/javascript" src="${APP_PATH }/static/js/jquery-3.4.1.min.js"></script>
	<link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<!-- 基本信息修改的模态框 -->
<div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">基本信息修改</h4>
      </div>
      <div class="modal-body">
      
      	<form class="form-horizontal">
      		<div class="form-group">
		    	<label class="col-sm-2 control-label">identifyBoxNumber</label>
		    	<div class="col-sm-10">
		      	<input type="text" name="identifyBoxNumber"  class="form-control" id="identifyBoxNumber_update_input" placeholder="identifyBoxNumber">
		      	<span class="help-block"></span>
		    	</div>
		  	</div>
		  <!-- <div class="form-group">
		    <label class="col-sm-2 control-label">identifyBoxNumber</label>
		    <div class="col-sm-10">
		      <p class="form-control-static" id="identifyBoxNumber_update_static"></p>
		    </div>
		  </div> -->
		  <div class="form-group">
		    <label class="col-sm-2 control-label">actualBoxNumber</label>
		    <div class="col-sm-10">
		      <input type="text" name="actualBoxNumber"  class="form-control" id="actualBoxNumber_update_input" placeholder="actualBoxNumber">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">identifyVehicleNumber</label>
		    <div class="col-sm-10">
		      <input type="text" name="identifyVehicleNumber"  class="form-control" id="identifyVehicleNumber_update_input" placeholder="identifyVehicleNumber">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">actualVehicleNumber</label>
		    <div class="col-sm-10">
		      <input type="text" name="actualVehicleNumber"  class="form-control" id="actualVehicleNumber_update_input" placeholder="actualVehicleNumber">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">identifyLocation</label>
		    <div class="col-sm-10">
		      <input type="text" name="identifyLocation"  class="form-control" id="identifyLocation_update_input" placeholder="identifyLocation">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">actualLocation</label>
		    <div class="col-sm-10">
		      <input type="text" name="actualLocation"  class="form-control" id="actualLocation_update_input" placeholder="actualLocation">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">remarks</label>
		    <div class="col-sm-10">
		      <input type="text" name="remarks"  class="form-control" id="remarks_update_input" placeholder="remarks">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">shipBridge</label>
		    <div class="col-sm-10">
		      <input type="text" name="shipBridge"  class="form-control" id="shipBridge_update_input" placeholder="shipBridge">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">tallyMan</label>
		    <div class="col-sm-10">
		      <input type="text" name="tallyMan"  class="form-control" id="tallyMan_update_input" placeholder="tallyMan">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <!-- <div class="form-group">
		    <label class="col-sm-2 control-label">gender</label>
		    <div class="col-sm-10">
		      <label class="radio-inline">
				  <input type="radio" name="gender" id="gender1_update_input" value="M" checked="checked"> 男
				</label>
				<label class="radio-inline">
				  <input type="radio" name="gender" id="gender2_update_input" value="F"> 女
				</label>
		    </div>
		  </div> -->
		  <!-- <div class="form-group">
		    <label class="col-sm-2 control-label">gender</label>
		    <div class="col-sm-4">
		      部门提交部门Id即可
		      <select class="form-control" name="dId"></select>
		    </div>
		   </div> -->
		  
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="emp_update_btn">更新</button>
      </div>
    </div>
  </div>
</div>


<!-- 基本信息添加的模态框 -->
<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">基本信息添加</h4>
      </div>
      <div class="modal-body">
      
      	<form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">日期</label>
		    <div class="col-sm-10">
		      <input type="text" name="testDate" class="form-control" id="empName_add_input" placeholder="testDate">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  
		  <div class="form-group">
			<label class="col-sm-2 control-label" for="weather">天气</label>
			<div class="col-sm-10">
				<select name="weather" class="form-control">
					<option value="0">晴天</option>
					<option value="1">阴天</option>
					<option value="2">雨天</option>
				</select>
			</div>
		 </div>	
		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">班别</label>
		    <div class="col-sm-10">
		      <input type="text" name="classes" class="form-control" placeholder="classes">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">岸桥</label>
		    <div class="col-sm-10">
		      <input type="text" name="shoreBridge" class="form-control" placeholder="shoreBridge">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  
		  <div class="form-group">
			<label class="col-sm-2 control-label" for="shipType">大船/驳船</label>
			<div class="col-sm-10">
				<select name="shipType" class="form-control">
					<option value="0">大船</option>
					<option value="1">驳船</option>
				</select>
			</div>
		 </div>	
		  
		  <div class="form-group">
		    <label class="col-sm-2 control-label">测试情况</label>
		    <div class="col-sm-10">
		      <input type="text" name="testSituation" class="form-control" placeholder="testSituation">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
			<label class="col-sm-2 control-label" for="loadOrDischarge">装/卸</label>
			<div class="col-sm-10">
				<select name="loadOrDischarge" class="form-control">
					<option value="0">装船</option>
					<option value="1">卸船</option>
				</select>
			</div>
		 </div>	
		  
		  <div class="form-group">
			<label class="col-sm-2 control-label" for="typesOfTrade">内/外</label>
			<div class="col-sm-10">
				<select name="typesOfTrade" class="form-control">
					<option value="0">内贸</option>
					<option value="1">外贸</option>
				</select>
			</div>
		 </div>	
		 <div class="form-group">
		    <label class="col-sm-2 control-label">船名</label>
		    <div class="col-sm-10">
		      <input type="text" name="nameOfVessel" class="form-control"  placeholder="nameOfVessel">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">航次</label>
		    <div class="col-sm-10">
		      <input type="text" name="voyageNumber" class="form-control"  placeholder="voyageNumber">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">时间</label>
		    <div class="col-sm-10">
		      <input type="text" name="time" class="form-control" placeholder="time">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">测试员</label>
		    <div class="col-sm-10">
		      <input type="text" name="tester" class="form-control"  placeholder="tester">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">总箱数</label>
		    <div class="col-sm-10">
		      <input type="text" name="totalCases" class="form-control"  placeholder="totalCases">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">总车数</label>
		    <div class="col-sm-10">
		      <input type="text" name="totalTruck" class="form-control"  placeholder="totalTruck">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">车上位置识别总箱数</label>
		    <div class="col-sm-10">
		      <input type="text" name="total_box_on_truck" class="form-control" placeholder="total_box_on_truck">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">bay识别总箱数</label>
		    <div class="col-sm-10">
		      <input type="text" name="bay_identification_cases" class="form-control" placeholder="bay_identification_cases">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <!-- <div class="form-group">
		    <label class="col-sm-2 control-label">dId</label>
		    <div class="col-sm-4">
		      部门提交部门Id即可
		      <select class="form-control" name="dId" id="dept_add_select"></select>
		    </div>
		   </div> -->
		  
	  </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="emp_save_btn">保存</button>
      </div>
    </div>
  </div>
</div>

	<!-- 搭建显示页面 -->
	<div class="container">
		<!--标题  -->
		<div class="row">
			<div class="col-md-12">
				<h1>基本信息列表</h1>
			</div>
		</div>
		<!--按钮  -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary" id="emp_add_modal_btn">新增</button>
				<button class="btn btn-danger" id="emp_delete_all_btn">删除</button>
			</div>
		</div>
		<!--显示表格数据  -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="emps_tables">
					<thead>
						<tr>
							<th>
								<input type="checkbox" id="check_all"/>
							</th>
							<th>ID</th>
							<th>日期</th>
							<th>天气</th>
							<th>班别</th>
							<th>岸桥</th>
							<th>大船/驳船</th>
							<th>测试情况</th>
							<th>装/卸</th>
							<th>内/外贸</th>
							<th>船名</th>
							<th>航次</th>
							<th>时间</th>
							<th>测试员</th>
							<th>总箱数</th>
							<th>总车数</th>
							<th>车上位置识别总箱数</th>
							<th>bay识别总箱数</th>
							
						</tr>
					</thead>
					<tbody>
						
					</tbody>
				</table>
			</div>
		</div>
		<!--显示分页信息  -->
		<div class="row">
			<!-- 分页文字信息 -->
			<div class="col-md-6" id="page_info_area"></div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area"></div>
		</div>
	</div>
	<script type="text/javascript">
	
			var totalRecord,currentPage;
			//1、页面加载完成以后，直接发送一个ajax请求，要到一个分页数据
			$(function(){
				//去首页
				to_page(1);
			})
			
			function to_page(pn){
				$.ajax({
					url:"${APP_PATH}/testReports",
					data:"pn="+pn,
					type:"GET",
					success:function(result){
						
						//1、解析显示信息
						build_emps_table(result);
						//2、解析并显示分页信息
						build_page_info(result);
						//3、解析显示分页条数据
						build_page_nav(result);
					}
				});
			}
			//构建信息
			function build_emps_table(result){
				//清空table表格
				$("#emps_tables tbody").empty();
				var testReports = result.extend.pageInfo.list;
				$.each(testReports,function(index,item){
					var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
					var idTd = $("<td></td>").append(item.id);
					var testDateTd = $("<td></td>").append(item.testDate);
					/* var courseTypeTd = $("<td></td>").append(item.gender=="M"?"必修":"选修"); */
					var weatherTd = $("<td></td>").append(item.weather);
					var classesTd = $("<td></td>").append(item.classes);
					var shoreBridgeTd = $("<td></td>").append(item.shoreBridge);
					var shipTypeTd = $("<td></td>").append(item.shipType);
					var testSituationTd = $("<td></td>").append(item.testSituation)
					var loadOrDischargeTd = $("<td></td>").append(item.loadOrDischarge);
					var typesOfTradeTd = $("<td></td>").append(item.typesOfTrade);
					var nameOfVesselTd = $("<td></td>").append(item.nameOfVessel);
					var voyageNumberlTd = $("<td></td>").append(item.voyageNumber);
					var timeTd = $("<td></td>").append(item.time);
					var testerTd = $("<td></td>").append(item.tester);
					var totalCasesTd = $("<td></td>").append(item.totalCases);
					var totalTruckTd = $("<td></td>").append(item.totalTruck);
					var totalBoxOnTruckTd = $("<td></td>").append(item.totalBoxOnTruck);
					var bayIdentificationCasesTd = $("<td></td>").append(item.bayIdentificationCases);
					var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
									.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
					//为编辑按钮添加一个自定义的属性，来表示当前员工id
					editBtn.attr("edit-id",item.id);
					var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
									.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
					//为编辑按钮添加一个自定义的属性，来表示当前要删除的员工id
					delBtn.attr("del-id",item.id);
					var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
					//append方法执行完成以后还是返回原来的元素
					$("<tr></tr>").append(checkBoxTd)
						.append(idTd)
						.append(testDateTd)
						.append(weatherTd)
						.append(classesTd)
						.append(shoreBridgeTd)
						.append(shipTypeTd)
						.append(testSituationTd)
						.append(loadOrDischargeTd)
						.append(typesOfTradeTd)
						.append(nameOfVesselTd)
						.append(voyageNumberlTd)
						.append(timeTd)
						.append(testerTd)
						.append(totalCasesTd)
						.append(totalTruckTd)
						.append(totalBoxOnTruckTd)
						.append(bayIdentificationCasesTd)
						.append(btnTd)
						.appendTo("#emps_tables");
				});
			}
			//解析显示分页信息
			function build_page_info(result){
				$("#page_info_area").empty();
				$("#page_info_area").append("当前第"+ result.extend.pageInfo.pageNum+"页,总共"+
						result.extend.pageInfo.pages+"页,共"+
						result.extend.pageInfo.total+"条记录");
				totalRecord = result.extend.pageInfo.total;
				currentPage = result.extend.pageInfo.pageNum;
			}
			//解析显示分页条，点击要能去下一页...
			function build_page_nav(result){
				//page_nav_area
				$("#page_nav_area").empty();
				var ul = $("<ul></ul>").addClass("pagination");
				//构建元素
				var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
				var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
				if(result.extend.pageInfo.hasPreviousPage == false){
				    firstPageLi.addClass("disabled");
		            prePageLi.addClass("disabled");
				}else{
					//为元素添加点击翻页的事件
					firstPageLi.click(function(){
						to_page(1);
					});
					prePageLi.click(function(){
						to_page(result.extend.pageInfo.pageNum-1);
					});
				}
				
				var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
				var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
				if(result.extend.pageInfo.hasNextPage == false){
			        nextPageLi.addClass("disabled");
			        lastPageLi.addClass("disabled");
			    }else{
			    	nextPageLi.click(function(){
						to_page(result.extend.pageInfo.pageNum+1);
					});
					lastPageLi.click(function(){
						to_page(result.extend.pageInfo.pages);
					});
			    }
				
				//添加首页和前一页的提示
				ul.append(firstPageLi).append(prePageLi);
				//1,2,3遍历给ul中添加页码提示
				$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
					var numLi = $("<li></li>").append($("<a></a>").append(item));
					if (result.extend.pageInfo.pageNum == item) {
			              numLi.addClass("active");
			        }
					numLi.click(function(){
						to_page(item);
					});
					ul.append(numLi);
				});
				//添加下一页和末页的提示
				ul.append(nextPageLi).append(lastPageLi);
				
				//把ul加入到nav中
				var navEle = $("<nav></nav>").append(ul);
				navEle.appendTo("#page_nav_area");
			}
			//清空表单样式及内容
		    function reset_form(ele){
		        $(ele)[0].reset();
		        //清空表单样式
		        $(ele).find("*").removeClass("has-error has-success");
		        $(ele).find(".help-block").text("");
		    }
			//点击新增按钮弹出模态框
			$("#emp_add_modal_btn").click(function(){
				//清除表单数据（表单重置）
				$("#empAddModal form")[0].reset();//jquerry没有reset方法，reset()是DOM对象的
				//发送ajax请求，查出部门信息，显示在下拉列表中
				/* getDepts("#empAddModal select"); */
				//弹出模态框
				$("#empAddModal").modal({
					backdrop:"static"
				});
			});
			//查出所有部门信息并显示在下拉列表中
			/* function getDepts(ele){
				//清空之前下拉列表的值
				$(ele).empty();
				$.ajax({
					url:"${APP_PATH}/depts",
					type:"GET",
					success:function(result){
						//{"code":100,"msg":"处理成功！",
							//"extend":{"depts":[{"deptId":1,"deptName":"开发部"},{"deptId":2,"deptName":"测试部"}]}}
						//console.log(result);
						//显示部门信息在下拉列表中
						//$("#empAddModal select").append("")
						$.each(result.extend.depts,function(){
							var optionEle = $("<option></option>").append(this.deptName).attr("value",this.deptId);
							optionEle.appendTo(ele);
						});
						
					}
					
				});
			} */
			
			
			  //校验表单数据
		    function validate_add_form(){
		        //1、拿到要校验的数据
		        var tallyMan = $("#tallyMan_add_input").val();
		        var regName = /(^[a-zA-Z0-9_-]{4,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
		        if (!regName.test(tallyMan)) {
		            // alert("用户名为2-5中文或1-16英文数字组合");
		            show_validate_msg("#tallyMan_add_input","error","用户名为2-5中文或4-16英文数字组合");
		            return false;
		        }else {
		            show_validate_msg("#tallyMan_add_input","success","");
		        }
		        return true;
		    }
		
			//显示校验结果的提示信息
			function show_validate_msg(ele,status,msg){
				//清除当前元素的校验状态
				$(ele).parent().removeClass("has-success has-error");
				$(ele).next("span").text("");
				if("success"==status){
					$(ele).parent().addClass("has-success");
					$(ele).next("span").text(msg);
				}else if("error"==status){
					$(ele).parent().addClass("has-error");
					$(ele).next("span").text(msg);
				}
			}
			
			$("#tallyMan_add_input").change(function(){
				//发送ajax请求校验用户是否可用
				var tallyMan = this.value;
				$.ajax({
					url:"${APP_PATH}/checkuserT",
					data:"tallyMan="+tallyMan,
					type:"POST",
					success:function(result){
						if(result.code==100){
							show_validate_msg("#tallyMan_add_input","success","用户名可用");
							$("#emp_save_btn").attr("ajax-va","success");
						}else{
							show_validate_msg("#tallyMan_add_input","error",result.extend.va_msg);
							$("#emp_save_btn").attr("ajax-va","error");
						}
					}
				});
				
			});
			//点击保存，保存员工
			$("#emp_save_btn").click(function(){
				$.ajax({
					url:"${APP_PATH}/testReport",
					type:"POST",
					data:$("#empAddModal form").serialize(),
					success:function(result){
						//alert(result.msg);
						if(result.code==100){
							//员工保存成功
							//1、关闭模态框
							$("#empAddModal").modal('hide');
							//2、来到最后一页，显示刚才保存的数据
							//发送ajax请求显示最后一页数据即可
							to_page(totalRecord);
						}else{
							//显示失败信息
							console.log(result);
							//有哪个错误信息就显示哪个字段的
							//errorFields里面没有定义就是没有出错了
							/* if (undefined != result.extend.errorFields.emial){
			                   //员工邮箱不是未定义，就显示邮箱的错误信息
			                       show_validate_msg("#email_add_input","error",result.extend.errorFields.emial);
			                 }*/
			                if (undefined != result.extend.errorFields.tallyMan){
			                     //显示邮箱的错误信息
			                       show_validate_msg("#tallyMan_add_input","error",result.extend.errorFields.tallyMan);
			                 }
			                   /* alert(result.extend.errorFields.emial);
			                   alert(result.extend.errorFields.empName);  */
						}
					}
				}); 
			});
			
			//1）、我们是按钮创建之前就绑定了click，所以绑不上
		    //1）、可以在创建按钮的时候绑定事件
		    //2）、绑定点击.live()
		    //jquery新版没有live，使用on方法进行替代
			$(document).on("click",".edit_btn",function () {
	        	//alert("edit");
				/* //1、查出部门信息，显示部门列表
		        getDepts("#empUpdateModal select"); */
		        //2、查出员工信息，显示员工信息
		        getTestReport($(this).attr("edit-id"));
		        //3、把id传递给模态框的更新按钮
		        $("#emp_update_btn").attr("edit-id",$(this).attr("edit-id"));
		        $("#empUpdateModal").modal({
		            backdrop:"static"
		        });
	        });
		    function getTestReport(id) {
		        $.ajax({
		            url:"${APP_PATH}/testReport/"+id,
		            type:"GET",
		            success:function (result) {
		                //console.log(result);
		                var Data = result.extend.testReport;
		                $("#identifyBoxNumber_update_input").val(Data.identifyBoxNumber);
		                $("#actualBoxNumber_update_input").val(Data.actualBoxNumber);
		                $("#identifyVehicleNumber_update_input").val(Data.identifyVehicleNumber);
		                $("#actualVehicleNumber_update_input").val(Data.actualVehicleNumber);
		                $("#identifyLocation_update_input").val(Data.identifyLocation);
		                $("#actualLocation_update_input").val(Data.actualLocation);
		                $("#remarks_update_input").val(Data.remarks);
		                $("#shipBridge_update_input").val(Data.shipBridge);
		                $("#tallyMan_update_input").val(Data.tallyMan);
		                
		                
		            }
		        });
		    }
		    //点击更新，更新信息
		    $("#emp_update_btn").click(function () {

		        //发送ajax请求，保存更新信息
		        $.ajax({
		            url:"${APP_PATH}/testReport/"+$(this).attr("edit-id"),
		            type:"PUT",
		            data:$("#empUpdateModal form").serialize(),
		            success:function(result) {
		                alert(result.msg);
		                $("#empUpdateModal").modal("hide");
		                to_page(currentPage);
		            }
		        });
		    });
		    //单个删除
		    $(document).on("click",".delete_btn",function () {
		       //1、弹出确认删除对话框
		        var tallyMan = $(this).parents("tr").find("td:eq(10)").text();
		       
		        var empId = $(this).attr("del-id");
		        if(confirm("确认删除【"+tallyMan+"】吗？")){
		            //确认，发送ajax请求删除
		            $.ajax({
		                url:"${APP_PATH}/testReport/"+empId,
		                type:"DELETE",
		                success:function (result) {
		                    alert(result.msg);
		                    //回到本页
		                    to_page(currentPage);
		                }
		            });
		        }
		    });
		    //完成全选/全不选功能
		    $("#check_all").click(function () {
		        var is_All_Check = $(this).prop("checked");
		        $(".check_item").prop("checked",is_All_Check);
		    });
		    //check_item，复选框选择操作
		    $(document).on("click",".check_item",function () {
		        //判断当前选择中的元素是否选满
		        var flag = $(".check_item:checked").length == $(".check_item").length;
		        $("#check_all").prop("checked",flag);
		    });
		    
		    //点击全部删除，就批量删除
		    $("#emp_delete_all_btn").click(function () {
		        var tallyMans = "";
		        var del_idstr = "";
		        $.each($(".check_item:checked"),function () {
		            //组装字符串
		            tallyMans += $(this).parents("tr").find("td:eq(10)").text()+",";
		            //组织id字符串
		            del_idstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
		        });
		        //去除tallyMans多余的","（最后一个）
		        tallyMans = tallyMans.substring(0,tallyMans.length-1);
		        //去除删除id多余的-
		        del_idstr = del_idstr.substring(0,del_idstr.length-1);
		        if (confirm("确认删除【" + tallyMans + "】吗？")) {
		            //发送ajax请求
		            $.ajax({
		                url:"${APP_PATH}/testReport/"+del_idstr,
		                type:"DELETE",
		                success:function (result) {
		                    alert(result.msg);
		                    //回到当前页面
		                    to_page(currentPage);
		                    $("#check_all").prop("checked",false);
		                }
		            })
		        }
		    });
			
	</script>
</body>
</html>