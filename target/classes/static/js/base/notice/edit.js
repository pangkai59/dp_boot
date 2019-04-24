/**
 * 编辑-公告管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsNotice: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../goods/notice/info?_' + $.now(),
		    	param: vm.goodsNotice.id,
		    	success: function(data) {
		    		vm.goodsNotice = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../goods/notice/update?_' + $.now(),
		    	param: vm.goodsNotice,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})