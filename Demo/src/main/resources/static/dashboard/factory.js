/**
 * 
 */

function factory() {
	return {
		save : function(data, $ajax, callback) {
			callback($ajax, saveDetails, postMethod, data);
		}
	}
}
