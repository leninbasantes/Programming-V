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
        $inheritance = $_POST['inheritance'];

        
        function HeritageTax ($inheritance){
            if(($inheritance>0)&&($inheritance<=71.434)){
                $valueR=(0*$inheritance)/100;
                $basic=0;
                $array = array($valueR, $basic);
            }
            if(($inheritance>71.434)&&($inheritance<=142.868)){
                $valueR=(5*$inheritance)/100;
                $basic=0;
                $array = array($valueR, $basic);
            }
            if(($inheritance>142.868)&&($inheritance<=285.737)){
                $valueR=(10*$inheritance)/100;
                $basic=3.572;
                $array = array($valueR, $basic);
            }
            if(($inheritance>285.737)&&($inheritance<=428.635)){
                $valueR=(15*$inheritance)/100;
                $basic=17.859;
                $array = array($valueR, $basic);
            }
            if(($inheritance>428.635)&&($inheritance<=571.523)){
                $valueR=(20*$inheritance)/100;
                $basic=39.293;
                $array = array($valueR, $basic);
            }
            if(($inheritance>571.523)&&($inheritance<=714.391)){
                $valueR=(25*$inheritance)/100;
                $basic=67.871;
                $array = array($valueR, $basic);
            }
            if(($inheritance>714.391)&&($inheritance<=857.240)){
                $valueR=(30*$inheritance)/100;
                $basic=103.588;
                $array = array($valueR, $basic);
            }
            if(($inheritance>857.240)){
                $valueR=(35*$inheritance)/100;
                $basic=146.443;
                $array = array($valueR, $basic);
            }
            return $array;
        }
        


$servername = "localhost:3309";
$database = "heritagetax";
$username = "root";
$password = "12345678";
// Create connection
$conn = mysqli_connect($servername, $username, $password, $database);
// Check connection
if (!$conn) {
      die("Connection failed: " . mysqli_connect_error());
}
 
echo "Connected successfully";
$array=HeritageTax($inheritance);
$sql = "INSERT INTO user (idNumber,firstName,lastName,inheritance,pFractionalTax,fractionalTx) VALUES ('$idNumber','$firstName','$lastName','$inheritance','$array[0]','$array[1]')";
if (mysqli_query($conn, $sql)) {
      echo "New record created successfully";
} else {
      echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}
mysqli_close($conn);
        ?>
        
    </br>
        <a href="data.php">See table</a>   
    </body>
</html>
