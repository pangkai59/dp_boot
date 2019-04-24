/**
 * 编辑-调度命令表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workDispatchOrder: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../work/workDispatchOrder/info?_' + $.now(),
		    	param: vm.workDispatchOrder.id,
		    	success: function(data) {
		    		vm.workDispatchOrder = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../work/workDispatchOrder/update?_' + $.now(),
		    	param: vm.workDispatchOrder,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})