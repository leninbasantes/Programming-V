<?php

require_once('../config/productDB.php');

$idProduct = $_POST['idProduct'];
$nameProduct = $_POST['nameProduct'];
$costProduct = $_POST['costProduct'];
$descriptionProduct = $_POST['descriptionProduct'];

$Product = new ProductDB();
if ($Product->save_data($idProduct, $nameProduct, $costProduct, $descriptionProduct)) {
    echo '<script type="text/javascript">
    alert("Product saved correctly");
    window.location.href="../index.php";
    </script>';
} else {
    echo "<h2>It already exist";
    return false;
}
