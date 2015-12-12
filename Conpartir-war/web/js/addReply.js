window.onload = function() {
    document.getElementById('reply').style.display = 'none';
}
function addReply() {
    var elem = document.getElementById('clickreply');
    var field = document.getElementById('reply');
    elem.onclick = function(){
        field.style.display = 'block';
    };
}


