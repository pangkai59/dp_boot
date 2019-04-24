/**
 * 编辑-项目档案管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsRecord: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../goods/record/info?_' + $.now(),
		    	param: vm.goodsRecord.id,
		    	success: function(data) {
		    		vm.goodsRecord = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../goods/record/update?_' + $.now(),
		    	param: vm.goodsRecord,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})