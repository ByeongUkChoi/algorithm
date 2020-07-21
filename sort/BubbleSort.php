<?php

// 버블 정렬 (안정 정렬)
function bubbleSort($arr) {
    for ($i=0,$count = count($arr); $i < $count; $i++) { 
        for ($j=1; $j < $count - $i; $j++) { 
            if($arr[$j - 1] > $arr[$j]) {
                swap($arr[$j - 1], $arr[$j]);
            }
        }
    }
    return $arr;
}

function swap(&$a, &$b) {
    $tmp = $a;
    $a = $b;
    $b = $tmp;
}

// 검증
$arr = [5, 2, 1, 4, 3];
$expected = [1, 2, 3, 4, 5];

$result = bubbleSort($arr);
echo $result === $expected;
