console.log(solution(5, [[1, 2], [4, 2], [3, 1], [4, 5]]));
console.log(solution(7, [[1, 2], [4, 2], [3, 1], [4, 5], [6, 7]]));

function solution(n, relaction) {
    // 친구 번호 모음
    var friendIdList = Array.from(Array(n), () => []);

    // 친구 번호들 담기
    for (var i in relaction) {
        friendIdList[relaction[i][0] - 1].push(relaction[i][1]);
        friendIdList[relaction[i][1] - 1].push(relaction[i][0]);
    }

    var answer = Array.from(Array(n), () => 0);
    // 각자 돌면서 친구의 친구 수 더하기(친구의 친구가 나도 포함됨)
    for (var i = 0; i < n; i++) {
        for (var j in friendIdList[i]) {
            answer[i] += friendIdList[friendIdList[i][j] - 1].length;
        }
    }
    return answer;
}