<?php
$title ="Page Delete";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';

if(!isset($_SESSION['userid']))
{
    $_SESSION['loginRedirect'] = 1;
    header("Location: login.php");
    exit();
}
elseif(isset($_SESSION['userid']) && $_SESSION['usertype'] ==1)
{

    echo '<p><a href="pagelist.php">RETURN TO PAGE LIST</a></p>';
    $showform =0;

    if(isset($_POST['delete']) && $_POST['delete'] == "YES")
    {
        //echo 'blah blah blah ' . $_POST['delete'] . ' ha ha ha';
        try
        {

            //echo $_POST['x'];
            $sql = 'DELETE FROM pages_raroman WHERE ID = :ID';
            $s = $pdo->prepare($sql);
            $s->bindValue(':ID', $_POST['x']);
            $s->execute();
        }

        catch(PDOException $e)
        {
            echo 'Error deleting from database' . $e->getMessage();
            exit();
        }
        echo '<p>The page has been deleted.</p>';

        $showform=1;
    }

    if($showform == 0)
    {

        echo 'Are you sure you want to delete page '. $_GET['x'];

        try
        {
            $sql = 'SELECT * FROM pages_raroman WHERE ID = :ID';
            $s = $pdo->prepare($sql);
            $s->bindValue(':ID', $_GET['x']);
            $s->execute();
        }
        catch (PDOException $e)
        {
            echo 'Error fetching users: ' . $e->getMessage();
            exit();
        }
        $row = $s->fetch();
        echo ' (' . $row['title']. ' ) ?';

        ?>

            <form name="pagedelete" id="pagedelete" method="post" action="pagedelete.php">

                    <input type="hidden" name="x" value="<? echo $_GET['x'];?>">
                    <input type="submit" name="delete" value="YES">
                    <input type="button" name="nodelete" value="NO" onClick="window.location = 'pagelist.php'"/>
            </form>
        <?php
        }//endshow form

    }
    else
    {
        echo'<p>This is an administrative page only.</p>';
    }

include 'footer.inc.php';
?>