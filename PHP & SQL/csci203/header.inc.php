<?php
if(!isset($_SESSION))
{
session_start();
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title><?php echo $title; ?></title>
    <link type="text/css" rel="stylesheet" href="styles.css" />
    <script src="//tinymce.cachefly.net/4.0/tinymce.min.js"></script>
    <script>
        tinymce.init({selector:'textarea'});
    </script>
</head>
<body>
<div class="currentPage">
    <h1><?php echo $title;?></h1>
</div>
<div class="currentPage">
    <img alt="Woods" src="http://3.bp.blogspot.com/-yHuAMXpqOyE/TjbdQdVRFpI/AAAAAAAAA_A/ElHO7AksDDc/s1600/Forest.jpg" height="100">
</div>
