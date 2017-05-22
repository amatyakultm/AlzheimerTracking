<?php  
 require "dbconnect.php";  
 $patientID = $_POST['login_id'];  
 $sql_query = "SELECT fName,lName FROM Patient WHERE ID = '$patientID';";  
 $result = mysqli_query($conn,$sql_query);  
 if(mysqli_num_rows($result) >0 )  
 {  
 $row = mysqli_fetch_assoc($result);  
 $fname =$row["fName"]; 
 $lName =$row["lName"]; 
 echo "Login Success..Welcome ".$fname;  
 }  
 else  
 {   
 echo "Login Failed.......Try Again..";  
 }  
 ?>  