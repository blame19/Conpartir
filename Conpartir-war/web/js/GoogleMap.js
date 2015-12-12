
function initialize() {
        var mapCanvas = document.getElementById('map');
        var mapOptions = {
          center: new google.maps.LatLng(41.871132,12.454501),
          zoom: 6,
          mapTypeId: google.maps.MapTypeId.ROADMAP,
        };
        var map = new google.maps.Map(mapCanvas, mapOptions);
        
        //Listener to set markers
        google.maps.event.addListener(map, 'click', function( event ){
            setMarker(event.latLng,map);
        });
        var longpress = false;

        google.maps.event.addListener(marker,'click', function (event) {
            (longpress) ? console.log("Long Press") : console.log("Short Press");
        });



        google.maps.event.addListener(marker, 'mousedown', function(event){

                start = new Date().getTime();           
            });

        google.maps.event.addListener(marker, 'mouseup', function(event){

                end = new Date().getTime();
                    longpress = (end - start < 500) ? false : true;         

            });
}

function setMarker(latLng,map){
    var lat = latLng.lat();
    var lng = latLng.lng();
    marker = new google.maps.Marker({
          position: {lat: lat, lng: lng}, 
          map: map
    });
    console.log("LAT: " + lat + " LNG: " + lng);
}
//Google Maps Init
google.maps.event.addDomListener(window, 'load', initialize());
