/**
 * 新增-计划编制管理表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workPlanAuthorizedStrength: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../work/workPlanAuthorizedStrength/save?_' + $.now(),
		    	param: vm.workPlanAuthorizedStrength,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
