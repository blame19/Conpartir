window.onload = function() {
    document.getElementById('ifCar').style.display = 'none';
    document.getElementById('ifTaxi').style.display = 'none';
}
function check() {
    if (document.getElementById('carselected').checked) {
        document.getElementById('cartype').style.display = 'block';
        document.getElementById('caryear').style.display = 'block';
        document.getElementById('from').style.display = 'block';
        document.getElementById('to').style.display = 'block';
        document.getElementById('button').style.display = 'block';
    } 
    else if(document.getElementById('taxiselected').checked) {
        document.getElementById('cartype').style.display = 'none';
        document.getElementById('caryear').style.display = 'none';
        document.getElementById('from').style.display = 'block';
        document.getElementById('to').style.display = 'block';
        document.getElementById('button').style.display = 'block';
   }
}

