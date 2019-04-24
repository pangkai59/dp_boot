/**
 * 编辑-动火令表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workFireOrder: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../work/workFireOrder/info?_' + $.now(),
		    	param: vm.workFireOrder.id,
		    	success: function(data) {
		    		vm.workFireOrder = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../work/workFireOrder/update?_' + $.now(),
		    	param: vm.workFireOrder,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})