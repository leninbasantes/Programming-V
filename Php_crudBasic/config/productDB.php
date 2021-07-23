<?php
require_once("connection.php");

class ProductDB
{
    function save_data($idProduct, $nameProduct, $costProduct, $descriptionProduct)
    {
        $config = new Connection();
        $link = mysqli_connect($config->get_dbhost(), $config->get_dbuser(), $config->get_dbpass(), $config->get_dbname()) or die('Could not connect : ' . mysqli_error());
        $sql = "INSERT INTO product(idProduct, nameProduct, costProduct, descriptionProduct) VALUES ('$idProduct', '$nameProduct', '$costProduct', '$descriptionProduct')";
        $result = mysqli_query($link, "SET NAMES 'utf8'");
        $result = mysqli_query($link, $sql) or die(mysqli_error($link));
        return $result;
        mysqli_close($link);
    }
}
