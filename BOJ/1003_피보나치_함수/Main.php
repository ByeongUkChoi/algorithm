<?php

for($i = 0; $i <= 40; $i++) {
    if($i <= 1)
        $fibonacciArr[$i] = $i;
    else {
        $fibonacciArr[$i] = $fibonacciArr[$i - 1] + $fibonacciArr[$i - 2];
    }
}
fscanf(STDIN,"%d",$count);

for($i = 0; $i < $count; $i++) {
    fscanf(STDIN,"%d",$inputs[$i]);
}
for($i = 0; $i < $count; $i++) {
    if($inputs[$i] == 0)
        fprintf(STDOUT,"1 0".PHP_EOL);
    else
        fprintf(STDOUT,"%d %d".PHP_EOL, $fibonacciArr[$inputs[$i] - 1], $fibonacciArr[$inputs[$i]]);
}
