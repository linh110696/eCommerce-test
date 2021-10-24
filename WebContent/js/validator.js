/**
 * 
 */
	function validate()  {
    	var u = document.getElementById("username").value;
        var p = document.getElementById("password").value;
        if(u== "") {
        	alert("Please enter your Username");
            return false;
        }
        if(p == "") {
            alert("Please enter you Password");
            return false;
        }
            return true;