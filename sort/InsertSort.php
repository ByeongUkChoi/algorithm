<?php

// 삽입 정렬 (안정 정렬)
function insertSort($arr) {
    for ($i=1, $count = count($arr); $i < $count; $i++) { 
        $j = $i;
        while($j > 0) {
            if($arr[$j - 1] > $arr[$j]) {
                swap($arr[$j - 1], $arr[$j]);
            }
            $j--;
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

$result = InsertSort($arr);
echo $result === $expected;
