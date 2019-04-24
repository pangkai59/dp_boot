/**
 * 编辑-施工请销点表js
 */
var vm = new Vue({
	el:'#dpLTE',
	data: {
		workForSite: {
			id: 0
		}
	},
	methods : {
		setForm: function() {
			$.SetForm({
				url: '../../work/workForSite/info?_' + $.now(),
		    	param: vm.workForSite.id,
		    	success: function(data) {
		    		vm.workForSite = data;
		    	}
			});
		},
		acceptClick: function() {
			if (!$('#form').Validform()) {
		        return false;
		    }
		    $.ConfirmForm({
		    	url: '../../work/workForSite/update?_' + $.now(),
		    	param: vm.workForSite,
		    	success: function(data) {
		    		$.currentIframe().vm.load();
		    	}
		    });
		}
	}
})