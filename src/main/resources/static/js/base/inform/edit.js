/**
 * 编辑-系统通知管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsInform: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../goods/inform/info?_' + $.now(),
		    	param: vm.goodsInform.id,
		    	success: function(data) {
		    		vm.goodsInform = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../goods/inform/update?_' + $.now(),
		    	param: vm.goodsInform,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})