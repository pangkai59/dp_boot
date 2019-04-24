/**
 * 新增-采购门户管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsPortal: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../goods/portal/save?_' + $.now(),
		    	param: vm.goodsPortal,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
