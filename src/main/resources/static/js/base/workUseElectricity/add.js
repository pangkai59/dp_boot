/**
 * 新增-停送电管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workUseElectricity: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../work/workUseElectricity/save?_' + $.now(),
		    	param: vm.workUseElectricity,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
