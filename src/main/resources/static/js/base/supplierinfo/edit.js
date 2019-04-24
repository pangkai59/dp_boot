/**
 * 编辑-供应商信息管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsSupplierinfo: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../goods/supplierinfo/info?_' + $.now(),
		    	param: vm.goodsSupplierinfo.id,
		    	success: function(data) {
		    		vm.goodsSupplierinfo = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../goods/supplierinfo/update?_' + $.now(),
		    	param: vm.goodsSupplierinfo,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})