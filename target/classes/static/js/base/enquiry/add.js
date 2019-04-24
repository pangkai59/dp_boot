/**
 * 新增-询价管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsEnquiry: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../goods/enquiry/save?_' + $.now(),
		    	param: vm.goodsEnquiry,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
