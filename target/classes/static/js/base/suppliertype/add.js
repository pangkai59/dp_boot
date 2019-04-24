/**
 * 新增-项目档案管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsSuppliertype: {
			id: 0
		}
	},
	methods : {
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.SaveForm({
		    	url: '../../goods/suppliertype/save?_' + $.now(),
		    	param: vm.goodsSuppliertype,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})
