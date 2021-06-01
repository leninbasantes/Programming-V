<html><head><meta charset="utf-8"> </head>

<body>

<?php

$link = mysqli_connect("localhost:3309", "root", "12345678");

mysqli_select_db($link, "odontology");

$tildes = $link->query("SET NAMES 'utf8'"); //Para que se muestren las tildes correctamente

$result = mysqli_query($link, "SELECT * FROM employee");

?>
    <table width="800" border="1">
            <tr>
                <th width="91"><div align="center">ID Patient</div></th>
                <th width="91"><div align="center">First Name</div></th>
                <th width="91"><div align="center">Last Name</div></th>
                <th width="91"><div align="center">Id Number</div></th>
                <th width="91"><div align="center">Phone Number</div></th>
                <th width="91"><div align="center">Direction</div></th>
                <th width="91"><div align="center">Single</div></th>
                <th width="91"><div align="center">Married</div></th>
                <th width="91"><div align="center">Widower</div></th>
            </tr>
            
<?php
while ($resultados = mysqli_fetch_array($result)){

if ($resultados !=NULL) {
    
    ?>
    
    <tr>
                <td><div align="center"><?php echo $resultados['idEmployee']?></div></td>
                <td><div align="center"><?php echo $resultados['firstName']?></div></td>
                <td><div align="center"><?php echo $resultados['lastName']?></div></td>
                <td><div align="center"><?php echo $resultados['idNumber']?></div></td>
                <td><div align="center"><?php echo $resultados['phoneNumber']?></div></td>
                <td><div align="center"><?php echo $resultados['direction']?></div></td>
                <td><div align="center"><?php echo $resultados['single']?></div></td>
                <td><div align="center"><?php echo $resultados['married']?></div></td>
                <td><div align="center"><?php echo $resultados['widower']?></div></td>

            </tr>
<?php

}

}

mysqli_free_result($result);

mysqli_close($link);

?>

</body></html>