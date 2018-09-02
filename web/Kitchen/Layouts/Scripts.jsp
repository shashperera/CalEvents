<!-- Bootstrap core JavaScript-->
<script src="../External/Jquery/jquery.min.js"></script>
<script src="../External/Bootstrap/js/bootstrap.bundle.js"></script>
<script src="../External/Bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Core plugin JavaScript-->
<script src="../External/Jquery/jquery.easing.min.js"></script>
<!-- Page level plugin JavaScript-->
<script src="../External/Datatables/jquery.dataTables.js"></script>
<script src="../External/Datatables/dataTables.bootstrap4.js"></script>
 
<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
    if (mySidebar.style.display === 'block') {
        mySidebar.style.display = 'none';
        overlayBg.style.display = "none";
    } else {
        mySidebar.style.display = 'block';
        overlayBg.style.display = "block";
    }
}

// Close the sidebar with the close button
function w3_close() {
    mySidebar.style.display = "none";
    overlayBg.style.display = "none";
}
</script>
