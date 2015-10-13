<?php
$title ="Registration Update";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';
require_once 'functions.inc.php';
//THIS PAGE UPDATES THE USER INFORMATION (EXCEPT THE PASSWORD)


/*
 *
 ***********BEGIN LOGIN TOP *****************
 * CHECK TO SEE IF LOGGED IN AND USER IS ADMIN
 */
$showcontent =0;  //do not show content by default
if(isset($_POST['submit']))
{
    $_GET['x'] = $_POST['x'];
}
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
                //echo "This is user No. (" . $_GET['x'], ")";
                $showcontent = 1;
            }
            else
            {
                echo  $_GET['x'];
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
//SET VARIABLES WE WILL NEED LATER
$showform =0;
$errormessage = "";


//ONCE WE HAVE PRESSED SUBMIT, DO SOMETHING....
if(isset($_POST['submit']))
{
     $_GET['x'] = $_POST['x'];
   //SET ALL POST VARIABLES
    $FORMFIELD['first'] = htmlchars(cleanse($_POST['first']));
    $FORMFIELD['mi'] = htmlchars(cleanse($_POST['mi']));
    $FORMFIELD['last'] = htmlchars(cleanse($_POST['last']));
    $FORMFIELD['email'] = strtolower(htmlchars(cleanse($_POST['email'])));
    $FORMFIELD['username'] = strtolower(htmlchars(cleanse($_POST['username'])));
    $FORMFIELD['gender'] = $_POST['gender'];
    $FORMFIELD['status'] = $_POST['status'];
    $FORMFIELD['bio'] = cleanse($_POST['bio']);
    //check for empty fields
    if($FORMFIELD['first'] ==""){$errormessage .= "<p>FIRST NAME IS MISSING.</p>";}
    if($FORMFIELD['last'] ==""){$errormessage .= "<p>LAST NAME IS MISSING.</p>";}
    if($FORMFIELD['email'] ==""){$errormessage .= "<p>EMAIL IS MISSING.</p>";}
    if($FORMFIELD['username'] ==""){$errormessage .= "<p>USERNAME IS MISSING.</p>";}
    if($FORMFIELD['gender'] ==""){$errormessage .= "<p>GENDER IS MISSING.</p>";}
    if($FORMFIELD['status'] ==""){$errormessage .= "<p>STATUS IS MISSING.</p>";}
    if($FORMFIELD['bio'] ==""){$errormessage .= "<p>BIO IS MISSING.</p>";}

    //CHECK TO SEE IF EMAIL IS VALID
    if(!preg_match('/^[\w\.\-]+@([\w\-]+\.)+[a-z]+$/i', $FORMFIELD['email']))
    {
        $errormessage .= "<p>EMAIL IS NOT VALID</p>";
    }
    //CHECK TO SEE IF THIS USERNAME HAS ALREADY BEEN USED
    try
    {
        $sql = 'SELECT username FROM registration WHERE username = :username AND ID != :ID';
        $s = $pdo->prepare($sql);
        $s->bindValue(':username', $FORMFIELD['username']);
        $s->bindValue(':ID', $_POST['x']);
        $s->execute();
        $count = $s->rowCount();
     }
    catch (PDOException $e)
    {
        echo 'Error fetching users: ' . $e->getMessage();
        exit();
    }

    if ($count > 0)
    {
        $errormessage .= "THIS USERNAME IS ALREADY TAKEN.";
    }

    if($errormessage !="")
    {
        echo $errormessage;
        echo '<p>ERRORS!<br>**** REPOPULATING FORM USING ORIGINAL VALUES. ****</p>';
    }
    else
    {
        try
        {
        //CODE TO UPDATE DATABASE
        //NOTE:  These are not all of the same fields as the INSERT user.
            // I decided not to update the password, the user type, or the input date
        $sql = 'UPDATE registration SET
                first= :first,
                mi= :mi,
                last= :last,
                email= :email,
                username= :username,
                gender= :gender,
                status= :status,
                bio= :bio
                WHERE ID = :ID';
        $s = $pdo->prepare($sql);
        $s->bindValue(':first', $FORMFIELD['first']); // using data from form
        $s->bindValue(':mi', $FORMFIELD['mi']);  // using data from form
        $s->bindValue(':last', $FORMFIELD['last']); // using data from form
        $s->bindValue(':email', $FORMFIELD['email']); // using data from form
        $s->bindValue(':username', $FORMFIELD['username']); // using data from form
        $s->bindValue(':gender', $FORMFIELD['gender']); // using data from form
        $s->bindValue(':status', $FORMFIELD['status']); // using data from form
        $s->bindValue(':bio', $FORMFIELD['bio']); // using data from form
        $s->bindValue(':ID', $_POST['x']); // using data from form
        $s->execute();
        }
        catch(PDOException $e)
        {
            echo 'Error inserting into database' . $e->getMessage();
            exit();
        }
        //If there are no errors and the query runs, show feedback and hide the form
        //NOTE THAT I MOVED THESE TWO LINES OF CODE TO GO AFTER THE CATCH STATEMENT.
        echo '<p>Thank you for updating your information!</p>';
        $showform=1;
    }
}
if($showform == 0)
{

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
?>

    <form name="registrationupdate" id="registrationupdate" method="post" action="registrationupdate.php">
        <table>
            <tr><td>First name: </td><td><input type="text" name="first" id="first" size="20" value="<?php if(isset($row['first'])){echo $row['first'];}?>"></td></tr>
            <tr><td>Middle Initial: </td><td><input type="text" name="mi" id="mi" size="1" maxlength="1" value="<?php if(isset($row['mi'])){echo $row['mi'];}?>"></td></tr>
            <tr><td> name: </td><td><input type="text" name="last" id="last" size="30" value="<?php if(isset($row['last'])){echo $row['last'];}?>"></td></tr>
            <tr><td>Email: </td><td><input type="text" name="email" id="email" size="45" value="<?php if(isset($row['email'])){echo $row['email'];}?>"></td></tr>
            <tr><td>Username:  </td><td><input type="text" name="username" id="username" size="10" max="10" value="<?php if(isset($row['username'])){echo $row['username'];}?>"></td></tr>
            <tr><td>Gender:  </td><td><input type="radio" name="gender" id="genderM" value="M" <?php if(isset($row['gender']) && $row['gender'] == 'M'){echo ' checked';}?>>Male
        &nbsp; &nbsp; &nbsp;
        <input type="radio" name="gender" id="genderF" value="F" <?php if(isset($row['gender']) && $row['gender'] == 'F'){echo ' checked';}?>>Female</td></tr>
            <tr><td>Class Status:</td><td>
        <select name="status" id="status">
            <option value="" <?php if(isset($row['status']) && $row['status'] == ''){echo ' selected';}?>>pick one</option>
            <option value="FR" <?php if(isset($row['status']) && $row['status'] == 'FR'){echo ' selected';}?>>freshman</option>
            <option value="SO" <?php if(isset($row['status']) && $row['status'] == 'SO'){echo ' selected';}?>>sophomore</option>
            <option value="JR" <?php if(isset($row['status']) && $row['status'] == 'JR'){echo ' selected';}?>>junior</option>
            <option value="SR" <?php if(isset($row['status']) && $row['status'] == 'SR'){echo ' selected';}?>>senior</option>
        </select></td></tr>
            <tr><td>Bio</td><td><textarea name="bio" id="bio" cols="50" row="5"><?php if(isset($row['bio'])){echo $row['bio'];}?></textarea>
        <input type="hidden" name="x" id="x" value="<?php echo $row['ID'];?>"></td></tr>
            <tr><td>Submit: </td><td>
        <input type="submit" name="submit" value="submit"></td></tr>
    </table>
    </form>

<?php
}// end showform
}//showcontent
include_once 'footer.inc.php';
?>