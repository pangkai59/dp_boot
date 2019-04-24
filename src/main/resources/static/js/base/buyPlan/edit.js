/**
 * 编辑-js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		goodsBuyPlan: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../goods/buyPlan/info?_' + $.now(),
		    	param: vm.goodsBuyPlan.id,
		    	success: function(data) {
		    		vm.goodsBuyPlan = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../goods/buyPlan/update?_' + $.now(),
		    	param: vm.goodsBuyPlan,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})