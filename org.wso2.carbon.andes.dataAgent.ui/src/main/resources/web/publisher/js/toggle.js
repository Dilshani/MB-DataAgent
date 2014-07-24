/**
 * Created by dilshani on 7/20/14.
 */

function toggleTable() {
    if (document.getElementById("enable_check").checked) {
        var nodes = document.getElementById("toggle").getElementsByTagName('*');
        for (var i = 0; i < nodes.length; i++) {
            nodes[i].disabled = false;
        }

    } else {
        var nodes = document.getElementById("toggle").getElementsByTagName('*');
        for (var i = 0; i < nodes.length; i++) {
            nodes[i].disabled = true;
        }
    }
}
window.onload = toggleTable;



function alertMessage(value) {


    CARBON.showInfoDialog(value);

}



function button(){
    alertMessage("got it");
    var url = "/carbon/publisher/dataAgentServlet";
    var params = "param1=asdf&param2=1234";
    var myCallback = {
        success: function(o) {/* success handler code */},
        failure: function(o) {/* failure handler code */}
        /* ... */
    };
    var transaction = YAHOO.util.Connect.asyncRequest(
        'POST', url, myCallback, params);


}

