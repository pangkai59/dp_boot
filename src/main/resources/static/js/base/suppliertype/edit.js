/**
 * 编辑-项目档案管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsSuppliertype: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../goods/suppliertype/info?_' + $.now(),
		    	param: vm.goodsSuppliertype.id,
		    	success: function(data) {
		    		vm.goodsSuppliertype = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../goods/suppliertype/update?_' + $.now(),
		    	param: vm.goodsSuppliertype,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})