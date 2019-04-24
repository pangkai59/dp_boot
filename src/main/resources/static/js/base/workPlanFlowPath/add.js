/**
 * 新增-计划流程管理表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workPlanFlowPath: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../work/workPlanFlowPath/save?_' + $.now(),
		    	param: vm.workPlanFlowPath,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
