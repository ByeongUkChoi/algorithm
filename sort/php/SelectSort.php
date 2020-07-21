<?php

// 선택 정렬 (불안정 정렬)
function selectSort($arr) {
    for ($i=0, $count = count($arr); $i < $count; $i++) { 
        $minIndex = $i;
        for ($j=$i; $j < $count; $j++) { 
            if($arr[$minIndex] > $arr[$j]) {
                $minIndex = $j;
            }
        }
        if($i !== $minIndex) {
            swap($arr[$i], $arr[$minIndex]);
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

$result = selectSort($arr);
echo $result == $expected;
