<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Product</title>
</head>

<body>
    <form method="POST" action="product.php">
        <div>
            <label for="idProduct">ID PRODUCT</label>
            <input type="text" id="idProduct" required name="idProduct" />
        </div>
        <div>
            <label for="nameProduct">NAME PRODUCT</label>
            <input type="text" id="nameProduct" required name="nameProduct" />
        </div>
        <div>
            <label for="costProduct">COST PRODUCT</label>
            <input type="text" id="costProduct" required name="costProduct" />
        </div>
        <div>
            <label for="descriptionProduct">DESCRIPTION PRODUCT</label>
            <input type="text" id="descriptionProduct" required name="descriptionProduct" />
        </div>
        <hr />
        <button type="submit">
            To Register
        </button>
        <a href="../index.php">Return</a>
    </form>
</body>

</html>