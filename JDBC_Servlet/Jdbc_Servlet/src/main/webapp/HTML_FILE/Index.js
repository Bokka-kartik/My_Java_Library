function toggleFields() {
	const val =
		document.querySelector('input[name="a"]:checked').value;

	const c = document.getElementById("b");

	if (val === "yes") {
		c.style.display = "block";
	} else {
		c.style.display = "none";
	}
}


function value1() {
	const val1 =
		document.querySelector('input[name="a"]:checked').value;


	const d = document.getElementById("find");

	if (val1 ==="yes") {

		d.style.display="block";
	}
	else{
		d.style.display="none";
	}
}
