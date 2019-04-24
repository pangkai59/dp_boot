/**
 * 新增-库存管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsRepertory: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../goods/repertory/save?_' + $.now(),
		    	param: vm.goodsRepertory,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
