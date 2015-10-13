<?php
$title ="Registration Details";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';


/*
 *
 ***********BEGIN LOGIN TOP *****************
 * CHECK TO SEE IF LOGGED IN AND USER IS ADMIN
 */
$showcontent =0;  //do not show content by default
if(!isset($_SESSION['userid']))
{
    header("Location: login.php");
    exit();
}
else
{
    if($_SESSION['usertype'] == 2)
    {
        if($_SESSION['userid'] == $_GET['x'])
        {
            $showcontent = 1;
        }
        else
        {
            echo 'You are not authorized to view this content.   You are not the user.';
            $showcontent = 0;
        }
    }
    elseif($_SESSION['usertype'] == 1)
    {
        $showcontent = 1;
    }
    else
    {
        echo 'You are not authorized to view this content.  Your are not an admin';
        $showcontent = 0;
    }
}//logged in

/*
    ***********END LOGIN TOP *****************
*/
if($showcontent ==1)
{

echo '<p><a href="registrationlist.php">RETURN TO REGISTRATION LIST</a></p>';
    //CHECK TO SEE IF THIS USERNAME HAS ALREADY BEEN USED
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

    //get the results and store them in the variable
$row = $s->fetch();
echo '<table>';
echo '<tr><th>User ID</th><td>' . $row['ID'] . '</td></tr>';
echo '<tr><th>First</th><td>' . $row['first'] . '</td></tr>';
echo '<tr><th>Middle</th><td>' . $row['mi'] . '</td></tr>';
echo '<tr><th>Last</th><td>' . $row['last'] . '</td></tr>';
echo '<tr><th>Username</th><td>' . $row['username'] . '</td></tr>';
echo '<tr><th>Email</th><td>' . $row['email'] . '</td></tr>';
echo '<tr><th>Gender</th><td>' . $row['gender'] . '</td></tr>';
echo '<tr><th>Status</th><td>' . $row['status'] . '</td></tr>';
echo '<tr><th>Bio</th><td>' . $row['bio'] . '</td></tr>';
echo '</table>';

}//showcontent
include_once 'footer.inc.php';
?>