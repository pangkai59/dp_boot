/**
 * 编辑-采购门户管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsPortal: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../goods/portal/info?_' + $.now(),
		    	param: vm.goodsPortal.id,
		    	success: function(data) {
		    		vm.goodsPortal = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../goods/portal/update?_' + $.now(),
		    	param: vm.goodsPortal,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})