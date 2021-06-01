<html><head><meta charset="utf-8"> </head>

<body>

<?php

$link = mysqli_connect("localhost:3309", "root", "12345678");

mysqli_select_db($link, "heritagetax");

$tildes = $link->query("SET NAMES 'utf8'"); //Para que se muestren las tildes correctamente

$result = mysqli_query($link, "SELECT * FROM user");

?>
    <table width="800" border="1">
            <tr>
                <th width="91"><div align="center">ID Number</div></th>
                <th width="91"><div align="center">First Name</div></th>
                <th width="91"><div align="center">Last Name</div></th>
                <th width="91"><div align="center">Inheritance</div></th>
                <th width="91"><div align="center">Percentage Tax on the Fraction</div></th>
                <th width="91"><div align="center">Tax on the Fraction</div></th>
            </tr>
            
<?php
while ($resultados = mysqli_fetch_array($result)){

if ($resultados !=NULL) {
    
    ?>
    
    <tr>
                <td><div align="center"><?php echo $resultados['idNumber']?></div></td>
                <td><div align="center"><?php echo $resultados['firstName']?></div></td>
                <td><div align="center"><?php echo $resultados['lastName']?></div></td>
                <td><div align="center"><?php echo $resultados['inheritance']?></div></td>
                <td><div align="center"><?php echo $resultados['pFractionalTax']?></div></td>
                <td><div align="center"><?php echo $resultados['fractionalTx']?></div></td>

            </tr>
<?php

}

}

mysqli_free_result($result);

mysqli_close($link);

?>

</body></html>