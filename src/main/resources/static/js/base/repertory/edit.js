/**
 * 编辑-库存管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsRepertory: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../goods/repertory/info?_' + $.now(),
		    	param: vm.goodsRepertory.id,
		    	success: function(data) {
		    		vm.goodsRepertory = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../goods/repertory/update?_' + $.now(),
		    	param: vm.goodsRepertory,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})