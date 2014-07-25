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
        alertError("Every fields are required");
        return false;
    }
    else {
        return true;
    }
}

