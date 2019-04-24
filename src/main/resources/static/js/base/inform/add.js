/**
 * 新增-系统通知管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsInform: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../goods/inform/save?_' + $.now(),
		    	param: vm.goodsInform,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
