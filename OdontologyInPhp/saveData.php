<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        $firstName = $_POST['firstName'];
        $lastName = $_POST['lastName'];
        $idNumber = $_POST['idNumber'];
        $phone = $_POST['phone'];
        $direction = $_POST['direction'];
        $single = $_POST['single'];
        $married= $_POST['married'];
        $windower = $_POST['windower'];



$servername = "localhost:3309";
$database = "odontology";
$username = "root";
$password = "12345678";
// Create connection
$conn = mysqli_connect($servername, $username, $password, $database);
// Check connection
if (!$conn) {
      die("Connection failed: " . mysqli_connect_error());
}
 
echo "Connected successfully";
 
$sql = "INSERT INTO employee (firstName,lastName,idNumber,phoneNumber,direction,single,married,widower) VALUES ('$firstName','$lastName','$idNumber','$phone','$direction','$single','$married','$windower')";
if (mysqli_query($conn, $sql)) {
      echo "New record created successfully";
} else {
      echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}
mysqli_close($conn);
        ?>
    </body>
</html>
