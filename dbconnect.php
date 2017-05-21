<?php
$servername = "mysql.hostinger.in.th"; //replace it with your database server name
$username = "u950006267_wj";  //replace it with your database username
$password = "12345678";  //replace it with your database password
$dbname = "u950006267_wj";
// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);
// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}
?>