/**
 * 编辑-询价管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsEnquiry: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../goods/enquiry/info?_' + $.now(),
		    	param: vm.goodsEnquiry.id,
		    	success: function(data) {
		    		vm.goodsEnquiry = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../goods/enquiry/update?_' + $.now(),
		    	param: vm.goodsEnquiry,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})