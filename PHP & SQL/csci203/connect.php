<?php
/* CREATE A CONNECTION TO THE SERVER */
try{
    $pdo = new PDO('mysql:host=localhost;dbname=csci203sp14', 'csci203sp14', 'csci203sp14!');
    $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    $pdo->exec('SET NAMES "utf8"');
}
catch (PDOException $e)
{
    echo 'Unable to connect to the database server.' . $e->getMessage();
    exit();
}
?>