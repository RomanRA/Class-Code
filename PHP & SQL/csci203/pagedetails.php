<?php
$title ="Page Details";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';



/*if(!isset($_SESSION['userid']))
{
    //not logged in
    $_SESSION['loginRedirect'] = 1;
    header("Location: login.php");
    exit();
}*/

/*elseif(isset($_SESSION['userid']))
{*/if(isset($_SESSION['userid']) && $_SESSION['usertype'] ==1){
        echo '<p><a href="pagelist.php">Go to Manage Pages</a></p>';
    }

    try{
        $sql = 'SELECT * FROM pages_raroman WHERE ID = :ID';
        $s = $pdo->prepare($sql);
        $s->bindValue(':ID', $_GET['x']);
        $s->execute();
    }
    catch (PDOException $e)
    {
        echo 'Error: ' . $e->getMessage();
        exit();
    }

    $row = $s->fetch();
    echo '<table>';
    echo '<tr><th>Title</th><td>' . $row['title'] . '</td></tr>';
    echo '<tr><th>Details</th><td>' . $row['details'] . '</td></tr>';
    echo '</table>';
//}

include 'footer.inc.php';
?>
