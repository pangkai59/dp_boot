/**
 * 新增-调度命令表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workDispatchOrder: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../work/workDispatchOrder/save?_' + $.now(),
		    	param: vm.workDispatchOrder,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
