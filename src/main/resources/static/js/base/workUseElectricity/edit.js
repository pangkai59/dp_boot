/**
 * 编辑-停送电管理js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workUseElectricity: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../work/workUseElectricity/info?_' + $.now(),
		    	param: vm.workUseElectricity.id,
		    	success: function(data) {
		    		vm.workUseElectricity = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../work/workUseElectricity/update?_' + $.now(),
		    	param: vm.workUseElectricity,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})