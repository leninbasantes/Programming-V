<?php
require_once("../config/connection.php");
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>

    <table border="1" width="100%">
        <tr>
            <th width="1%">IdProduct</th>
            <th width="14%">Name</th>
            <th width="14%">Description</th>
            <th width="14%">Cost</th>
        </tr>
        <?php
        $config = new Connection();
        $link = mysqli_connect($config->get_dbhost(), $config->get_dbuser(), $config->get_dbpass(), $config->get_dbname()) or die('No pudo conectarse : ' . mysqli_error());
        $sql = "select * from product";
        $result = mysqli_query($link, $sql);
        while ($row = mysqli_fetch_object($result)) {
        ?>
            <tr>
                <td><?php echo $row->idProduct; ?></td>
                <td><?php echo $row->nameProduct; ?></td>
                <td><?php echo $row->costProduct; ?></td>
                <td><?php echo $row->descriptionProduct; ?></td>
            </tr>
        <?php
        } ?>
    </table>
    <a href="../index.php">To return</a>
</body>

</html>