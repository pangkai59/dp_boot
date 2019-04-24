/**
 * 新增-动火令表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workFireOrder: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../work/workFireOrder/save?_' + $.now(),
		    	param: vm.workFireOrder,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
