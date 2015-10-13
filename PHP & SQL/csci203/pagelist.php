<?php
$title="Pages List";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';
require_once 'functions.inc.php';



if(!isset($_SESSION['userid']))
{
    $_SESSION['loginRedirect'] = 1;
    header("Location: login.php");
    exit();
}
elseif(isset($_SESSION['userid']) && $_SESSION['usertype'] ==1)
{
    echo '<p><a href="pageadd.php">Add A New Page</a></p>';

    try
    {
        $sql = 'SELECT * FROM pages_raroman';
        $result = $pdo->query($sql);
    }

    catch (PDOException $e)
    {
        echo 'Error fetching results:' . $e->getMessage();
        exit();
    }

    while ($row = $result->fetch())
    {
        $pages[] = array(
            'ID' => $row['ID'],
            'title' => $row['title'],
            'inputdate' => $row['inputdate']);
    }

    echo '<table>';
    echo '<th>Options</th><th>Date:</th><th>Title</th>';
    foreach($pages as $page)
    {
        echo '<tr><td><a href="pagedetails.php?x=' .$page['ID'] .'">VIEW DETAILS</a> | <a href="pageupdate.php?x=' .$page['ID'] .'">UPDATE PAGE</a> | <a href="pagedelete.php?x=' . $page['ID'] .'">DELETE PAGE</a>';
        echo '<td>' . $page['inputdate'];
        echo '<td>' . $page['title'] .'</td></tr>';
    }
    echo '</table>';
}
else
{
    echo '<p> This is an administrative page only.</p>';
}
include_once 'footer.inc.php';
?>

