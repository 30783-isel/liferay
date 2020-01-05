function callController(){
	
	console.log('callController');
	
	fetch('/SpringMVCExample-1.0.0-BUILD-SNAPSHOT/testarFetch')
	  .then(response => response.json())
	  .then(data => console.log(data))
}