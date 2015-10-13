<div class="nav">
    <ul id="topnav">
        <li><a href="index.php">Home</a></li>
        <li><a href="registration.php">Register</a></li>
        <li><a href="registrationlist.php">Manage Registration</a></li>
        <li><a href="pagelist.php">Manage Pages</a></li>
        <?
        //IF A USER IS LOGGED IN, ECHO THEIR NAME AND PROVIDE A LOGOUT OPTION OR ELSE, GIVE THE LOGIN OPTION
        if(isset($_SESSION['userid']))
        {
        echo '<li>Hello, ' . $_SESSION['first'] . '. <a href="logout.php">Log Out</a></li>';
        }
        else
        {
        echo "<li><a href='login.php'>Log In</a></li>";
        }
        ?>
    </ul>
</div>
<!-- THIS IS THE OPENING TAG FOR THE DIV CLASS=MAIN AND DIV CLASS=LEFT.  THE CLOSING TAGS ARE IN footer.inc.php -->
<div class="main">
    <div class="left">
