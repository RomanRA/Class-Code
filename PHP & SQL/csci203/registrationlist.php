<?php
$title ="Manage Registrations";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';

if(!isset($_SESSION['userid']))
{
    header("Location: login.php");
    exit();
}

    //CHECK TO SEE IF THIS USERNAME HAS ALREADY BEEN USED
    try
    {
        //If THE LOGGED IN USER IS ADMIN, PULL ALL DATA FROM THE DATABASE
        if(isset($_SESSION['userid']) && $_SESSION['usertype'] ==1)
        {
            $sql = 'SELECT * FROM registration';
            $result = $pdo->query($sql);
        }
        //IF THE LOGGED IN USER IS NOT THE ADMIN, ONLY PULL THAT USER'S INFO
        if(isset($_SESSION['userid']) && $_SESSION['usertype'] ==2)
        {
            $sql = 'SELECT * FROM registration WHERE ID = :ID';
            $result = $pdo->prepare($sql);
            $result->bindValue(':ID', $_SESSION['userid']);
            $result->execute();
        }
    }
    catch (PDOException $e)
    {
        echo 'Error fetching results: ' . $e->getMessage();
        exit();
    }

    // gather the results as they come out row by row
    // you could also use a foreach (see pg 132)
    while ($row = $result->fetch())
    {
        $registrations[] = array(
            'ID' => $row['ID'],
            'first' => $row['first'],
            'last' => $row['last'],
            'email' => $row['email']);

    }
    //now, display the results
    // foreach http://www.php.net/manual/en/control-structures.foreach.php

    echo '<table>';
    echo '<th>Options</th><th>Name</th><th>Email</th>';
    foreach ($registrations as $user)
    {
        echo '<tr><td><a href="registrationdetails.php?x=' .$user['ID'] .'">VIEW DETAILS</a> | <a href="registrationupdate.php?x=' .$user['ID'] .'">UPDATE USER</a>';
        if(isset($_SESSION['userid']) && $_SESSION['usertype'] ==1)
        {
            echo ' | <a href="registrationdelete.php?x=' .$user['ID'] .'">DELETE USER</a>';
        }
        echo '<td>' .$user['first'] . ' ' . $user['last'] . '</td><td>' . $user['email'] . '</td></tr>';
    }
    echo '</table>';
include_once 'footer.inc.php';
?>