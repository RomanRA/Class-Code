<?php
$title="Pages - Add New";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';
require_once 'functions.inc.php';
$showform=0;
$errormessage = "";


if(!isset($_SESSION['userid']))
{
    //not logged in
    $_SESSION['loginRedirect'] = 1;
    header("Location: login.php");
    exit();
}

elseif(isset($_SESSION['userid']) && $_SESSION['usertype'] ==1)
{

$showform= 0;
$errormessage ="";

if(isset($_POST['submit']))
{
    $FORMFIELD['title'] = htmlchars(cleanse($_POST['title']));
    $FORMFIELD['details'] = cleanse($_POST['details']);

    //check for empty fields
    if ($FORMFIELD['title'] =="") {$errormessage .= "<p> TITLE IS MISSING.</p>";}
    if($FORMFIELD['details'] ==""){$errormessage .= "<p> DETAILS IS MISSING.</p>"; }

    if($errormessage != ""){
        echo $errormessage;
    }
    else{
        try{
            $sql = 'INSERT INTO pages_raroman SET
                    title = :title,
                    details = :details,
                    inputdate = CURDATE()';

            $s = $pdo->prepare($sql);
            $s->bindValue(':title', $FORMFIELD['title']);
            $s->bindValue(':details', $FORMFIELD['details']);
            $s-> execute ();
        }
        catch(PDOException $e){
            echo 'Error inserting into database' . $e->getMessage();
        }
        echo 'Thank you! Page Successfully Created.';
        $showform=1;
        }
    }

if($showform == 0)
{
?>
    <form name="pageadd" id="pageadd" method="post" action="pageadd.php">
        <table>
            <tr><th>Title:</th><td><input type="text" name="title" size="50" value="<?php if(isset($FORMFIELD['title'])){echo $FORMFIELD['title'];}?>"></td></tr>
            <tr><th>Details:</th><td><textarea name="details" id="bio" cols="50" row="5"><?php if(isset($FORMFIELD['details'])){echo $FORMFIELD['details'];}?></textarea></td></tr>
            <tr><th>SUBMIT</th><td><input type="submit" name="submit" value="submit"></td></tr>
        </table>
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