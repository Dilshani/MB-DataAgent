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

function alertError(value) {


    CARBON.showErrorDialog(value);

}


function DoValidation() {

    var x = document.forms["details_form"]["password"].value;
    var y = document.forms["details_form"]["username"].value;
    var z = document.forms["details_form"]["ip_address"].value;
    var c = document.forms["details_form"]["port_num"].value;

    if (x == null || x == "" || c == null || c == "" || y == null || y == "" || z == null || z == "") {
        alertError("Please make sure that all properties are filled");
        return false;
    }
    else {

        return true;
    }
}

function validateURL() {

    var xmlhttp;
    var ip = document.getElementById("ip_address").value;
    var port = document.getElementById("port_num").value;
    if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp = new XMLHttpRequest();
    }
    else {// code for IE6, IE5
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            if (xmlhttp.responseText) {
                if ((xmlhttp.responseText) == "true") {
                    alertMessage("URL validate Successful");
                } else {

                    alertError("URL validate Failed");
                }
            } else {

                alertError(xmlhttp.responseText);

            }
        }
    };
    xmlhttp.open("GET", "/carbon/publisher/URLValidateServlet?ip=" + ip + "&port=" + port, true);
    xmlhttp.send();

}