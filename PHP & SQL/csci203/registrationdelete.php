<?php
$title ="Registration Delete";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';

/*
 *
 ***********BEGIN LOGIN TOP *****************
 * CHECK TO SEE IF LOGGED IN AND USER IS ADMIN
 */
if(!isset($_SESSION['userid']))
{
    header("Location: login.php");
    exit();
}
elseif(isset($_SESSION['userid']) && $_SESSION['usertype'] ==1)
{
    /*
        ***********END LOGIN TOP *****************
    */

//THIS PAGE UPDATES THE USER INFORMATION (EXCEPT THE PASSWORD)
    echo '<p><a href="registrationlist.php">RETURN TO REGISTRATION LIST</a></p>';
//SET VARIABLES WE WILL NEED LATER
    $showform =0;


//ONCE WE HAVE PRESSED SUBMIT, DO SOMETHING....
    if(isset ($_POST['delete']) && $_POST['delete'] == "YES")
    {
        try
        {
            $sql = 'DELETE FROM registration WHERE ID = :ID';
            $s = $pdo->prepare($sql);
            $s->bindValue(':ID', $_POST['x']); // using data from form
            $s->execute();
        }
        catch(PDOException $e)
        {
            echo 'Error deleting from database' . $e->getMessage();
            exit();
        }
        //confirmation
        echo '<p>The user has been deleted.</p>';
        $showform=1;
    }

    if($showform == 0)
    {
        echo 'Are you sure you want to delete user No. ' . $_GET['x'];

        try
        {
            $sql = 'SELECT * FROM registration WHERE ID = :ID';
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
        echo ' (' . $row['first'] . ' ' . $row['last'] . ')?';

        ?>

        <form name="registrationdelete" id="registrationdelete" method="post" action="registrationdelete.php">
            <input type="hidden" name="x" value="<? echo $_GET['x'];?>">
            <input type="submit" name="delete" value="YES">
            <input type="button" name="nodelete" value="NO" onClick="window.location = 'registrationlist.php'" />
        </form>

    <?php
    }// end showform

    /*
***********BEGIN LOGIN BOTTOM *****************
*/
}//elseiflogin
else
{
    echo '<p>This is an administrative page only.</p>';
}
/*
***********BEGIN LOGIN BOTTOM *****************
*/

include_once 'footer.inc.php';
?>