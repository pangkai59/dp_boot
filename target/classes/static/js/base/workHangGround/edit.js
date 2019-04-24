/**
 * 编辑-挂地线管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workHangGround: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../work/workHangGround/info?_' + $.now(),
		    	param: vm.workHangGround.id,
		    	success: function(data) {
		    		vm.workHangGround = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../work/workHangGround/update?_' + $.now(),
		    	param: vm.workHangGround,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})