/**
 * 计划编制管理表js
 */

$(function () {
	initialPage();
	getGrid();
});

function initialPage() {
	$(window).resize(function() {
		$('#dataGrid').bootstrapTable('resetView', {height: $(window).height()-54});
	});
}

function getGrid() {
	$('#dataGrid').bootstrapTableEx({
		url: '../../work/workPlanAuthorizedStrength/list?_' + $.now(),
		height: $(window).height()-54,
		queryParams: function(params){
			params.name = vm.keyword;
			return params;
		},
		columns: [
			{checkbox: true},
			{field : "planId", title : "计划id", width : "100px"}, 
			{field : "workDescribe", title : "作业描述", width : "100px"}, 
			{field : "startWorkTime", title : "作业开始时间", width : "100px"}, 
			{field : "endWorkTime", title : "作业结束时间", width : "100px"}, 
			{field : "workSite", title : "作业地点", width : "100px"}, 
			{field : "workDep", title : "作业部门", width : "100px"}, 
			{field : "planType", title : "计划类型", width : "100px"}, 
			{field : "status", title : "状态 0:禁用，1:正常", width : "100px"}, 
			{field : "check", title : "审批  0未审批 1 审批", width : "100px"}, 
			{field : "forCheck", title : "送审   0 未送审  1送审", width : "100px"}, 
			{field : "appear", title : "上报   0未上报 1已上报", width : "100px"}, 
			{field : "subscrible", title : "发布 0未发布 1已发布", width : "100px"}, 
			{field : "workType", title : "作业类型", width : "100px"}, 
			{field : "remark", title : "备注", width : "100px"}, 
			{field : "userIdCreate", title : "创建用户id", width : "100px"}, 
			{field : "gmtCreate", title : "创建时间", width : "100px"}, 
			{field : "gmtModified", title : "修改时间", width : "100px"}
		]
	})
}

var vm = new Vue({
	el:'#dpLTE',
	data: {
		keyword: null
	},
	methods : {
		load: function() {
			$('#dataGrid').bootstrapTable('refresh');
		},
		save: function() {
			dialogOpen({
				title: '新增计划编制管理表',
				url: 'base/workPlanAuthorizedStrength/add.html?_' + $.now(),
				width: '420px',
				height: '350px',
				yes : function(iframeId) {
					top.frames[iframeId].vm.acceptClick();
				},
			});
		},
		edit: function() {
			var ck = $('#dataGrid').bootstrapTable('getSelections');
			if(checkedRow(ck)){
				dialogOpen({
					title: '编辑计划编制管理表',
					url: 'base/workPlanAuthorizedStrength/edit.html?_' + $.now(),
					width: '420px',
					height: '350px',
					success: function(iframeId){
						top.frames[iframeId].vm.workPlanAuthorizedStrength.id = ck[0].id;
						top.frames[iframeId].vm.setForm();
					},
					yes: function(iframeId){
						top.frames[iframeId].vm.acceptClick();
					}
				});
			}
		},
		remove: function() {
			var ck = $('#dataGrid').bootstrapTable('getSelections'), ids = [];	
			if(checkedArray(ck)){
				$.each(ck, function(idx, item){
					ids[idx] = item.id;
				});
				$.RemoveForm({
					url: '../../work/workPlanAuthorizedStrength/remove?_' + $.now(),
			    	param: ids,
			    	success: function(data) {
			    		vm.load();
			    	}
				});
			}
		}
	}
})