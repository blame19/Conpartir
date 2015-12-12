var cities = ["-","Bologna", "Firenze", "Genova", "Milano", "Napoli", 
          "Padova", "Pisa", "Roma", "Siena", "Torino", "Venezia", "Verona"];
$(document).ready(function(){
    populate("origin");
    populate("destination");
    
});

function populate(id){
    var parent = document.getElementById(id); 
    
    for (var i = 0; i < cities.length; i++){                
        var opt = document.createElement("option");
        opt.value= i;
        opt.innerHTML = cities[i]; // whatever property it has

        // then append it to the select element
        parent.appendChild(opt);
    }
}





