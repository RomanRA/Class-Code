<?php
$title="Pages Update";
include_once 'header.inc.php';
include_once 'menu.inc.php';
require_once 'connect.php';
require_once 'functions.inc.php';


$showcontent =0;
if(!isset($_SESSION['userid']))
{
    //go log in
    $_SESSION['loginRedirect'] = 1;
    header("Location: login.php");
    exit();
}

elseif(isset($_SESSION['userid']) && $_SESSION['usertype'] ==1){
   $showcontent=1;
}

if($showcontent == 1){
    echo '<p><a href="pagelist.php">RETURN TO PAGES LIST</a></p>';
    $showform =0;
    $errormessage = "";

    if(isset($_POST['submit']))
    {
        $_GET['x'] = $_POST['x'];
        $FORMFIELD['title'] = htmlchars(cleanse($_POST['title']));
        $FORMFIELD['details'] = (cleanse($_POST['details']));

        //check for empty fields
        if ($FORMFIELD['title'] =="") {$errormessage .= "<p> TITLE IS MISSING.</p>";}
        if($FORMFIELD['details'] ==""){$errormessage .= "<p> DETAILS IS MISSING.</p>"; }

        try
        {
            $sql = 'UPDATE pages_raroman SET
                title= :title,
                details= :details
                WHERE ID = :ID';
            $s = $pdo->prepare($sql);
            $s->bindValue(':title', $FORMFIELD['title']); // using data from form
            $s->bindValue(':details', $FORMFIELD['details']); // using data from form
            $s->bindValue(':ID', $_POST['x']); // using data from form
            $s->execute();
        }
        catch(PDOException $e){

            echo 'Error Updating Page. ' . $e->getMessage();
            exit();
        }
        echo '<p>Thank you for updating your information!</p>';
        $showform = 1;
    }

if($showform == 0)
{
    try
    {
        $sql = 'SELECT * FROM pages_raroman WHERE ID = :ID';
        $s = $pdo->prepare($sql);
        $s->bindValue(':ID', $_GET['x']);
        $s->execute();
    }
    catch (PDOException $e)
    {
        echo 'Error fetching pages: ' . $e->getMessage();
        exit();
    }
    $row = $s->fetch();
?>
    <form name="pageupdate" id="pageupdate" method="post" action="pageupdate.php">
        <table>
            <input type="hidden" name="x" id="x" value="<?php echo $row['ID'];?>">
            <tr><th>Title:</th><td><input type="text" name="title" size="50" value="<?php if(isset($row['title'])){echo $row['title'];}?>"></td></tr>
            <tr><th>Details:</th><td><textarea name="details" id="bio" cols="50" row="5"><?php if(isset($row['details'])){echo $row['details'];}?></textarea></td></tr>
            <tr><th>SUBMIT</th><td><input type="submit" name="submit" value="submit"></td></tr>

        </table>
    </form>
<?php
}//showform

}//showcontent
include 'footer.inc.php';
?>