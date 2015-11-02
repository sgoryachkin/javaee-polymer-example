/**
 * 
 */
Polymer({
	is : 'page-about',
	  created: function() {
		    console.log(this.localName + '#' + this.id + ' was created');
		  },

		  attached: function() {
		    console.log(this.localName + '#' + this.id + ' was attached');
		  },

		  detached: function() {
		    console.log(this.localName + '#' + this.id + ' was detached');
		  }
});
