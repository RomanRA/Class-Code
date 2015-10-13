<?php
$title="Registration";
include_once 'header.inc.php';
require_once 'connect.php';
require_once 'functions.inc.php';
include_once 'menu.inc.php';
$showform=0;
$errormessage = "";

if(isset($_POST['submit']))
{
    $FORMFIELD['first'] = htmlchars(cleanse($_POST['first']));
    $FORMFIELD['mi'] = htmlchars(cleanse($_POST['mi']));
    $FORMFIELD['last'] = htmlchars(cleanse($_POST['last']));
    $FORMFIELD['email'] = strtolower(cleanse($_POST['email']));
    $FORMFIELD['username'] = strtolower(cleanse($_POST['username']));
    $FORMFIELD['pwd'] = cleanse($_POST['pwd']);
    $FORMFIELD['pwd2'] = cleanse($_POST['pwd2']);
    $FORMFIELD['gender'] = $_POST['gender'];
    $FORMFIELD['status'] = $_POST['status'];
    $FORMFIELD['bio'] = htmlchars(cleanse($_POST['bio']));

    //check for empty fields
    if($FORMFIELD['first'] =="") {$errormessage .= "<p> FIRST NAME IS MISSING.</p>";}
    if($FORMFIELD['last'] ==""){$errormessage .= "<p> LAST NAME IS MISSING.</p>"; }
    if($FORMFIELD['email'] ==""){$errormessage .= "<p> EMAIL IS MISSING.</p>";}
    if($FORMFIELD['username'] ==""){$errormessage .= "<p> USERNAME IS MISSING.</p>";}
    if($FORMFIELD['pwd'] ==""){$errormessage .= "<p> PASSWORD IS MISSING.</p>";}
    if($FORMFIELD['pwd2'] ==""){$errormessage .= "<p> CONFIRM PASSWORD IS MISSING.</p>";}
    //Check to see if passwords match
    if($FORMFIELD['pwd'] != $FORMFIELD['pwd2']){$errormessage .="<p> THE PASSWORDS DO NOT MATCH.</p>";}
    if($FORMFIELD['gender'] ==""){$errormessage .= "<p> GENDER CANNOT BE EMPTY.</p>";}
    if($FORMFIELD['status'] ==""){$errormessage .= "<P> STATUS IS MISSING.</p>";}
    if($FORMFIELD['bio'] !=$FORMFIELD['bio']){$errormessage .="<p> YOU HAVE NOT ENTERED ANY BIO INFORMATION.</p>";}

    if(!preg_match('/^[\w\.\-]+@([\w\-]+\.)+[a-z]+$/i' , $FORMFIELD['email'])){
        $errormessage .= "<p>EMAIL IS NOT VALID</p>";
    }

    //CHECK TO SEE IF THIS USERNAME HAS ALREADY BEEN USED
    try{
        $sql = 'SELECT username FROM registration WHERE username = :username';
        $s = $pdo->prepare($sql);
        $s->bindValue(':username', $FORMFIELD['username']);
        $s->execute();
        $count = $s->rowCount();}
    catch(PDOException $e){echo 'Error fetching users: ' . $e->getMessage();exit();}
    if($count > 0){$errormessage .= 'THIS USER NAME HAS ALREADY BEEN USED.';}
    if($errormessage !=""){echo $errormessage;}
    else{
        $costParam = rand (10,15);
        $char22 = "";

        for($i=0; $i<22; $i++){
            $char22 .= substr('./ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789', mt_rand(0,63), 1);}

        $salt = '$2a$' . $costParam . '$' . $char22;
        $securepwd = crypt($FORMFIELD['pwd'],$salt);
        try{
            //Code to enter database
            $sql = 'INSERT INTO registration SET
                    first = :first,
                    mi = :mi,
                    last = :last,
                    email = :email,
                    username  = :username,
                    pwd = :pwd,
                    salt = :salt,
                    gender = :gender,
                    status = :status,
                    bio = :bio,
                    usertype = :usertype,
                    inputdate = CURDATE()';

            $s = $pdo->prepare($sql);
            $s->bindValue(':first', $FORMFIELD['first']);
            $s->bindValue(':mi', $FORMFIELD['mi']);
            $s->bindValue(':last', $FORMFIELD['last']);
            $s->bindValue(':email', $FORMFIELD['email']);
            $s->bindValue(':username', $FORMFIELD['username']);
            $s->bindValue(':pwd', $securepwd);
            $s->bindValue(':salt', $salt);
            $s->bindValue(':gender', $FORMFIELD['gender']);
            $s->bindValue(':status', $FORMFIELD['status']);
            $s->bindValue(':bio', $FORMFIELD['bio']);
            $s->bindvalue(':usertype', 2);
            $s->execute();
        }
        catch(PDOException $e){echo 'Error inserting into database' . $e->getMessage();exit();}
        echo 'Thank you! Successfully Submitted.';
        $showform =1;
    }
}

if($showform == 0)
{

?>

<form name="registration" id="registration" method="post" action="registration.php">
    <table>
        <tbody>
            <tr><th>First name:</th><td><input type="text" name="first" id="first" size="20" maxlength="20" value="<?php if(isset($FORMFIELD['first'])){echo $FORMFIELD['first'];}?>"></td></tr>
            <tr><th>Last name:</th> <td><input type="text" name="last" id="last" size="30" maxlength="30" value="<?php if(isset($FORMFIELD['last'])){echo $FORMFIELD['last'];}?>"></td></tr>
            <tr><th>Middle initial: </th><td><input type="text" name="mi" id="mi" size="1" maxlength="1" value="<?php if(isset($FORMFIELD['mi'])){echo $FORMFIELD['mi'];}?>"></td></tr>
            <tr><th>Email: </th><td><input type="text" name="email" id="email" size="45" maxlength="45" value="<?php if(isset($FORMFIELD['email'])){echo $FORMFIELD['email'];}?>"></td></tr>
            <tr><th>Username: </th><td><input type="text" name="username" id="username" size="10" maxlength="10" value="<?php if(isset($FORMFIELD['username'])){echo $FORMFIELD['username'];}?>"></td></tr>
            <tr><th>Password: </th><td><input type="password" name="pwd" id="pwd" size="15" maxlength="15" value="<?php if(isset($FORMFIELD['pwd'])){echo $FORMFIELD['pwd'];}?>"></td></tr>
            <tr><th>PasswordAgain: </th><td><input type="password" name="pwd2" id="pwd2" size="15" maxlength="15" value="<?php if(isset($FORMFIELD['pwd2'])){echo $FORMFIELD['pwd2'];}?>"></td></tr>

            <tr><th>Gender:</th><td><input type="radio" name="gender" id="genderM" value="M"<?php if(isset($FORMFIELD['gender']) && $FORMFIELD['gender'] == 'M') {echo 'checked';}?>>Male &nbsp; &nbsp; &nbsp;
                    <input type="radio"  name="gender" id="genderF" value="F"<?php if(isset($FORMFIELD['gender']) && $FORMFIELD['gender'] == 'F') {echo 'checked';}?>>Female

            <tr><th>Class Status:</th><td>
            <select name="status" id=""status>
                <option value="" <?php if(isset($FORMFIELD['status']) && $FORMFIELD['status'] == ''){echo 'selected';}?>>Choose One</option>
                <option value="FR" Freshman<?php if(isset($FORMFIELD['status']) && $FORMFIELD['status'] == 'Freshman'){echo ' selected';}?>>Freshman</option>
                <option value="SO" Sophomore<?php if(isset($FORMFIELD['status']) && $FORMFIELD['status'] == 'Sophomore'){echo ' selected';}?>>Sophmore</option>
                <option value="JR" Junior<?php if(isset($FORMFIELD['status']) && $FORMFIELD['status'] == 'Junior'){echo ' selected';}?>>Junior</option>
                <option value="SR" Senior<?php if(isset($FORMFIELD['status']) && $FORMFIELD['status'] == 'Senior'){echo ' selected';}?>>Senior</option>
            </select></td></tr>

            <tr><th>Bio:</th><td><br>
            <textarea name="bio" rows="5" cols="50"></textarea></td></tr>
            <tr><th>SUBMIT</th><td><input type="submit" name="submit" value="submit"></td></tr>
        </tbody>
    </table>
</form>


<script>
function startTime() {
    var today=new Date();
    var h=today.getHours();
    var m=today.getMinutes();
    var s=today.getSeconds();
    m = checkTime(m);
    s = checkTime(s);
    document.getElementById('text').innerHTML = h+":"+m+":"+s;
    var t = setTimeout(function(){startTime()},500);
}	
	function checkTime(i) {
    if (i<10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
}
</script>

<body onload="startTime()">

<div id="text"></div>

<?php
}//end showform

include 'footer.inc.php';
?>