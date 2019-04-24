/**
 * 编辑-计划流程管理表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workPlanFlowPath: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../work/workPlanFlowPath/info?_' + $.now(),
		    	param: vm.workPlanFlowPath.id,
		    	success: function(data) {
		    		vm.workPlanFlowPath = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../work/workPlanFlowPath/update?_' + $.now(),
		    	param: vm.workPlanFlowPath,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})