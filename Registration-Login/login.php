 <?php  
 require "dbconnect.php";  
 $user_name = $_POST["login_name"];  
 $user_pass =  $_POST["login_pass"];  
 $sql_query = "SELECT fName,lName FROM Caretaker WHERE username like '$user_name' and password like '$user_pass';";  
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