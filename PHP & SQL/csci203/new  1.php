<?php
	session_start();
	
	if (isset($_POST["username"]) && isset($_POST["password"]))
	{
		// This checks if the value has ever been set, if not, declares it as zero.
		if (!isset($_SESSION["attempts"]))
			$_SESSION["attempts"] = 0;
			
		if ($_SESSION["attempts"] < 3)
		{
			$username = $_POST["username"];
			$password = $_POST["password"];
			
			if ($username = "test" && $password == "test")
			{
				echo "Hello, you are logged in.";
			}
			else
			{
				echo "You failed to log-in, try again";
				$_SESSION["attempts"] = $_SESSION["attempts"] + 1;
			}
			
		}
		else
		{
			echo "You've failed too many times, dude.";
		}
	}
?>
