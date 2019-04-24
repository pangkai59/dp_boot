/**
 * 新增-挂地线管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workHangGround: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../work/workHangGround/save?_' + $.now(),
		    	param: vm.workHangGround,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
