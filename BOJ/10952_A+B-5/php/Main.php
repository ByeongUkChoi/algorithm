<?php

while (true) {
    fscanf(STDIN,"%d %d",$a,$b);
    if($a == 0 && $b == 0) break;
    $results[] = $a + $b;
}
foreach($results as $result) {
    fprintf(STDOUT,"%d".PHP_EOL, $result);
}
