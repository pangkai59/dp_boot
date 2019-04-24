/**
 * 停送电管理js
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
		url: '../../work/workUseElectricity/list?_' + $.now(),
		height: $(window).height()-54,
		queryParams: function(params){
			params.name = vm.keyword;
			return params;
		},
		columns: [
			{checkbox: true},
			{field : "userElectricityName", title : "停送电单名称", width : "100px"}, 
			{field : "userElectricitySite", title : "停送电区域", width : "100px"}, 
			{field : "userElectricityStartTime", title : "停送电开始时间", width : "100px"}, 
			{field : "userElectricityEndTime", title : "停送电结束时间", width : "100px"}, 
			{field : "workType", title : "类型", width : "100px"}, 
			{field : "status", title : "状态 0:禁用，1:正常", width : "100px"}, 
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
				title: '新增停送电管理',
				url: 'base/workUseElectricity/add.html?_' + $.now(),
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
					title: '编辑停送电管理',
					url: 'base/workUseElectricity/edit.html?_' + $.now(),
					width: '420px',
					height: '350px',
					success: function(iframeId){
						top.frames[iframeId].vm.workUseElectricity.id = ck[0].id;
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
					url: '../../work/workUseElectricity/remove?_' + $.now(),
			    	param: ids,
			    	success: function(data) {
			    		vm.load();
			    	}
				});
			}
		}
	}
})