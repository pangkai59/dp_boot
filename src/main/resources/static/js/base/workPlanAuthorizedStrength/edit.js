/**
 * 编辑-计划编制管理表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workPlanAuthorizedStrength: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../work/workPlanAuthorizedStrength/info?_' + $.now(),
		    	param: vm.workPlanAuthorizedStrength.id,
		    	success: function(data) {
		    		vm.workPlanAuthorizedStrength = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../work/workPlanAuthorizedStrength/update?_' + $.now(),
		    	param: vm.workPlanAuthorizedStrength,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})