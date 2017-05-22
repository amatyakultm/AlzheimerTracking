<?php
 include_once("dbconnect.php");

if(isset($_POST['sUsername']) && isset($_POST['sPassword']) && 
   isset($_POST['sfName']) && isset($_POST['slName'])&& isset($_POST['sTel'])&& isset($_POST['sEmail']))
{
$strUsername = $_POST["sUsername"];
$strPassword = $_POST['sPassword'];
$strfName = $_POST['sfName'];
$strlName = $_POST['slName'];
$strEmail = $_POST['sEmail'];
$strTel = $_POST['sTel'];
 
/*** Check Username Exists ***/
$strSQL = "SELECT * FROM Caretaker WHERE Username = '$strUsername' ";
$objQuery = mysqli_query($conn,$strSQL);
$objResult = mysqli_fetch_array($objQuery);
if($objResult)
{
$arr['StatusID'] = "0";
$arr['Error'] = "Username Exists!";
echo json_encode($arr);
exit();
}

/*** Check Email Exists ***/
$strSQL = "SELECT * FROM Caretaker WHERE Email = '$strEmail' ";
$objQuery = mysqli_query($conn,$strSQL);
$objResult = mysqli_fetch_array($objQuery);
if($objResult)
{
$arr['StatusID'] = "0";
$arr['Error'] = "Email Exists!";   
echo json_encode($arr);
exit();
}
/*** Insert ***/
	$strSQL = "INSERT INTO Caretaker(username,password,fName,lName,phoneNum,email)
	VALUES (
	'$strUsername',
	'$strPassword',
	'$strfName',
	'$strlName',
	'$strTel',
	'$strEmail'
	)
	";
	 
	$objQuery = mysqli_query($conn,$strSQL);
	if(!$objQuery)
	{
	$arr['StatusID'] = "0";
	$arr['Error'] = "Cannot save data!";   
	}
	else
	{
	$arr['StatusID'] = "1";
	$arr['Error'] = "";
	}
}
  
echo json_encode($arr);
?>