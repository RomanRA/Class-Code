<?php
require "connect.php";

$sql = 'SELECT * FROM pages_raroman';
$s = $pdo->prepare($sql);
$s->execute();
$row = $s->fetch();

echo "<a href='pagedetails.php?x={$row['ID']}'>{$row['title']}</a><br><br>";

while($row = $s->fetch())
{
    echo "<a href='pagedetails.php?x={$row['ID']}'>{$row['title']}</a><br><br>";
}
?>
