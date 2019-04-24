/**
 * 新增-供应商信息管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsSupplierinfo: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../goods/supplierinfo/save?_' + $.now(),
		    	param: vm.goodsSupplierinfo,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
