<?php
$title ="Login";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';
require_once 'functions.inc.php';


$showform = 0;
$errormessage = "";

if(isset ($_POST['submit']))
{

    //CLEANSE DATA THE SAME AS THE REGISTRATION PAGE
    $FORMFIELD['username'] = strtolower(htmlchars(cleanse($_POST['username'])));
    $FORMFIELD['pwd'] = cleanse($_POST['pwd']);

    //CHECKING FOR EMPTY FIELDS THE SAME AS THE REGISTRATION PAGE
    if($FORMFIELD['username'] ==""){$errormessage .= "<p>USERNAME IS MISSING.</p>";}
    if($FORMFIELD['pwd'] ==""){$errormessage .= "<p>PASSWORD IS MISSING.</p>";}


    //display error

    if($errormessage !="")
    {
        echo $errormessage;
    }
    else
    {
        //GET THE USERNAME AND SALT FROM THE DATABASE
        try
        {
            $sql = 'SELECT username, salt FROM registration WHERE username = :username';
            $s = $pdo->prepare($sql);
            $s->bindValue(':username', $FORMFIELD['username']);
            $s->execute();
            $count = $s->rowCount();
        }
        catch (PDOException $e)
        {
            echo 'Error fetching users: ' . $e->getMessage();
            exit();
        }
        //if query okay, see if there is a result
        if ($count < 1)
        {
            echo  "<p>NO SUCH USERNAME.</p>";
        }
        else
        {
            $row = $s->fetch();
            $confirmedusername = $row['username'];
            $confirmedsalt = $row['salt'];
            //rehash password using unique salt from dbase for the user and passoword from form
            $securepwd = crypt($FORMFIELD['pwd'],$confirmedsalt);

            try
            {
                $sql2 = 'SELECT * FROM registration
                             WHERE username = :username
                             AND pwd = :pwd';
                $s2 = $pdo->prepare($sql2);
                $s2->bindValue(':username', $confirmedusername);
                $s2->bindValue(':pwd', $securepwd);
                $s2->execute();
                $count2 = $s2->rowCount();
            }
            catch (PDOException $e2)
            {
                echo 'Error fetching users 2: ' . $e2->getMessage();
                exit();
            }

            $row2 = $s2->fetch();
            if ($count2 != 1)
            {
                echo "The username and password combination you entered is not correct.  Please try again.";
            }
            else
            {
                $_SESSION['userid']= $row2['ID'];
                $_SESSION['username'] = $confirmedusername;
                $_SESSION['first'] = $row2['first'];
                $_SESSION['usertype'] = $row2['usertype'];
                $showform = 1;
                header("Location: index.php");
            }
        }//username exists
}//else errormessage



}//ifisset

if($showform ==0)
{
?>
<p>Please log in to access restricted areas.</p>
<form name="loginForm" id="loginForm" method="post" action="login.php">
    <table>
        <tr>
            <td><label for="username">Username:</label></td>
            <td><input type="text" name="username" id="username" size="10" maxlength="10"> (limit 10 characters)
                </td>
            </tr>
            <tr>
            	<td><label for="pwd">Password:</label></td>
                <td><input type="password" name="pwd" id="pwd" size="15" /></td>
            </tr>
           		<td>Submit:</td>
                <td><input type="submit" name="submit" value="submit" /></td>
           </tr>
           </table>
		</form>
<?php
}//showform
include_once 'footer.inc.php';
?>