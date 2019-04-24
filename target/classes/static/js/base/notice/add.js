/**
 * 新增-公告管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsNotice: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../goods/notice/save?_' + $.now(),
		    	param: vm.goodsNotice,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
